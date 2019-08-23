package concept.di;

import concept.bean.di.MixedDependenciesBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-ref-element
 */
public class MixedDependenciesDemonstrator {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");
        MixedDependenciesBean mixedDependenciesBean = context.getBean(MixedDependenciesBean.class,2000, "Breed");

        System.out.println(mixedDependenciesBean);
    }
}
