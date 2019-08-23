package concept.di.initialization;

import concept.bean.di.initialization.LazyInitStandaloneBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-lazy-init
 */
public class LazyInitDependencyDemonstrator {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");

        System.out.println("*******************************************************");

        LazyInitStandaloneBean lazyInitStandaloneBean = context.getBean(LazyInitStandaloneBean.class);
        System.out.println(lazyInitStandaloneBean);

    }
}
