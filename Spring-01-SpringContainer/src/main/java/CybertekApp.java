import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class CybertekApp {

    public static void main(String[] args) {
        // BeanFactory container = new ClassPathXmlApplicationContext("config.xml"); // we are using xml configuration because...

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        // Mentor mentor = new FullTimeMentor();  new keywordunu kullanmak istemiyoruz...

        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");  // bean id yi giriyoruz....

        mentor.createAccount();

        Mentor mentor2 = container.getBean("partTimeMentor", Mentor.class);

        mentor2.createAccount();
    }
}
