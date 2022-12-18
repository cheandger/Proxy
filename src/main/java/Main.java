public class Main {
    public static void main(String[] args) {
        String dbName = "NeoStudyStudents.DB";
        DbProxy dbProxy = new DBConnectorProxyImpl();
        DbConnector dbConnector = new DBConnectorImpl(dbName, dbProxy);
        dbConnector.selectFromDb();
    }
}
