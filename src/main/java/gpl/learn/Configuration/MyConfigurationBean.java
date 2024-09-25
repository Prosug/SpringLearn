package gpl.learn.Configuration;

import gpl.learn.Bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(MyOperationDependecy myOperationDependecy){
        return new MyBeanImplementTwo(myOperationDependecy);
    }
    @Bean
    public MyOperationDependecy operationSum(){
        return  new MyOperationImplement();
    }


}
