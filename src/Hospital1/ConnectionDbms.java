package Hospital1;

import java.sql.*;

public class ConnectionDbms {
    Connection con;
    Statement stm;
    ConnectionDbms(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system","root","Tareq@688021");
            stm=con.createStatement();
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ConnectionDbms();
    }
}
