import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println(bean.equals(bean1));
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.getMessage());
        System.out.println(cat2.getMessage());

    }
}