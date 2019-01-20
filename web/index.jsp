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
            
            <div class="row justify-content-around">
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=1"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/></a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=2"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/></a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=3"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/></a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=4"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/></a>
                </div>
            </div>
            
            <div class="row justify-content-around">
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=5"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/></a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=6"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/></a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=7"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/></a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="contact.jsp"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/></a>
                </div>
            </div>
            
        </div>
    
    <%@include file="footer.jsp" %>
    
</html>
