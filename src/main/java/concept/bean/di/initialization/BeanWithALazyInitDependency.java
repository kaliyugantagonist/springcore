package concept.bean.di.initialization;

import concept.bean.entities.animalplanet.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-lazy-init
 */
public class BeanWithALazyInitDependency {

    @Autowired
    private Dog dog;

    @Autowired
    private LazyInitDependencyBean lazyInitDependencyBean;

    @Override
    public String toString() {
        return "BeanWithALazyInitDependency{" +
                "dog=" + dog +
                ", lazyInitBean=" + lazyInitDependencyBean +
                '}';
    }
}
