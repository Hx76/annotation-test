import java.lang.annotation.Annotation;

public class MainTest {
    @AnnoTest(name = "haha")
    static public void print(){
        System.out.println();
    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Annotation[] annotations = Class.forName("MainTest")
                .getMethod("print")
                .getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
            if (annotation instanceof AnnoTest){
                System.out.println("姓名："+ ((AnnoTest) annotation).name()+",密码："+ ((AnnoTest) annotation).pwd());
            }
        }
    }
}
