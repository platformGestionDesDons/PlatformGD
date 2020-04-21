<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="new_fund" method="post" class="form-group"
		action="${pageContext.request.contextPath}/home_page">
		<c:forEach items="${etablissement}" var="b">
			<a href="faire_un_don?code=${b.getIdEtablissement()}">${b.getNomEtablissement()}</a><br>
		</c:forEach>
	</form>
</body>
</html>