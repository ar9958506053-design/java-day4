import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test",
            "root",
            "password"
        );

        String query = "INSERT INTO student VALUES (1, 'Aniket')";
        Statement st = con.createStatement();
        st.executeUpdate(query);

        System.out.println("Data Inserted");
    }
}