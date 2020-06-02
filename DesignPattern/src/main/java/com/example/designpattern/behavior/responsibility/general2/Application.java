package com.example.designpattern.behavior.responsibility.general2;

/**
 * @author sunyajun
 * @date 2020/4/14 5:03 PM
 */
public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
