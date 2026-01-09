package HCL_Assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class IncreasePercentage {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Table3";
        String user = "root";
        String password = "Jay@7903";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();


            String updateQuery =
                    "UPDATE Students " +
                            "SET percentage = percentage + (percentage * 0.05) " +
                            "WHERE branch = 'CSE'";

            int rows = st.executeUpdate(updateQuery);

            System.out.println(rows + " records updated done");


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
