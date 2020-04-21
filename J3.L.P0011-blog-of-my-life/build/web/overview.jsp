<%-- 
    Document   : overview
    Created on : Feb 27, 2020, 11:04:08 AM
    Author     : viettqhe130524
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
        <link type="text/css" rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div id="menu" data-page="Home"></div>
        <div class="wrap">
            <!--Include header file-->
            <%@include file="common/header.jsp" %>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <span>Overview - My Blog</span>
                        <span class="float-right">Date</span>
                        <!--Show all off blog-->
                        <c:forEach var="title" items="${home}">
                            <div id="groupMonth" class="header-table" data-date="${title.getCreateDate()}">
                            </div>
                            <div class="menu-container">
                                <div class="title">
                                    <a href="DetailsPost?id=${title.getId()}"><span>${title.getTitle()}</span></a>
                                </div>
                                <div class="date">
                                    <span>${title.getCreateDate()}</span>
                                </div>
                            </div>
                        </c:forEach>
                        <!--Pagination bar-->
                        <div class="pagination">
                            <c:forEach var="j" begin="1" step="1" end="${totalPage}">
                                <span><a href="OverviewController?page=${j}" class="<c:if test="${j eq page}">active</c:if>" >${j} </a></span> 
                            </c:forEach>
                        </div>
                    </div>
                    <!--Right Page-->
                    <%@include file="common/container.jsp" %>
                </div>
                <!--Footer page-->
                <%@include file="common/footer.jsp" %>
            </div>
        </div>
    </body>
</html>
