package gpl.learn.Configuration;

import gpl.learn.Bean.myBeanProperties;
import gpl.learn.Bean.myBeanPropertiesImp;
import gpl.learn.Pojo.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;
    @Value("${value.apellido}")
    private String apellido;

    @Bean
    public myBeanProperties fuction(){
        return new myBeanPropertiesImp(name,apellido);
    }
}
