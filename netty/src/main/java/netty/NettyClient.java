package netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author sunyajun
 * @date 2020/4/20 2:16 PM
 */
public class NettyClient {

    private static final int MAX_RETRY = 5;

    public static void main(String[] args) throws InterruptedException {
        Bootstrap bootstrap = new Bootstrap();
        NioEventLoopGroup group = new NioEventLoopGroup();

        bootstrap
                // 1.指定线程模型
                .group(group)
                // 2.指定 IO 类型为 NIO
                .channel(NioSocketChannel.class)
                .attr(AttributeKey.newInstance("clientKey"), "clientValue")
                // 3.IO 处理逻辑
                .handler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel ch) {
                        System.out.println("=====> init client channel ...");
//                        ch.pipeline().addLast(new StringEncoder());

                        Attribute<String> clientKey = ch.attr(AttributeKey.valueOf("clientKey"));
                        System.out.println("=====> get client attr, clientKey:" + clientKey);
                        ch.pipeline().addLast(new FirstClientHandler());
                    }
                });


        // 失败重连
        Channel channel = connectAndRetryIfFailed(bootstrap, "127.0.0.1", 1000, MAX_RETRY);

//        while (true) {
//            System.out.println("=====> send data");
//            channel.writeAndFlush(new Date() + ": hello world!");
//            Thread.sleep(2000);
//        }
    }

    /**
     * 失败重连
     *
     * @param bootstrap
     * @param host
     * @param port
     * @param retry
     * @return
     */
    private static Channel connectAndRetryIfFailed(Bootstrap bootstrap, String host, int port, int retry) {
        Channel channel = bootstrap.connect(host, port).addListener(future -> {
            if (future.isSuccess()) {
                System.out.println("=====> client 连接成功!");
            } else if (retry == 0) {
                System.err.println("=====> 重试次数已用完，放弃连接！");
            } else {
                // 第几次重连
                int order = (MAX_RETRY - retry) + 1;
                // 本次重连的间隔
                int delay = 1 << order;
                System.err.println("=====> " + new Date() + ": 连接失败，第" + order + "次重连……");
                bootstrap.config().group().schedule(() -> connectAndRetryIfFailed(bootstrap, host, port, retry - 1), delay, TimeUnit
                        .SECONDS);
            }
        }).channel();
        return channel;
    }
}
