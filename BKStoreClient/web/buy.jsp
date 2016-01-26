<%-- 
    Document   : buy
    Created on : 18 Apr, 2014, 8:01:33 AM
    Author     : Aishwarya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Place Order</title>
    </head>
    <body>
        <h1>Your order:</h1>

    <%-- start web service invocation --%><hr/>
    <%
    int id=Integer.parseInt(request.getParameter("bookid"));
    String custname=request.getParameter("custname");
    String address=request.getParameter("address");
    long contact=Long.parseLong(request.getParameter("contact"),10);
    try {
	book.BkStoreService service = new book.BkStoreService();
	book.BkStore port = service.getBkStorePort();

	java.lang.String result = port.placeorder(id, custname, address, contact);
	out.println(result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
