package concept.environment;

import concept.bean.environment.PropertySourceUtilizerBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceDemonstrator {

    public static void main(String[] args) {

        //This is a container
        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");

        PropertySourceUtilizerBean propertySourceUtilizerBean = context.getBean(PropertySourceUtilizerBean.class);
        //Set an environment variable in IntelliJ viz. sampleKey = sampleValue and call printDemoProperties()
        propertySourceUtilizerBean.printDemoProperties();

    }
}
