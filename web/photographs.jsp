<%-- 
    Document   : photo
    Created on : 19 janv. 2019, 15:51:09
    Author     : Michel
--%>
<%@include file="header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Artkodes</title>
    </head>
    
    <%@include file="alert.jsp" %>
    
        <div class="container" style="max-width:1500px">
            <h1><%= request.getAttribute("cat") %></h1>
            
            <div class="row justify-content-around">
                <div class="col-lg-4">
                    <a href="#"><img src="https://via.placeholder.com/2880x1800" style="width:100%"/></a>
                </div>
                <div class="col-lg-4">
                    <a href="#"><img src="https://via.placeholder.com/2880x1800" style="width:100%"/></a>
                </div>
                <div class="col-lg-4">
                    <a href="#"><img src="https://via.placeholder.com/2880x1800" style="width:100%"/></a>
                </div>
            </div>
            
            <div class="row justify-content-around">
                <div class="col-lg-4">
                    <a href="#"><img src="https://via.placeholder.com/2880x1800" style="width:100%"/></a>
                </div>
                <div class="col-lg-4">
                    <a href="#"><img src="https://via.placeholder.com/2880x1800" style="width:100%"/></a>
                </div>
                <div class="col-lg-4">
                    <a href="#"><img src="https://via.placeholder.com/2880x1800" style="width:100%"/></a>
                </div>
            </div>
            
        </div>
            
    <%@include file="footer.jsp" %>
    
</html>