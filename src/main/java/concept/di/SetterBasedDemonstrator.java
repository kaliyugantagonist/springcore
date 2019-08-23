package concept.di;

import concept.bean.di.SetterBasedDIBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterBasedDemonstrator {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("concept.bean");
        SetterBasedDIBean setterBasedDIBean = context.getBean(SetterBasedDIBean.class);

        setterBasedDIBean.invokeDependencyMethod();
    }
}
