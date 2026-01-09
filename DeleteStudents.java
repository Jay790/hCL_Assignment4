package HCL_Assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudents {

    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/Table5";
        String username = "root";
        String password = "Jay@7903";


        String sql = "DELETE FROM StudentsData WHERE year_of_passing = ? AND branch = ?";

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, username, password);


            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 2024);
            ps.setString(2, "Civil");


            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Records deleted successfully");
            } else {
                System.out.println("No matching records found");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
