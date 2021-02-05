import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat murka = (Cat) applicationContext.getBean("cat");
        murka.setAge((byte) 12);
        murka.setName("Murka");
        Cat barsik = (Cat) applicationContext.getBean("cat");
        barsik.setAge((byte) 40);
        barsik.setName("Barsik");
        System.out.println(bean == bean2);
        System.out.println(barsik == murka);
    }
}