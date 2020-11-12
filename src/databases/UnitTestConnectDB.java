package databases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;

public class UnitTestConnectDB {
    @Test
    public void TestingConnection() {
        try { //sql is connected and exceptions are created if unable to launch
            ConnectToDB.connectToSqlDatabase();
            System.out.println("Sql is launched");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
