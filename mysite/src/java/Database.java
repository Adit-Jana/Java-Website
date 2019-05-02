/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Adit Jana
 */
public class Database extends HttpServlet {
    
        //String sql =" insert into response.contact values('name','email','service','subject')";
        
        String url ="jdbc:mysql://localhost:3306/response";
        String username="root";   
        String pass = "";
        
        
        
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        
        /*##################Contact Form#######################*/
        /* Here we fetch the login values from the already user 
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String service = request.getParameter("service");
        String subject = request.getParameter("subject");*/
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,pass);
            Statement st = con.createStatement();
            
            System.out.print("database is connected");
             
            /*PreparedStatement pr = con.prepareStatement("insert into contact([name],[email],[sevices],[values(?,?,?,?)");
            pr.setString(1,name);
            pr.setString(2,email);
            pr.setString(3,service);
            pr.setString(4,subject);  
             
            pr.executeUpdate();
            pr.close();   */
                
            //System.out.println("Data is submitted..");
        }
        catch(ClassNotFoundException | SQLException e){
            
        }
       
        
    }

    

}
