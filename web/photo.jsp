<%-- 
    Document   : index
    Created on : 14 janv. 2019, 18:17:13
    Author     : daryl
--%>
<%@page import="model.Photo"%>
<%@include file="header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>A R T K O D E S</title>
    </head>
    
    <%@include file="alert.jsp" %>
    
        <div class="container" style="max-width:1500px">
            
            <div class="row justify-content-around">
                <div class="col-lg-10">
                    <img src="<%= ((Photo)request.getAttribute("photo")).getPath() %>" style="width:100%">
                </div>
                
            </div>
            
            <div class="row justify-content-around">
                <div class="col-lg-10" style="margin-bottom:10px; text-align: center; font-size: 160%">
                    <a href="photographs?catid=<%= ((Photo)request.getAttribute("photo")).getCategory().getCatId() %>" style="color: #fff; text-decoration: none">Retour</a>
                </div>
            </div>
        </div>
    
    <%@include file="footer.jsp" %>
    
</html>
