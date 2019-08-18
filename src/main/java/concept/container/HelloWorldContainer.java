package concept.container;

import concept.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldContainer {

    public static void main(String [] args){

        //This is a container
        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");

        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        helloWorld.printMessage();
    }
}
