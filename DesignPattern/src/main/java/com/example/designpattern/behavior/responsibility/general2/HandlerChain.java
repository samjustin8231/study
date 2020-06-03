package com.example.designpattern.behavior.responsibility.general2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyajun
 * @date 2020/4/14 5:02 PM
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    /**
     * 让所有的handler处理，直到某一个处理完成
     */
    public void handle() {

        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
