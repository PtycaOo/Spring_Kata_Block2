import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat cat1 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(cat1.getName());

        Cat cat2 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(cat2.getName());

        System.out.println(bean == bean2);
        System.out.println(cat1 == cat2);

    }
}