package im.protocal;

import lombok.Data;

import static im.protocal.Command.MESSAGE_REQUEST;

/**
 * @author sunyajun
 * @date 2020/4/20 3:23 PM
 */
@Data
public class MessageRequestPacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
