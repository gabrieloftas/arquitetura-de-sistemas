package abstract_factory;

public class PostGresConnection implements DataBaseConnection{
    @Override
    public void conectar() {
        System.out.println("PostGres Connected");
    }
    
}
