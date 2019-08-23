package concept.container;

import concept.bean.HelloWorldBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorldContainer {

    public static void main(String [] args){

        //This is a container
        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");

        BeanListingContainer beanListingContainer = new BeanListingContainer();
        beanListingContainer.printBeanDefinitions(context);

        System.out.println("****************************************************");

        HelloWorldBean helloWorldBean = context.getBean(HelloWorldBean.class);

        helloWorldBean.printMessage();

        System.out.println(helloWorldBean.hashCode());
    }
}
