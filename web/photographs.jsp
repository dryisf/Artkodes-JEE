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
    
        <div class="container" style="max-width:1500px">
            <h1><%= (String)request.getAttribute("cat") %></h1>
            
            <%int photoCount=0; for(int i=0; i<(((int)request.getAttribute("photoNb"))/3)+1; i++){%>
                <div class="row justify-content-around">
                <%for(int j=0; j<3; j++){%>
                    <div class="col-lg-4">
                        <img src="https://via.placeholder.com/2880x1800" style="width:100%"/>
                    </div>
                <%photoCount++; if(photoCount==((int)request.getAttribute("photoNb"))){break;} }%>
                </div>
            <%}%>
        </div>
            
    <%@include file="footer.jsp" %>
    
</html>