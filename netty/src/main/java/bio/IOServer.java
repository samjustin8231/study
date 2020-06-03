package bio;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sunyajun
 * @date 2020/4/20 1:46 PM
 */
public class IOServer {

    public static void main(String[] args) throws Exception {
        System.out.println("====> server start ... ");

        ServerSocket serverSocket = new ServerSocket(8000);

        // (1) 接收新连接线程
        new Thread(() -> {
            while (true) {
                try {
                    System.out.println("=====> server listen client...");
                    // (1) 阻塞方法获取新的连接
                    Socket socket = serverSocket.accept();

                    // (2) 每一个新的连接都创建一个线程，负责读取数据
                    new Thread(() -> {
                        System.out.println("====> 监听到client... ");
                        try {
                            int len;
                            byte[] data = new byte[1024];
                            InputStream inputStream = socket.getInputStream();
                            // (3) 按字节流方式读取数据
                            while ((len = inputStream.read(data)) != -1) {
                                System.out.println("=====> read data:" + new String(data, 0, len));

                            }
                        } catch (IOException e) {
                        }
                    }).start();

                } catch (IOException e) {
                }

            }
        }).start();
    }
}
