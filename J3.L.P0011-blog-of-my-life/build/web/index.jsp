<%-- 
    Document   : home
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
            <!--Include header-->
            <%@include file="common/header.jsp" %>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <span>My Blog</span>

                        <!--Show blog-->
                        <c:forEach var="post" items="${home}">
                            <div class="post">
                                <div class="content-post">
                                    <!--Show information-->
                                    <div class="title-post">
                                        <a href="DetailsPost?id=${post.getId()}">${post.getTitle()}</a>
                                        <span>${post.getCreateDate()}</span>
                                    </div>
                                    <div class="${post.getType()}">
                                        <!--Check image of blog-->
                                        <a href="DetailsPost?id=${post.getId()}">
                                            <c:if test="${not empty post.getImgLink()}">
                                                <img src="image/${post.getImgLink()}">
                                            </c:if></a>
                                            <c:choose>
                                                <c:when test="${post.getType()=='note'}"><!--Check type-->
                                                <blockquote class="content-s"><!--Note type-->
                                                    <p>${post.getContent()}</p>
                                                    <small>${post.getAuthor()}</small>
                                                </blockquote>
                                            </c:when>
                                            <c:otherwise>
                                                <span class="content-s"><!--Photo and blog type-->
                                                    ${post.getContent()}
                                                </span>
                                            </c:otherwise>
                                        </c:choose>
                                    </div>
                                </div>
                            </div>
                            <div class="border-post"></div>
                        </c:forEach>
                        <!--Over view link-->
                        <div class="overview">
                            <a href="OverviewController">Overview</a>
                        </div>
                        <!--Pagination bar-->
                        <div class="pagination">
                            <c:forEach var="j" begin="1" step="1" end="${totalPage}">
                                <span><a href="HomeController?page=${j}" class="<c:if test="${j eq page}">active</c:if>" >${j} </a></span> 
                            </c:forEach>
                        </div>
                    </div>
                    <%@include file="common/container.jsp" %>
                </div>
                <%@include file="common/footer.jsp" %>
            </div>
        </div>
    </body>
</html>
