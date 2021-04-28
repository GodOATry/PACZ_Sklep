package Database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

//class for DataAccessObject MACIUS NIE RUSZ BO ROZWALISZ
public class DAO {
    private Connection conn = null;
    private String dbURL = "jdbc:postgresql://localhost:5432/Pacz";
    private String user = "postgres";
    private String pass = "123";


    public void create() throws SQLException {
        conn = DriverManager.getConnection(dbURL, user, pass);

        if (conn != null) {
            DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
            System.out.println("Driver name: " + dm.getDriverName());
            System.out.println("Driver version: " + dm.getDriverVersion());
            System.out.println("Product name: " + dm.getDatabaseProductName());
            System.out.println("Product version: " + dm.getDatabaseProductVersion());
        }
    }
}
