<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="col-md-4 padding-left-none">
    <div class="panel panel-hot">
        <div class="panel-heading">热卖套餐</div>
        <div class="panel-body">
            <ul class="hot-list clearfix">
                <c:forEach items="${hots}" var="p">
                    <li class="hot-item">
                        <a href="" target="_blank" class="hot-item-lk">
                            <p class="hot-name">${p.name}</p>
                            <img src="${p.image}" class="hot-image"></a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
<div class="col-md-4 padding-left-none padding-right-none">
    <div class="panel panel-popular">
        <div class="panel-heading">销量冠军</div>
        <div class="panel-body">
            Panel content
        </div>
    </div>
</div>
<div class="col-md-4 padding-right-none">
    <div class="panel panel-discount">
        <div class="panel-heading">促销精品</div>
        <div class="panel-body">
            Panel content
        </div>
    </div>
</div>

