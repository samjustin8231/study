package im.protocal;

import lombok.Data;

import static im.protocal.Command.MESSAGE_RESPONSE;

/**
 * @author sunyajun
 * @date 2020/4/20 3:24 PM
 */
@Data
public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
