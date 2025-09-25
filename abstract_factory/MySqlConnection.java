package abstract_factory;

public class MySqlConnection implements DataBaseConnection {
    @Override
    public void conectar() {
        System.out.println("MySQL Connected");
    }
}
