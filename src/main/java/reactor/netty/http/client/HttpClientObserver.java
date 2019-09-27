package reactor.netty.http.client;

import reactor.netty.Connection;
import reactor.netty.ConnectionObserver;

/**
 * HttpClientObserver
 *
 * @author liyixin
 */
public interface HttpClientObserver extends ConnectionObserver {

    /**
     * Invoked when the request has been sent
     *
     * @param connection the connection reference
     */
    default void onRequestSent(Connection connection) {
    }


    /**
     * Invoked when the request has been sent but the response has not been fully received and the
     * connection has prematurely closed
     *
     * @param connection the connection reference
     */
    default void onResponseIncomplete(Connection connection) {
    }


    /**
     * Invoked when the response status and headers have been received
     *
     * @param connection the connection reference
     */
    default void onResponseReceived(Connection connection) {
    }

}
