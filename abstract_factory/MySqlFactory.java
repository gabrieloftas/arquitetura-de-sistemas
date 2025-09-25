package abstract_factory;

public class MySqlFactory implements DataBaseFactory {
    @Override
    public DataBaseConnection createConnection() {
        return new MySqlConnection();
    }
    
}
