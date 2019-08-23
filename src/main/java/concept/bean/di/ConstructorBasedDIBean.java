package concept.bean.di;

import concept.bean.entities.animalplanet.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedDIBean {

    private Dog dog;

    //Mark the constructor as Autowired
    @Autowired
    public ConstructorBasedDIBean(Dog dog) {
        this.dog = dog;
    }

    public void invokeDependencyMethod(){
        dog.printSound();
    }
}
