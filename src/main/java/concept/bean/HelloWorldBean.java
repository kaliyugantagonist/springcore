package concept.bean;

import org.springframework.stereotype.Component;

//If an annotation like this is absent, Spring can't detect this 'bean' and throw org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'concept.bean.HelloWorldBean' available
@Component
public class HelloWorldBean {

    public void printMessage(){
        System.out.println("This is a POJO converted to a Bean");
    }
}
