package com.example.codedesign.authentication;

/**
 * 账号密码存储
 *
 * @author sunyajun
 * @date 2020/4/28 5:16 下午
 */
public interface CredentialStorage {
    /**
     * 根据appId获取私钥
     *
     * @param appId
     * @return
     */
    String getPasswordByAppId(String appId);
}
