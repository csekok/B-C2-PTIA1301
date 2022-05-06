package register;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassHistory {
    String author() default "Anonymous";
    String createdOn();
    String lastModifiedOn();
}
