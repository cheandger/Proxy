public class DBConnectorProxyImpl implements DbProxy {

    String dbUrl;


    DBConnectorProxyImpl() {

        this.dbUrl = "localhost:port8080/";
    }

    @Override
    public void connectToDb(String dbName) {
        System.out.println("Connecting to: " + dbUrl.concat(dbName));
    }

}
