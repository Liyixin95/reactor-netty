package example;

import reactor.core.publisher.Mono;
import reactor.netty.DisposableServer;
import reactor.netty.http.server.HttpServer;
import reactor.netty.tcp.TcpServer;

/**
 * HttpServerExample
 *
 * @author liyixin
 * @date 2019/9/25
 */
public class HttpServerExample {

    public static void main(String[] args) {
        final DisposableServer block = HttpServer
                .create()
                .host("localhost").port(88)
                .handle((req, res) -> {
                    System.out.println(req == res);
                    return res.sendString(Mono.just("hello"));
                })
                .bind()
                .block();
        block.onDispose().block();
    }
}
