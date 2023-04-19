import java.sql.*;

class insertTable {
    public static void main(String args[]) {

        try {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating Connection
            String url= "jdbc:mysql://localhost:3306/db1";
            String username= "root";
            String password= "root";
            Connection con= DriverManager.getConnection(url, username, password);

            // create a query to insert into table1
            String q= "insert into table2(tName, tCity) values(?, ?)";
            // dynamic query so will use interface 'PreparedStatement'  and method 'prepareStatement'
            PreparedStatement pstmt= con.prepareStatement(q);  // here passing the query while making object only unlike 'statement'
            //set the values to query
            // pstmt.setString(1, "Ravi");  // '1' is the columnNo. 
            // pstmt.setString(2, "Patna");
            pstmt.setString(1, "Rushan");  
            pstmt.setString(2, "Nalanda");
            pstmt.executeUpdate();  // will bring no data. otherwise we will be use 'ResultSet'

            System.out.println("Inserted into table table2.....");
            con.close();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    
    } 
}
