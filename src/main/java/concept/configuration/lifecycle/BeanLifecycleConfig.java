package concept.configuration.lifecycle;

import concept.bean.di.lifecycle.BeanWithInitDestrMethods;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanLifecycleConfig {

    /**
     * https://docs.spring.io/spring-framework/docs/current/javadoc-api/index.html?org/springframework/context/annotation/Bean.html
     * @return
     */
    @Bean(initMethod = "initializeBean", destroyMethod = "destroyBean")
    public BeanWithInitDestrMethods getBeanWithInitDestrMethods(){
        return new BeanWithInitDestrMethods();
    }
}
