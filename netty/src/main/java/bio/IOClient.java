package bio;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @author sunyajun
 * @date 2020/4/20 1:49 PM
 */
public class IOClient {

    public static void main(String[] args) {
        System.out.println("====> server start ... ");

        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        Thread.sleep(2000);
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        System.out.println("====> client write data... ");
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();
    }
}
