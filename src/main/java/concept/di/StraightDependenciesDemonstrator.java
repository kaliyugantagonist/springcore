package concept.di;

import concept.bean.entities.animalplanet.Cat;
import concept.container.BeanListingContainer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StraightDependenciesDemonstrator {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");

        Cat catBean = context.getBean(Cat.class, "Exotic Shorthair","Garfield", 15);

        System.out.println(catBean+" hashCode:"+catBean.hashCode());

        catBean.printSound();
    }
}
