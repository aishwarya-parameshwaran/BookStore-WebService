<%-- 
    Document   : index
    Created on : 18 Apr, 2014, 7:38:26 AM
    Author     : Aishwarya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Bookstore</title>
        <style type="text/css">
        #avail{
    
    float: left;
    background-color: #eee;
    padding: 50px;
}
#buy
{
    float:left;
  background-color: #eee;
  padding: 50px;
}
input {
    display: block;
    width:300px;
    
}

        </style>
</head>
    <body>
        <h1>Welcome to Alpha Online Bookstore</h1>
        <h2>Choose an action:</h2><br>
        <fieldset title="avail" id="avail">
            <legend>Available Books</legend>
            <form action="getbook.jsp" target="avail">
                Enter a book name:<input type="text" name="bkname"/><br><br>
                Enter author name:<input type="text" name="auth"/><br><br>
                <input type="submit" value="Get Books"/><br><br>
            </form>
        </fieldset>
        <fieldset title="buy" id="buy">
            <legend>Buy</legend>
            <form action="buy.jsp" target="buy">
                Enter your name:<input type="text" name="custname"/><br><br>
                Enter your address:<input type="text" name="address"/><br><br>
                Enter your contact number:<input type="text" name="contact"/><br><br>
                Enter book id:<input type="text" name="bookid"/><br><br>
                <input type="submit" value="Place Order"/><br><br>
            </form>
        </fieldset>
        <fieldset>
            <legend>Feeds</legend>
            <a href="feeds.xml">Subsribe to our feed</a>
            
        </fieldset>
    </body>
</html>
