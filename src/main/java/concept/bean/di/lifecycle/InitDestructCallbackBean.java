package concept.bean.di.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-lifecycle
 */
public class InitDestructCallbackBean {

    @PostConstruct
    void initializeBean(){
        System.out.println(this.getClass().getSimpleName()+ " is created, now initializing it.");
    }

    @PreDestroy
    void destroyBean(){
        System.out.println(this.getClass().getSimpleName()+ " will be destroyed soon.");
    }
}
