<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/ajouter_besoin">
		<table>
			<tr>
				<td><label>Nom besoin</label></td>
				<td><input name="nom_besoin" type="text"></td>
			</tr>
			<tr>
				<td><label>Etat</label></td>
				<td><input name="etat" type="text"></td>
			</tr>
			<tr>
				<td><label>Quantite</label></td>
				<td><input name="quantite" type="text"></td>
			</tr>
			<button type="submit" name="action" value="ajouter un besoin"> Ajouter un besoin</button>
		</table>
	</form>
</body>
</html>