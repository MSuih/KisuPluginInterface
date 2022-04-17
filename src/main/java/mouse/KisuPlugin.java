package mouse;

import pinej.PineClient;

public interface KisuPlugin {

    PluginInformation getInfo();

    /**
     * Called when injector is attached to emulator.
     */
    void onLaunch(PineClient client);
    /**
     * Called when injector is detached from emulator. Can be used for cleanup.
     */
    void onClose(PineClient client);

    /**
     * Called every once in a while
     */
    void onStep(PineClient client);


}
