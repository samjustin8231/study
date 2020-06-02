package com.example.codedesign.authentication;

/**
 * @author sunyajun
 * @date 2020/4/28 5:15 下午
 */
public class DefaultApiAuthenticatorImpl implements ApiAuthenticator {

    private CredentialStorage credentialStorage;

    public DefaultApiAuthenticatorImpl() {
        this.credentialStorage = new MysqlCredentialStorage();
    }

    public DefaultApiAuthenticatorImpl(CredentialStorage credentialStorage) {
        this.credentialStorage = credentialStorage;
    }

    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.buildFromUrl(url);
        auth(apiRequest);
    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        String token = apiRequest.getToken();
        long timestamp = apiRequest.getTimestamp();
        String originalUrl = apiRequest.getOriginalUrl();

        // 封装AuthToken
        AuthToken clientAuthToken = new AuthToken(token, timestamp);

        // 判断token是否过期
        if (clientAuthToken.isExpired()) {
            throw new RuntimeException("Token is expired.");
        }

        // 根据appId获取password
        String password = credentialStorage.getPasswordByAppId(appId);
        // 根据url, appId, password, timestamp生成token
        AuthToken serverAuthToken = AuthToken.generate(originalUrl, appId, password, timestamp);
        // 判断token是否匹配
        if (!serverAuthToken.match(clientAuthToken)) {
            // token不匹配，拒绝访问
        }
    }
}