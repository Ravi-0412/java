//BufferedReader helps in inserting by taking user input

import java.sql.*;
import java.io.*;

class insertTakingInput {
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
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name: ");
            String name= br.readLine();
            System.out.println("Enter city: ");
            String city= br.readLine();

            //set the values to query
            pstmt.setString(1, name);  // '1' is the columnNo. 
            pstmt.setString(2, city);
            pstmt.executeUpdate();  // will bring no data. otherwise we will be use 'ResultSet'

            System.out.println("Inserted into table table2.....");
            con.close();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    
    } 
}

