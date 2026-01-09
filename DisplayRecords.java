package HCL_Assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayRecords {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Table6";
        String user = "root";
        String password = "Jay@7903";

        String query = "SELECT * FROM StudentData WHERE semester = ? AND branch = ?";

        try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement(query)
        ) {
            ps.setInt(1, 7);
            ps.setString(2, "EC");

            ResultSet rs = ps.executeQuery();

            System.out.println("Students of Semester 7 and Branch EC");
            System.out.println("----------------------------------");

            while (rs.next()) {
                System.out.println(
                        "Name: " + rs.getString("name") +
                                ", Roll No: " + rs.getInt("rollno") +
                                ", Branch: " + rs.getString("branch") +
                                ", Semester: " + rs.getInt("semester") +
                                ", Percentage: " + rs.getDouble("percentage") +
                                ", Year of Passing: " + rs.getInt("year_of_passing")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
