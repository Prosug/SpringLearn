package gpl.learn;

import gpl.learn.Bean.MyBean;
import gpl.learn.Component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeginnerApplication implements CommandLineRunner {
    //vamos a inyectar la dependencias
    private ComponentDependency componentDependency;
    private MyBean myBean;

    public SpringBeginnerApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean){
        this.componentDependency=componentDependency;
        this.myBean=myBean;
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBeginnerApplication.class, args);
    }

    //el metodo RUN, ejecuta en la aplicacion lo que nosotros queramos.
    @Override
    public void run(String... args) throws Exception {
        componentDependency.saludar();
        myBean.imprimir();
    }
}
