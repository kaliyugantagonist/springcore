package concept.bean.di;

import concept.bean.entities.animalplanet.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedDIBean {

    private Dog dog;

    //Mark the setter method as Autowired
    @Autowired
    public void setDog(Dog dog){
        this.dog = dog;
    }

    public void invokeDependencyMethod(){
        dog.printSound();
    }
}
