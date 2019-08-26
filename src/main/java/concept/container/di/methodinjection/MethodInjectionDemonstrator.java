package concept.container.di.methodinjection;

import concept.bean.di.methodinjection.SingletonBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-method-injection
 */
public class MethodInjectionDemonstrator {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");

        SingletonBean singletonBeanOne = context.getBean(SingletonBean.class);
        System.out.println(singletonBeanOne);
        System.out.println(singletonBeanOne.getPrototypeBean());

        SingletonBean singletonBeanTwo = context.getBean(SingletonBean.class);
        System.out.println(singletonBeanTwo);
        System.out.println(singletonBeanTwo.getPrototypeBean());

    }
}
