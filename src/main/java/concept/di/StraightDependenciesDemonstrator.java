package concept.di;

import concept.bean.entities.animalplanet.Cat;
import concept.container.BeanListingContainer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StraightDependenciesDemonstrator {

    public static void main(String[] args) {

        BeanListingContainer beanListingContainer = new BeanListingContainer();

        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");

        /*beanListingContainer.printBeanDefinitions(context);
        System.out.println("*********************************************");*/

        Cat catBean = context.getBean(Cat.class, "Exotic Shorthair","Garfield", 15);

        //Note: The creation of catBean doesn't change the number of named beans
        /*beanListingContainer.printBeanDefinitions(context);
        System.out.println("*********************************************");*/

        System.out.println(catBean+" hashCode:"+catBean.hashCode());

        catBean.printSound();
    }
}
