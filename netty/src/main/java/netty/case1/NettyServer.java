package netty.case1;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

/**
 * NettyServer
 *
 * @author sunyajun
 * @date 2020/4/20 2:13 PM
 */
public class NettyServer {

    public static final int START_PORT = 1000;

    public static void main(String[] args) {
        // Server引导类
        ServerBootstrap serverBootstrap = new ServerBootstrap();

        // bossGroup表示监听端口，accept 新连接的线程组
        NioEventLoopGroup boss = new NioEventLoopGroup();
        // workerGroup表示处理每一条连接的数据读写的线程组
        NioEventLoopGroup worker = new NioEventLoopGroup();

        serverBootstrap
                // 设置线程组
                .group(boss, worker)
                // 指定我们服务端的 IO 模型为NIO；如果你想指定 IO 模型为 BIO，那么这里配置上OioServerSocketChannel.class类型即可
                .channel(NioServerSocketChannel.class)
                .attr(AttributeKey.newInstance("serverName"), "nettyServer")
                // handler()用于指定在服务端启动过程中的一些逻辑
                .handler(new ChannelInitializer<NioServerSocketChannel>() {
                    protected void initChannel(NioServerSocketChannel ch) {
                        System.out.println("=====> 服务端启动中");

                        Attribute<String> serverNameAttr = ch.attr(AttributeKey.valueOf("serverName"));
                        System.out.println("=====> get server attr, serverName:" + serverNameAttr);
                    }
                })
                .childAttr(AttributeKey.newInstance("clientKey"), "clientValue")
                // childHandler()用于指定处理新连接数据的读写处理逻辑
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    protected void initChannel(NioSocketChannel ch) {
                        System.out.println("=====> init client Channel...");

                        Attribute<String> clientKey = ch.attr(AttributeKey.valueOf("clientKey"));
                        System.out.println("=====> get client attr, clientKey:" + clientKey);

                        // ch.pipeline() 返回的是和这条连接相关的逻辑处理链，采用了责任链模式
                        // addLast() 方法 添加一个逻辑处理器
                        ch.pipeline().addLast(new FirstServerHandler());
                    }
                });


        // 从开始端口向下找可以绑定的端口进行绑定
        bind(serverBootstrap, START_PORT);
    }

    /**
     * 从开始端口向下找可以绑定的端口进行绑定
     *
     * @param serverBootstrap
     * @param startPort       开始端口
     */
    private static void bind(final ServerBootstrap serverBootstrap, final int startPort) {
        serverBootstrap.bind(startPort).addListener(new GenericFutureListener<Future<? super Void>>() {
            public void operationComplete(Future<? super Void> future) {
                if (future.isSuccess()) {
                    System.out.println("=====> server 端口[" + startPort + "]绑定成功!");
                } else {
                    System.err.println("=====> server 端口[" + startPort + "]绑定失败!");
                    // 绑定失败，端口号+1
                    bind(serverBootstrap, startPort + 1);
                }
            }
        });
    }
}
