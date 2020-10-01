import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Administrator
 */
//定义注解的作用域
@Target({ElementType.TYPE,ElementType.METHOD})
//定义注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnoTest {
    String name();
    //设置默认值
    String pwd() default "123";
}
