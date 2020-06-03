package com.example.designpattern.behavior.responsibility.sensitiveword;

import lombok.Data;

/**
 * @author sunyajun
 * @date 2020/4/14 5:06 PM
 */
@Data
public class Content {

    private String content;

    public Content(String content) {
        this.content = content;
    }
}
