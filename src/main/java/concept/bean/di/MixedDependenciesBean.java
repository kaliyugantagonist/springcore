package concept.bean.di;

import concept.bean.entities.animalplanet.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MixedDependenciesBean {

    @Autowired
    private Dog dog;

    private int count;
    private String groupName;

    public MixedDependenciesBean() {
    }

    public MixedDependenciesBean(int count, String groupName) {
        this.count = count;
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "MixedDependenciesBean{" +
                "dog=" + dog +
                ", count=" + count +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
