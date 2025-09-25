package abstract_factory;

public class PostgresFactory implements DataBaseFactory {
    @Override
    public DataBaseConnection createConnection() {
        return new PostGresConnection();
    }
}
