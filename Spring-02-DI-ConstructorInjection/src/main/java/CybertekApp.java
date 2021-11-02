import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course javaCourse = container.getBean("java", Course.class);
        javaCourse.getTeachingHours();

    }
}
