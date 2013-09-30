<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="">
	<meta name="description" content="">
	
	<title></title>
	<!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="${pageContext.request.contextPath}/css/bootstrap-glyphicons.css" rel="stylesheet" media="screen">
    <!-- Custom styles for this template -->
	
    <decorator:head />
    
</head>
<body>
	
	<div id="wrap">
		<div class="container">
			
			<decorator:body />

		</div>
		<!-- /container -->
	</div>
	<!-- Site footer -->
	<div id="footer">
		<div class="container">
        	<p class="text-muted credit">Developers:</p>
      	</div>
	</div>
	
	
	<!-- JavaScript plugins (requires jQuery) -->
    <script src="http://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.file-input.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap-button.js"></script>
</body>
</html>