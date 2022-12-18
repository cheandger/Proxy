public class DBConnectorImpl implements DbConnector {

    private DbProxy dbProxy;
    public String dbName;

    public DBConnectorImpl(String dbName, DbProxy dbProxy) {

        this.dbProxy = dbProxy;

        this.dbName = dbName;

        dbProxy.connectToDb(dbName);
    }

    @Override
    public void selectFromDb() {
        System.out.println("Java students:....");
    }
}