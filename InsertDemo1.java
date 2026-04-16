import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo1 {
    public static void main(String[] args) {
        try {
            // Step 1: Load Driver (optional in new versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", // database name
                "root",                              // username
                "password"                           // password
            );

            // Step 3: Create Statement
            Statement st = con.createStatement();

            // Step 4: Insert Query
            String query = "INSERT INTO student (id, name) VALUES (1, 'Aniket')";

            // Step 5: Execute Query
            int result = st.executeUpdate(query);

            // Step 6: Show Result
            if (result > 0) {
                System.out.println("Data Inserted Successfully");
            } else {
                System.out.println("Insertion Failed");
            }

            // Step 7: Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}