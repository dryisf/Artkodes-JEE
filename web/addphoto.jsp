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
        <title>A R T K O D E S - Ajouter une photo</title>
    </head>
    
    <%@include file="alert.jsp" %>
    
    <body>
        <main role="main" class="container">
            <div class="col-lg-8 offset-lg-2">
                <h1>Ajouter une photo</h1>

                <form action="addphoto" method="POST" enctype="multipart/form-data">
                    <fieldset>
                        <div class="form-group">
                            <label for="username">Nom de la photo</label>
                            <input type="text" class="form-control" id="photoname" name="photoname" aria-describedby="emailHelp" placeholder="Nom de la photo" data-kwimpalastatus="alive" data-kwimpalaid="1547462461565-3" required>
                        </div>

                        <div class="form-group">
                            <label for="cat">Catégorie</label>
                            <select class="form-control" id="cat" name="cat">
                                <option value="0">Déception</option>
                                <option value="1">Musée</option>
                                <option value="2">Paris Fashion Week</option>
                                <option value="3">Rebel</option>
                                <option value="4">The Prince</option>
                                <option value="5">Tired Boys</option>
                            </select>
                        </div>
                        
                        <div class="form-group">
                            <label for="photo">Photo</label>
                            <input type="file" class="form-control-file" id="photo" name="photo" aria-describedby="fileHelp">
                        </div>
                        <button type="submit" class="btn btn-outline-primary">Ajouter la photo</button>
                    </fieldset>
                </form>
            </div>
        </main> 
    </body>
    <%@include file="footer2.jsp" %>
</html>
