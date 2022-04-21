package mouse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface PluginInformation {
    String platform();
    String name();
    String author();
    String version() default "1.0";
    String description() default "";
    SupportedGame game();

    @interface SupportedGame {
        String serial();
        String version() default "Any";
        String hash() default "";
    }
}
