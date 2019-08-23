package concept.di;

import concept.bean.di.ConstructorBasedDIBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-constructor-injection
 */
public class ConstructorBasedDIDemonstrator {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");
        ConstructorBasedDIBean constructorBasedDIBean = context.getBean(ConstructorBasedDIBean.class);

        constructorBasedDIBean.invokeDependencyMethod();
    }

}
