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
    
    <% if (request.getAttribute("alert") != null) { %>
        <div class="alert alert-dismissible alert-success">
            <button type="button" class="close" data-dismiss="alert">&times;</button>
            <p class="mb-0"><%= request.getAttribute("alert") %></p>
        </div>
    <% } %>
    
        <div class="container">
            
            <% for(int j = 0; j<2; j++){ %>
            <div class="row justify-content-around">
                <% for(int i = 0; i<3; i++){ %>
                <div class="col">
                    <img src="https://via.placeholder.com/350"/>
                </div>
                <% } %>
            </div>
            <% } %>
            
        </div>
    
</html>
