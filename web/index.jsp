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
        <title>A R T K O D E S</title>
    </head>
    
    <%@include file="alert.jsp" %>
    
        <div class="container" style="max-width:1500px">
            
            <div class="row justify-content-around">
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=0"  class="containerH"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/><div class="overlay">
                            <div class="text">Deception</div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=1"  class="containerH"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/><div class="overlay">
                            <div class="text">Musée</div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=2"  class="containerH"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/><div class="overlay">
                            <div class="text">Paris Fashion Week</div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=3"  class="containerH"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/><div class="overlay">
                            <div class="text">Rebel</div>
                        </div>
                    </a>
                </div>
            </div>
            
            <div class="row justify-content-around">
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=4"  class="containerH"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/><div class="overlay">
                            <div class="text">The Prince</div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=5"  class="containerH"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/><div class="overlay">
                            <div class="text">Tired Boys</div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="photographs?catid=6"  class="containerH"><img src="https://via.placeholder.com/4000x6000" style="width:100%"/><div class="overlay">
                            <div class="text">Contact</div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-3" style="margin-bottom:10px">
                    <a href="contact.jsp" class="containerH"><img src="./assets/images/tchointeur.jpg" style="width:100%"/><div class="overlay">
                            <div class="text">Contact</div>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    
    <%@include file="footer.jsp" %>
    
</html>
