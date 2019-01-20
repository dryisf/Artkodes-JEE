<%-- 
    Document   : photo
    Created on : 19 janv. 2019, 15:51:09
    Author     : Michel
--%>
<%@page import="java.util.List"%>
<%@page import="model.Photo"%>
<%@page import="java.util.Iterator"%>
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
            
            <%int photoCount=0;
            if((int)request.getAttribute("photoNb")!=0){
                for (Iterator<Photo> k = ((List<Photo>)request.getAttribute("photoList")).iterator(); k.hasNext();) {
                    for(int i=0; i<(((int)request.getAttribute("photoNb"))/3)+1; i++){%>
                        <div class="row justify-content-around">
                        <%for(int j=0; j<3; j++){%>
                            <% Photo item = k.next(); %>
                            <div class="col-lg-4" style="margin-bottom:10px">
                                <img src="<%=item.getPath()%>" style="width:100%"/>
                            </div>
                        <%photoCount++; if(photoCount==((int)request.getAttribute("photoNb"))){break;} }%>
                        </div>
                    <%}}}%>
        </div>
    
    <%if((int)request.getAttribute("photoNb")<4){%>       
        <%@include file="footer2.jsp" %>
    <%}else{%>
        <%@include file="footer.jsp" %>
    <%}%>
</html>