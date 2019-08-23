package concept.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * https://docs.spring.io/spring-framework/docs/current/javadoc-api/
 */
public class BeanListingContainer {

    public static void main(String[] args) {
        new BeanListingContainer().printBeanDefinitions();
    }

    public void printBeanDefinitions(){
        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");

        String [] beans = context.getBeanDefinitionNames();

        for(String bean : beans){
            System.out.println(bean+" : "+bean.hashCode());
        }
    }

    public void printBeanDefinitions(ApplicationContext context){
        String [] beans = context.getBeanDefinitionNames();

        for(String bean : beans){
            System.out.println(bean+" : "+bean.hashCode());
        }
    }
}
