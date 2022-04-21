package mouse;

import java.io.Closeable;

public interface KisuPlugin extends Closeable {
    void init();
    void onTick(KisuEnvironment env);
    void close();
}
