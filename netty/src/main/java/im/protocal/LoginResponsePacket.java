package im.protocal;

import lombok.Data;

import static im.protocal.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
