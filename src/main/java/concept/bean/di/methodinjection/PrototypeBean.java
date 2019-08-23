package concept.bean.di.methodinjection;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
/***
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-method-injection
 */
public class PrototypeBean {

    @Override
    public String toString() {
        return "This is a prototype bean: "+this.hashCode();
    }
}
