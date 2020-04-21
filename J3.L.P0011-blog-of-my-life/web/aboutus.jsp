<%-- 
    Document   : aboutus
    Created on : Feb 27, 2020, 11:04:08 AM
    Author     : viettqhe130524
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About me Page</title>
        <link type="text/css" rel="stylesheet" href="css/style.css">
    </head>
    <body onload="setBold()">
        <div id="menu" data-page="Menu"></div>
        <div class="wrap">
            <!--Include file header-->
            <%@include file="common/header.jsp" %>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <!--Show the information about-->
                        <span>About me</span>
                        <div class="aboutus">
                            <p>${info.getContent()}</p>
                            <div class="border-post"></div>
                            <p>Kind regards</p>
                            <div class="author">
                                ${info.getName()}
                            </div>
                        </div>
                    </div>
                    <!--Right page-->
                    <%@include file="common/container.jsp" %>
                </div>
                <!--Footer-->
                <%@include file="common/footer.jsp" %>
            </div>
        </div>
    </body>
</html>
