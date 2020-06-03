package im.utils;

import io.netty.channel.Channel;
import io.netty.util.Attribute;

/**
 * @author sunyajun
 * @date 2020/4/20 3:27 PM
 */
public class LoginUtil {
    public static void markAsLogin(Channel channel) {
        channel.attr(Attributes.LOGIN).set(true);
    }

    public static boolean hasLogin(Channel channel) {
        Attribute<Boolean> loginAttr = channel.attr(Attributes.LOGIN);

        return loginAttr.get() != null;
    }
}
