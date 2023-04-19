import java.sql.*;

class createTable {
    public static void main(String args[]) {

        try {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating Connection
            String url= "jdbc:mysql://localhost:3306/db1";
            String username= "root";
            String password= "root";
            Connection con= DriverManager.getConnection(url, username, password);
            // create a query to create table
            String q= "create table table2(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
            // create a statement
            Statement stmt= con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created in database");
            con.close();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
    } 
}
