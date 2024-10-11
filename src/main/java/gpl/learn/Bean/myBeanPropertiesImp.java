package gpl.learn.Bean;

public class myBeanPropertiesImp implements myBeanProperties{
    private String name;
    private String apellido;
    public myBeanPropertiesImp(String name,String apellido){
        this.name=name;
        this.apellido=apellido;
    }
    @Override
    public String fuction() {
        return this.name+' '+this.apellido;
    }


}
