<%-- 
    Document   : index
    Created on : 14 janv. 2019, 18:17:13
    Author     : daryl
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
            
            <% for(int j = 0; j<2; j++){ %>
            <div class="row justify-content-around">
                <% for(int i = 0; i<3; i++){ %>
                <div class="col-lg-4">
                    <img src="https://via.placeholder.com/2880x1800" style="width:100%"/>
                </div>
                <% } %>
            </div>
            <% } %>
            
        </div>
    
</html>
