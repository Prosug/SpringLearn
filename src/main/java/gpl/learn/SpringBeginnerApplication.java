package gpl.learn;

import gpl.learn.Bean.MyBean;
import gpl.learn.Bean.myBeanProperties;
import gpl.learn.Component.ComponentDependency;
import gpl.learn.Pojo.UserPojo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeginnerApplication implements CommandLineRunner {
    //vamos a inyectar la dependencias
    private ComponentDependency componentDependency;
    private MyBean myBean;
    private myBeanProperties myBeanProperties;
    private UserPojo userPojo;

    public SpringBeginnerApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean,
                                     myBeanProperties myBeanProperties, UserPojo userPojo){
        this.componentDependency=componentDependency;
        this.myBean=myBean;
        this.myBeanProperties=myBeanProperties;
        this.userPojo=userPojo;
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBeginnerApplication.class, args);
    }

    //el metodo RUN, ejecuta en la aplicacion lo que nosotros queramos.
    @Override
    public void run(String... args) throws Exception {
        componentDependency.saludar();
        myBean.imprimir();
        System.out.println(myBeanProperties.fuction());
        System.out.println(userPojo.getEmail()+' '+userPojo.getPassword());
    }
}
