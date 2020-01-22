package concept.bean.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("./demo.properties")
public class PropertySourceUtilizerBean {

    @Value("${sampleKey}")
    private String demoProperty;

    @Autowired
    Environment environment;

    public void printDemoProperties(){
        System.out.println(demoProperty);
        System.out.println("Printing environment: "+environment);
        System.out.println("JAVA_HOME: "+environment.getProperty("JAVA_HOME"));
    }
}
