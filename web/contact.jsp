<%-- 
    Document   : login
    Created on : 14 janv. 2019, 11:32:30
    Author     : daryl
--%>

<%@include file="header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>A R T K O D E S - Contact</title>
    </head>
    
    <%@include file="alert.jsp" %>
    
    <body>
        <main role="main" class="container">
            <div class="col-lg-8 offset-lg-2">
                <h1>Contact</h1>

                <form action="contact" method="POST">
                    <fieldset>
                        <div class="form-group">
                            <input type="text" class="form-control" id="name" name="name" aria-describedby="emailHelp" placeholder="Nom" data-kwimpalastatus="alive" data-kwimpalaid="1547462461565-5" required>
                        </div>

                        <div class="form-group">
                            <input type="email" class="form-control" id="mail" name="mail" placeholder="E-mail" data-kwimpalastatus="alive" data-kwimpalaid="1547462461565-6" required>
                        </div>
                        
                        <div class="form-group">
                            <input type="text" class="form-control" id="subject" name="subject" placeholder="Objet" data-kwimpalastatus="alive" data-kwimpalaid="1547462461565-7" required>
                        </div>
                        
                        <div class="form-group">
                            <textarea class="form-control" rows="8" id="message" name="message" placeholder="Message" style="resize: none" data-kwimpalastatus="alive" data-kwimpalaid="1547462461565-8" required></textarea>
                        </div>
                        <button type="submit" class="btn btn-outline-primary">Envoyer</button>
                    </fieldset>
                </form>
            </div>
        </main> 
    </body>
    <%@include file="footer2.jsp" %>
</html>
