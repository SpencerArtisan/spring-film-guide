<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Film Guide</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
</head>

<body>

<div class="container">
    <div class="row">
        <div class="span8 offset2">
            <h1>Films</h1>
            <form:form name="form1" method="get" action="films" commandName="film" class="form-horizontal">
                <div class="control-group">
                    <form:label cssClass="control-label" path="title">Title:</form:label>
                    <div class="controls">
                        <form:input id="film" path="title"/>
                    </div>
                    <a href="javascript:document.form1.submit();">Search</a>
                </div>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>