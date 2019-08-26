package concept.container.di;

import concept.bean.di.SetterBasedDIBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-setter-injection
 */
public class SetterBasedDIDemonstrator {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");
        SetterBasedDIBean setterBasedDIBean = context.getBean(SetterBasedDIBean.class);

        setterBasedDIBean.invokeDependencyMethod();
    }
}
