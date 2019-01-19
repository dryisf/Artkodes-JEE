<%-- 
    Document   : alert
    Created on : 19 janv. 2019, 13:58:30
    Author     : Daryl & Michel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if (request.getAttribute("alertSuccess") != null) { %>
    <div class="alert alert-dismissible alert-success col-lg-6 offset-lg-3">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <p class="mb-0"><%= request.getAttribute("alertSuccess") %></p>
    </div>
<% }else{ 
        if (request.getAttribute("alertFail") != null) { %>
            <div class="alert alert-dismissible alert-warning col-lg-6 offset-lg-3">
                <button type="button" class="close" data-dismiss="alert">&times;</button>
                <p class="mb-0"><%= request.getAttribute("alertFail") %></p>
            </div>
<% }} %>
