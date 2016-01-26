<%-- 
    Document   : getbook
    Created on : 18 Apr, 2014, 7:55:51 AM
    Author     : Aishwarya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Book</title>
    </head>
    <body>
        <h1>The Book you wish to read:</h1><br>


    <%-- start web service invocation --%><hr/>
    <%
    String bkname=request.getParameter("bkname");
    String author=request.getParameter("author");
    try {
	book.BkStoreService service = new book.BkStoreService();
	book.BkStore port = service.getBkStorePort();

	java.lang.String result = port.byname(bkname, author);
	out.println(result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
