package HCL_Assignment4;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionEx {

    public static void main(String[] args) {

        // Database credentials
        String url =  "jdbc:mysql://localhost:3306/Table3?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Jay@7903";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, user, password);

            if (con != null) {
                System.out.println("Connection Successful");
            }


            con.close();
        }
        catch (Exception e) {
            System.out.println("Unable to connect");
            System.out.println(e);
        }
    }
}
