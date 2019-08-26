package concept.container.di.lifecycle;

import concept.bean.di.lifecycle.BeanWithInitDestrMethods;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAnnotationLifecycleDemonstrator {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("concept.*");
        BeanWithInitDestrMethods beanWithInitDestrMethods = context.getBean(BeanWithInitDestrMethods.class);

        context.registerShutdownHook();
    }
}
