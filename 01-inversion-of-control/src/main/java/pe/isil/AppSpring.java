package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = app.getBean("student", Student.class);
        student.sayHello();

        Teacher teacher = app.getBean("teacher", Teacher.class);
        teacher.sayHello();

        student.sayGoodBye();
        teacher.sayGoodBye();

    }

}
