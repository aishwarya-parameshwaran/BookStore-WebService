/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package book;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.*;
/**
 *
 * @author Aishwarya
 */
@WebService()
public class BkStore {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "byname")
    public String byname(@WebParam(name = "bkname")
    String bkname, @WebParam(name = "author")
    String author) {
        String str="Book Unavailable";
        String nm=null,auth=null;
        int id=1;

        try
        {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
String url = "jdbc:odbc:servernew";
Connection con = DriverManager.getConnection(url,"sa","aishwarya2106");
Statement st= con.createStatement();
String QueryString = "SELECT * from books where name='"+bkname+"'";
ResultSet rs = st.executeQuery(QueryString);

while(rs.next())
{
    nm=rs.getString(1);
    auth=rs.getString(2);
    id=rs.getInt(3);
}
str="Book name: "+nm+"<br>Author: "+auth+"<br>Book id: "+id;

        }
        catch(Exception e) {}
        return str;
}

    /**
     * Web service operation
     */
    @WebMethod(operationName = "placeorder")
    public String placeorder(@WebParam(name = "id")
    int id,@WebParam(name = "custname")
    String custname,@WebParam(name = "address")
    String address,@WebParam(name = "contact")
    long contact) {
        String str="Try again";
        String nm=null,auth=null;
        try
        {

         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
String url = "jdbc:odbc:servernew";
Connection con = DriverManager.getConnection(url,"sa","aishwarya2106");
Statement st= con.createStatement();
String QueryString = "SELECT * from books where bookid="+id;
ResultSet rs = st.executeQuery(QueryString);
if(rs.next())
{
    nm=rs.getString(1);
    auth=rs.getString(2);
    id=rs.getInt(3);


String query1="insert into bought values ('"+custname+"','"+address+"',"+contact+","+id+",'"+nm+"')";
st.executeUpdate(query1);
String query2="delete from books where bookid="+id;
st.executeUpdate(query2);

str="Customer Name: "+custname+"<br>Address: "+address+"<br>Contact: "+contact+"<br>Book Name: "+nm+"<br>Author: "+auth+"<br>Your book will be delivered in 3 days. <br>Cash on delivery!";
}
        }
        catch(Exception e) {}
      return str;
    }
}
