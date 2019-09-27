package reactor.netty;

/**
 * SimpleConnectionObserver
 *
 * @author liyixinC
 */
public class SimpleConnectionObserver implements ConnectionObserver {

    protected final ConnectionObserver obs;

    public SimpleConnectionObserver(ConnectionObserver obs) {
        this.obs = obs;
    }

    @Override
    public void onStateChange(Connection connection, State newState) {

    }

    @Override
    public void onConnected(Connection connection) {
        obs.onConnected(connection);
    }

    @Override
    public void onConfigured(Connection connection) {
        obs.onConfigured(connection);
    }

    @Override
    public void onAcquired(Connection connection) {
        obs.onAcquired(connection);
    }

    @Override
    public void onReleased(Connection connection) {
        obs.onReleased(connection);
    }

    @Override
    public void onDisconnecting(Connection connection) {
        obs.onDisconnecting(connection);
    }
}
