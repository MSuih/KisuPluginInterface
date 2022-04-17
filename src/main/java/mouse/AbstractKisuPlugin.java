package mouse;

import pinej.PineClient;

/**
 * Abstract class which does nothing by default. Implementers can override methods to add functionality without having to implement everything.
 */
public abstract class AbstractKisuPlugin implements KisuPlugin {
    private final PluginInformation info;

    public AbstractKisuPlugin(PluginInformation info) {
        this.info = info;
    }

    @Override
    public PluginInformation getInfo() {
        return info;
    }

    @Override
    public void onLaunch(PineClient client) {

    }

    @Override
    public void onClose(PineClient client) {

    }

    @Override
    public void onStep(PineClient client) {

    }
}
