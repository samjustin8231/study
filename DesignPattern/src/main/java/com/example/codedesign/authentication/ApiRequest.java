package com.example.codedesign.authentication;

import lombok.Data;

/**
 * @author sunyajun
 * @date 2020/4/28 5:15 下午
 */
@Data
public class ApiRequest {

    private String appId;
    private String token;
    private Long timestamp;
    private String originalUrl;


    public static ApiRequest buildFromUrl(String url) {

        return null;
    }
}
