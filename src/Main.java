import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // 1 Registrer driveren
        try{
          DriverManager.registerDriver(new Driver());
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        //2 Hent tilkobling
        Connection connection=null;
        try{
                    connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javasql?allowPublicKeyRetrieval=true&useSSL=false"
                            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}