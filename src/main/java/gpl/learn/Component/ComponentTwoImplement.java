package gpl.learn.Component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("HELLO, OTHE VERSION FROM OTHER COMPONENT");
    }
}
