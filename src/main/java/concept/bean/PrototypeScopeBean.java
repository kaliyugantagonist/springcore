package concept.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.BeanDefinitionDsl;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-scopes-prototype
 */
public class PrototypeScopeBean {

    public void printMessage(){
        System.out.println("This is a bean with the prototype scope.");
    }
}
