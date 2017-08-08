<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="/js/jquery-3.2.1.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.css"/>
    <link rel="stylesheet" href="/css/bootstrap-theme.css"/>
    <link rel="stylesheet" href="/css/main.css"/>
    <link rel="stylesheet" href="/css/ie10-viewport-bug-workaround.css"/>

    <title>悟饭的果汁店</title>
</head>
<body>


<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active"><a href="#">Home</a></li>
                <li role="presentation"><a href="#">About</a></li>
                <li role="presentation"><a href="#">Products</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">Wufan's Juice Store</h3>
    </div>

    <div class="jumbotron">
        <h1></h1>
        <p class="lead">Fruit juice with rich nutrition, provide us with necessary vitamins every day.</p>
        <p><a class="btn btn-lg btn-success" href="#" role="button">Sign up today</a></p>
    </div>

    <div class="row marketing">
        <sitemesh:write property='body'/>
    </div>

    <footer class="footer">
        <p>© 2017 by:悟饭 https://github.com/zhangbin/juice_java </p>
    </footer>

</div> <!-- /container -->


</body>
</html>


