import beans.AppConfig;
import beans.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        Calculator contextBean = applicationContext.getBean(Calculator.class);
        contextBean.summ(4,5);
        //PROXY EXAMPLE
        System.out.println(applicationContext.getBean("calculator").getClass());
        System.out.println(Calculator.class.getClass());

        Calculator calculator = new Calculator();

        System.out.println(calculator.getClass().toString().equals(applicationContext.getBean("calculator").getClass().toString()));

    }
}
