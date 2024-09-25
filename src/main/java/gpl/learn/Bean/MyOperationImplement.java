package gpl.learn.Bean;


public class MyOperationImplement implements MyOperationDependecy{
    @Override
    public int sum(int valor) {
        return valor+10;
    }
}
