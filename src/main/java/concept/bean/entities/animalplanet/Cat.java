package concept.bean.entities.animalplanet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cat implements Animal {

    private String breed;
    private String name;
    private int lifeSpan;

    public Cat() {

    }

    public Cat(String breed, String name, int lifeSpan) {
        this.breed = breed;
        this.name = name;
        this.lifeSpan = lifeSpan;
    }

    @Override
    public void printSound() {
        System.out.println("Meow!!!");

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
