
import java.sql.*;
public class myConnection {
    
   Connection XC;
   Statement ST;
 public myConnection(){
     try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     XC=DriverManager.getConnection("jdbc:odbc:SQLEXPRESS");
     ST=XC.createStatement();
     System.out.println("c");
     }
     
    catch(ClassNotFoundException | SQLException ex){
         System.out.println(ex);}
        
 }
 
    
    
   }
    
    
    

