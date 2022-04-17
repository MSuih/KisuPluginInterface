package mouse;

import pinej.PineClient;
import pinej.PineEnums;

public record PluginInformation(PineEnums.TargetPlatform platform, String name, String author, String moduleVersion,
                                String gameSerial, String gameHash, String gameVersion, String description) {

    public boolean isValidFor(PineClient.GameInfo info) {
        if (gameSerial != null && !gameSerial.equals(info.id())) {
            return false;
        }
        if (gameHash != null && gameHash.equals(info.uuid())) {
            return false;
        }
        if (gameVersion != null && gameVersion.equals(info.version())) {
            return false;
        }
        return true;
    }
}
