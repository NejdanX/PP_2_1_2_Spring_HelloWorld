import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hwBean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hwBean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println("hwBean1 == hwBean2? " + hwBean1.equals(hwBean2));
        System.out.println("catBean1 == catBean2? " + catBean1.equals(catBean2));
    }
}