<%-- 
    Document   : header
    Created on : 14 janv. 2019, 11:34:22
    Author     : daryl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://bootswatch.com/4/cyborg/bootstrap.min.css"/>
        <link rel=stylesheet type="text/css" href="main.css" />
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="index.jsp" data-ytta-id="-">Artkodes</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarColor02">
              <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <% if (session.getAttribute("username") != null) { %>
                    <a class="nav-link" href="logout" data-ytta-id="-">Déconnexion</a>
                    <% } else { %>
                    <a class="nav-link" href="login.jsp" data-ytta-id="-">Connexion</a>
                    <% } %>
                </li>
              </ul>
            </div>
         </nav>
                
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
    </body>
</html>
