package com.example.codedesign.authentication;

import lombok.Data;

/**
 * token
 *
 * @author sunyajun
 * @date 2020/4/28 5:17 下午
 */
@Data
public class AuthToken {
    private String token;
    private Long timestamp;

    public AuthToken(String token, Long timestamp) {
        this.token = token;
        this.timestamp = timestamp;
    }

    /**
     * 根据url, appId, password, timestamp生成token
     *
     * @param originalUrl
     * @param appId
     * @param password
     * @param timestamp
     * @return
     */
    public static AuthToken generate(String originalUrl, String appId, String password, long timestamp) {
        return null;
    }

    /**
     * 判断token是否过期
     *
     * @return
     */
    public boolean isExpired() {
        return true;
    }

    /**
     * 判断token是否匹配
     *
     * @param clientAuthToken
     * @return
     */
    public boolean match(AuthToken clientAuthToken) {
        return true;
    }
}
