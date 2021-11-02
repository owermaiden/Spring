
import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        // Prototype example
        Course course1 = container.getBean("java", Course.class);
        Course course2 = container.getBean("java", Course.class);

        System.out.println("Pointing to the same object:" + (course1 == course2));
        System.out.println("Memory location of course1 :" + course1);
        System.out.println("Memory location of course2 :" + course2);

        // Singleton Example..
        Course course3 = container.getBean("selenium", Course.class);
        Course course4 = container.getBean("selenium", Course.class);

        System.out.println("Pointing to the same object:" + (course3 == course4));
        System.out.println("Memory location of course3 :" + course3);
        System.out.println("Memory location of course4 :" + course4);

    }
}
