
import cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        // we are calling the init method...it happens automaticly


        Course course1 = container.getBean("java", Course.class);
        course1.getTeachingHours();


        // we are calling the destroy method...
        ((ClassPathXmlApplicationContext)container).close();
    }
}
