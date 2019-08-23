package concept.bean.entities.animalplanet;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    private String breed;
    private String name;
    private int lifeSpan;

    @Override
    public void printSound() {
        System.out.println("Bhow! Bhow!! Bhow!!!");
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
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
