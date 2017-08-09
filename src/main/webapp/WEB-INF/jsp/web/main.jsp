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
                <li role="presentation"><a href="/about">About</a></li>
                <li role="presentation"><a href="/Juice">Juice</a></li>
                <li role="presentation"><a href="/stores">Stores</a></li>
                <li role="presentation"><a href="/carts">Carts</a></li>
            </ul>
        </nav>
        <h3 class="text-muted"><img style="width: 40px;" src="/images/logo.jpg" />Wufan's Juice Store</h3>
    </div>

    <div class="jumbotron banner">
        <h1>新鲜每一天</h1>
    </div>

    <div class="row marketing">
        <sitemesh:write property='body'/>
    </div>

    <footer class="footer">
        <p>© 2017 by: <a href = "https://github.com/zhangbin/juice_java">悟饭</a> </p>
    </footer>

</div> <!-- /container -->


</body>
</html>


