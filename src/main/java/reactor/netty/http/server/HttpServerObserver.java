package reactor.netty.http.server;

import reactor.netty.Connection;
import reactor.netty.ConnectionObserver;

/**
 * HttpServerObserver
 *
 * @author liyixin
 */
public interface HttpServerObserver extends ConnectionObserver {

    /**
     * Invoked when the request was received
     */
    default void onRequestReceived(Connection connection) {}
}
