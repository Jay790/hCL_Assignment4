package HCL_Assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateInsertJDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Table4";
        String user = "root";
        String password = "Jay@7903";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, user, password);


            Statement st = con.createStatement();


            String createTable = "CREATE TABLE IF NOT EXISTS Students (" +
                    "name VARCHAR(50), " +
                    "rollno INT, " +
                    "branch VARCHAR(30), " +
                    "sem VARCHAR(10))";

            st.executeUpdate(createTable);
            System.out.println("Table created successfully.");


            String insertData = "INSERT INTO Students VALUES " +
                    "('Jay', 1, 'CSE', 'I')," +
                    "('Raj', 2, 'IT', 'II')," +
                    "('Rohit', 3, 'ME', 'III')," +
                    "('Neha', 4, 'CE', 'IV')";

            int rows = st.executeUpdate(insertData);
            System.out.println(rows + " records inserted.");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
