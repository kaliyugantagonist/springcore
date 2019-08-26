package concept.container.di.lifecycle;

import concept.bean.di.lifecycle.InitDestructCallbackBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-lifecycle
 */
public class BeanInitDestructCallbackDemonstrator {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("concept.*");
        InitDestructCallbackBean initDestructCallbackBean = context.getBean(InitDestructCallbackBean.class);
        //TODO: While both delegate call to doClose(), find the usage scenarios for close() and registerShutdownHook
        //context.close();
        context.registerShutdownHook();
    }
}
