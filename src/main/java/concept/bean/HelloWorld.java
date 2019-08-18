package concept.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public void printMessage(){
        System.out.println("This is a POJO converted to a Bean");
    }
}
