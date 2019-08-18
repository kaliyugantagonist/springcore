package concept.container;

import concept.bean.HelloWorld;
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

        PrototypeScopeBean prototypeScopeBean4 = contextOne.getBean(PrototypeScopeBean.class);
        System.out.println(prototypeScopeBean4.hashCode());

        PrototypeScopeBean prototypeScopeBean5 = contextOne.getBean(PrototypeScopeBean.class);
        System.out.println(prototypeScopeBean5.hashCode());

        PrototypeScopeBean prototypeScopeBean6 = contextOne.getBean(PrototypeScopeBean.class);
        System.out.println(prototypeScopeBean6.hashCode());

    }

    /***
     * Refer: https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-scopes-singleton
     * Note the printed hash codes of the beans.
     */
    private static void demonstrateSingletonScope(){
        //This is a container
        ApplicationContext contextOne = new AnnotationConfigApplicationContext("concept.bean");
        System.out.println("**********Container-1");

        HelloWorld helloWorld1 = contextOne.getBean(HelloWorld.class);
        System.out.println(helloWorld1.hashCode());

        HelloWorld helloWorld2 = contextOne.getBean(HelloWorld.class);
        System.out.println(helloWorld2.hashCode());

        HelloWorld helloWorld3 = contextOne.getBean(HelloWorld.class);
        System.out.println(helloWorld3.hashCode());

        //This is a container
        ApplicationContext contextTwo = new AnnotationConfigApplicationContext("concept.bean");
        System.out.println("**********Container-2");

        HelloWorld helloWorld4 = contextTwo.getBean(HelloWorld.class);
        System.out.println(helloWorld4.hashCode());

        HelloWorld helloWorld5 = contextTwo.getBean(HelloWorld.class);
        System.out.println(helloWorld5.hashCode());

        HelloWorld helloWorld6 = contextTwo.getBean(HelloWorld.class);
        System.out.println(helloWorld6.hashCode());
    }
}
