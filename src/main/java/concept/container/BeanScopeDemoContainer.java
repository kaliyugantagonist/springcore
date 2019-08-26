package concept.container;

import concept.bean.HelloWorldBean;
import concept.bean.PrototypeScopeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeDemoContainer {

    public static void main(String [] args){
        demonstrateSingletonScope();
        System.out.println("**********************************************************************");
        demonstratePrototypeScope();
    }

    /**
     * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-scopes-prototype
     * Note the printed hash codes of the beans.
     */
    private static void demonstratePrototypeScope() {

        System.out.println("Demonstrating prototype scope");

        //This is a container
        ApplicationContext contextOne = new AnnotationConfigApplicationContext("concept.bean");
        System.out.println("**********Container-1");

        PrototypeScopeBean prototypeScopeBean1 = contextOne.getBean(PrototypeScopeBean.class);
        System.out.println(prototypeScopeBean1.hashCode());

        PrototypeScopeBean prototypeScopeBean2 = contextOne.getBean(PrototypeScopeBean.class);
        System.out.println(prototypeScopeBean2.hashCode());

        PrototypeScopeBean prototypeScopeBean3 = contextOne.getBean(PrototypeScopeBean.class);
        System.out.println(prototypeScopeBean3.hashCode());


        //This is a container
        ApplicationContext contextTwo = new AnnotationConfigApplicationContext("concept.bean");
        System.out.println("**********Container-2");

        PrototypeScopeBean prototypeScopeBean4 = contextTwo.getBean(PrototypeScopeBean.class);
        System.out.println(prototypeScopeBean4.hashCode());

        PrototypeScopeBean prototypeScopeBean5 = contextTwo.getBean(PrototypeScopeBean.class);
        System.out.println(prototypeScopeBean5.hashCode());

        PrototypeScopeBean prototypeScopeBean6 = contextTwo.getBean(PrototypeScopeBean.class);
        System.out.println(prototypeScopeBean6.hashCode());


    }

    /***
     * Refer: https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-scopes-singleton
     * Note the printed hash codes of the beans.
     */
    private static void demonstrateSingletonScope(){
        System.out.println("Demonstrating singleton scope.");

        //This is a container
        ApplicationContext contextOne = new AnnotationConfigApplicationContext("concept.bean");
        System.out.println("**********Container-1");

        HelloWorldBean helloWorldBean1 = contextOne.getBean(HelloWorldBean.class);
        System.out.println(helloWorldBean1.hashCode());

        HelloWorldBean helloWorldBean2 = contextOne.getBean(HelloWorldBean.class);
        System.out.println(helloWorldBean2.hashCode());

        HelloWorldBean helloWorldBean3 = contextOne.getBean(HelloWorldBean.class);
        System.out.println(helloWorldBean3.hashCode());

        //This is a container
        ApplicationContext contextTwo = new AnnotationConfigApplicationContext("concept.bean");
        System.out.println("**********Container-2");

        HelloWorldBean helloWorldBean4 = contextTwo.getBean(HelloWorldBean.class);
        System.out.println(helloWorldBean4.hashCode());

        HelloWorldBean helloWorldBean5 = contextTwo.getBean(HelloWorldBean.class);
        System.out.println(helloWorldBean5.hashCode());

        HelloWorldBean helloWorldBean6 = contextTwo.getBean(HelloWorldBean.class);
        System.out.println(helloWorldBean6.hashCode());
    }
}
