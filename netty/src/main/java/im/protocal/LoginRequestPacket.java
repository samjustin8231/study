package im.protocal;

import lombok.Data;

import static im.protocal.Command.LOGIN_REQUEST;

/**
 * @author sunyajun
 * @date 2020/4/20 2:38 PM
 */
@Data
public class LoginRequestPacket extends Packet {

    private String userId;

    private String username;

    private String password;


    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
