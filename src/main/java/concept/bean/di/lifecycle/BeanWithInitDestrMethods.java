package concept.bean.di.lifecycle;

public class BeanWithInitDestrMethods {

    /**
     * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-lifecycle-initializingbean
     */
    void initializeBean(){
        System.out.println(this.getClass().getSimpleName()+ " is created, now initializing it.");
    }

    /**
     * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-lifecycle-disposablebean
     */
    void destroyBean(){
        System.out.println(this.getClass().getSimpleName()+ " will be destroyed soon.");
    }
}
