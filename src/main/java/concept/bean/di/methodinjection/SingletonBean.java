package concept.bean.di.methodinjection;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/***
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-method-injection
 */
public class SingletonBean {

    @Lookup
    public PrototypeBean getPrototypeBean() {
        return null;
    }

    @Override
    public String toString() {
        return "This is a singleton bean: "+this.hashCode();
    }
}
