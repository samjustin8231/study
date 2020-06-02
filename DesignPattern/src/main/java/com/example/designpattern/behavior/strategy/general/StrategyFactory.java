package com.example.designpattern.behavior.strategy.general;

import java.util.HashMap;
import java.util.Map;

/**
 * 一般会通过类型（type）来判断创建哪个策略来使用。为了封装创建逻辑，我们需要对客户端代码屏蔽创建细节。我们可以把根据 type 创建策略的逻辑抽离出来，放到工厂类中
 *
 * @author sunyajun
 * @date 2020/4/14 11:49 AM
 */
public class StrategyFactory {
    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}
