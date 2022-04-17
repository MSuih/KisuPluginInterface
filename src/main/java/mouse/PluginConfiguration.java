package mouse;

public record PluginConfiguration(MouseMovementMode movementMode) {
    public enum MouseMovementMode {
        RELATIVE, ABSOLUTE, NONE
    }
}
