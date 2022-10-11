package org.xnio.http;

import java.io.IOException;

/**
 * Exception that is thrown when a valid HTTP response is
 * received that is not an proxy connect or redirect response.
 */
public class ProxyConnectFailedException extends IOException {

    private static final long serialVersionUID = 3835377492285698832L;

    /**
     * Constructs a new {@code ProxyConnectFailedException} instance.  The message is left blank ({@code null}), and no cause
     * is specified.
     */
    public ProxyConnectFailedException() {
    }

    /**
     * Constructs a new {@code ProxyConnectFailedException} instance with an initial message.  No cause is specified.
     *
     * @param msg the message
     */
    public ProxyConnectFailedException(final String msg) {
        super(msg);
    }

    /**
     * Constructs a new {@code ProxyConnectFailedException} instance with an initial cause.  If a non-{@code null} cause is
     * specified, its message is used to initialize the message of this {@code ProxyConnectFailedException}; otherwise the
     * message is left blank ({@code null}).
     *
     * @param cause the cause
     */
    public ProxyConnectFailedException(final Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new {@code ProxyConnectFailedException} instance with an initial message and cause.
     *
     * @param msg the message
     * @param cause the cause
     */
    public ProxyConnectFailedException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
