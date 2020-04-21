<%-- 
    Document   : detailsPost
    Created on : Feb 27, 2020, 11:04:08 AM
    Author     : viettqhe130524
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link type="text/css" rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="wrap">
            <!--Include file header-->
            <%@include file="common/header.jsp" %>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <div class="post">
                            <!--Check Type of Blog-->
                            <div class="icon-post-${content.getType()}"></div>
                            <div class="content-post">
                                <div class="title-post">
                                    <!--Show Information-->
                                    <a class="title-details">${content.getTitle()}</a>
                                    <span>${content.getCreateDate()}</span>
                                </div>
                                <!--Using css for each blog-->
                                <div class="${content.getType()}">
                                    <!--Check image-->
                                    <c:if test="${not empty content.getImgLink()}">
                                        <a><img src="image/${content.getImgLink()}"></a>
                                        </c:if>
                                    <c:choose>
                                        <c:when test="${content.getType()=='note'}"><!--Check blog is note or not-->
                                            <blockquote class="content-s">
                                                <p>${content.getContent()}</p>
                                                <small>${content.getAuthor()}</small>
                                            </blockquote>
                                        </c:when>
                                        <c:otherwise><!--Type of photo and blog-->
                                            <span class="content-s">
                                                ${content.getContent()}
                                            </span>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                                <div class="border-post"></div>
                            </div>
                        </div>
                        <!--Over view link-->
                        <div class="overview-details">
                            <a href="OverviewController">Overview</a>
                        </div>
                    </div>
                    <!--Include right page-->
                    <%@include file="common/container.jsp" %>
                </div>
                <!--Include footer-->
                <%@include file="common/footer.jsp" %>
            </div>

        </div>
    </body>
</html>
