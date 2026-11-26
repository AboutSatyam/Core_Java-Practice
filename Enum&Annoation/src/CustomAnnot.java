import java.lang.annotation.*;

public class CustomAnnot {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface MyAnnotation {

        String name();

        int version() default 1;
    }
}