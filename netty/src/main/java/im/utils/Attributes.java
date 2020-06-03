package im.utils;

import io.netty.util.AttributeKey;

/**
 * @author sunyajun
 * @date 2020/4/20 3:25 PM
 */
public interface Attributes {
    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");
}
