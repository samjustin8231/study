package im.protocal;

import lombok.Data;

/**
 * @author sunyajun
 * @date 2020/4/20 2:37 PM
 */
@Data
public abstract class Packet {
    /**
     * 协议版本
     */
    private Byte version = 1;


    public abstract Byte getCommand();
}
