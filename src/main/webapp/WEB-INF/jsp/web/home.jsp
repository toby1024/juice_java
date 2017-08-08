<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table class="table table-striped">
    <c:forEach items="${products}" var="product">

        <div class="col-lg-6">
            <img src="${product.image}" class="img-rounded">
            <h4>${product.name}</h4>
            <p>${product.description}</p>
        </div>
    </c:forEach>
</table>
