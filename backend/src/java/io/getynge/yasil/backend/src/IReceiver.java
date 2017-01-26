package io.getynge.yasil.backend.src;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by spark on 1/25/17.
 */
public interface IReceiver {
    /**
     * Connects the receiver to the supplied input and output streams.
     * All supplied streams MUST be open, and they must not be closed
     * by any object other than the receiver
     * @param in The input stream to read source code from
     * @param out The output stream to print results to
     * @throws IOException when either stream is closed or corrupted
     */
    public void connect(InputStream in,OutputStream out) throws IOException;

    /**
     * Begins the process of reading the input and producing some kind of output
     * If connection is started in interactive mode, then input will be parsed as it arrives
     * If connection is started in non-interactive mode, the input is pre-parsed, and is executed
     * following the definition of a main function.
     * @param interactive whether or not to start in interactive mode
     * @throws IllegalStateException when start is called before connect
     */
    public void start(boolean interactive) throws IllegalStateException;
}
