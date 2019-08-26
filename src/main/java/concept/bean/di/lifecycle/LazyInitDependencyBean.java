package concept.bean.di.lifecycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Lazy
@Component
/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-lazy-init
 */
public class LazyInitDependencyBean {

    @PostConstruct
    public void onInit(){
        System.out.println("DI done for "+this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "This lazy bean is a dependency in a eagerly-initialized bean}";
    }
}
