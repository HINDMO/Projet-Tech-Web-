package controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.copy.MyConnection;

//This is the annotation-based
//mapping URL to Servlet.
@WebServlet("/serv")

//This annotation defines the maximum
//file size which can be taken.
@MultipartConfig(maxFileSize = 16177215)

public class serv extends HttpServlet {

 // auto generated
 private static final long serialVersionUID = 1L;

 public serv()
 {
     super();
 }

 // This Method takes in All the information
 // required and is used to store in the
 // MySql Database.
 public int uploadFile(String fullName, String languagespoken, String brandname, String address, String contact, String city, InputStream photo)
 {
     String SQL
         = "INSERT INTO hostcondidat"
 				+ "  (full_name, languagespoken, Brand_name, email_id, mobile_number,city,photo) VALUES "
 				+ " (?, ?, ?, ?, ?,?,? );";
     int row = 0;

     Connection connection
         = MyConnection.getConnection();

     PreparedStatement preparedStatement;
     try {
         preparedStatement
             = connection.prepareStatement(SQL);

         preparedStatement
             .setString(1, fullName);

         preparedStatement
             .setString(2, languagespoken);
         preparedStatement
         .setString(3, brandname);
         preparedStatement
         .setString(4, address);
         preparedStatement
         .setString(5, contact);
         preparedStatement
         .setString(6, city);

         if (photo != null) {

             // Fetches the input stream
             // of the upload file for
             // the blob column
             preparedStatement.setBlob(7, photo);
         }

         // Sends the statement to
         // the database server
         row = preparedStatement
                   .executeUpdate();
     }
     catch (SQLException e) {
         System.out.println(e.getMessage());
     }

     return row;
 }

 // As Submit button is hit from
 // the Web Page, request is made
 // to this Servlet and
 // doPost method is invoked.
 protected void doPost(
     HttpServletRequest request,
     HttpServletResponse response)
     throws ServletException, IOException
 {

     // Getting the parameters from web page
     String fullName
         = request.getParameter("fullName");

     String languagespoken
         = request.getParameter("languagespoken");
     String Brandname
     = request.getParameter("Brandname");
     String address
     = request.getParameter("address");
     String contact
     = request.getParameter("contact");
     String city
     = request.getParameter("city");

     // Input stream of the upload file
     InputStream inputStream = null;

     String message = null;

     // Obtains the upload file
     // part in this multipart request
     Part filePart
         = request.getPart("photo");

     if (filePart != null) {

         // Prints out some information
         // for debugging
         System.out.println(
             filePart.getName());
         System.out.println(
             filePart.getSize());
         System.out.println(
             filePart.getContentType());

         // Obtains input stream of the upload file
         inputStream
             = filePart.getInputStream();
     }

     // Sends the statement to the
     // database server
     int row
         =uploadFile(fullName,
        		 languagespoken,Brandname,address,contact,city,
                           inputStream);
     if (row > 0) {
         message
             = "File uploaded and "
               + "saved into database";
     }
     System.out.println(message);
     RequestDispatcher dispatcher = request.getRequestDispatcher("/hostdetails.jsp");
	 dispatcher.forward(request, response);
 }

}
