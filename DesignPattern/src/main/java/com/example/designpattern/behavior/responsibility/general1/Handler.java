package com.example.designpattern.behavior.responsibility.general1;

/**
 * @author sunyajun
 * @date 2020/4/14 4:57 PM
 */
public abstract class Handler {

    protected Handler nextHandler = null;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理的模板框架，自己先处理，处理不了，下一个处理
     */
    public final void handle() {
        boolean handled = doHandle();

        // 自己处理不了，交给下一个处理
        if (nextHandler != null && !handled) {
            nextHandler.handle();
        }
    }

    /**
     * 自己处理的方法，返回是否处理完成
     *
     * @return
     */
    protected abstract boolean doHandle();
}
