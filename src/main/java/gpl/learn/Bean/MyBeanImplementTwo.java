package gpl.learn.Bean;

public class MyBeanImplementTwo implements MyBean{

    private MyOperationDependecy myOperationDependecy;
    public MyBeanImplementTwo(MyOperationDependecy myOperationDependecy){
        this.myOperationDependecy=myOperationDependecy;
    }
    @Override
    public void imprimir() {
        System.out.println("HELLO BEAN TWO, OTHER VERSION :( ");
        System.out.println(this.myOperationDependecy.sum(5));
    }
}
