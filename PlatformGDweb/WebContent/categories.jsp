
<%@ include file="__header.jsp"%>
	<div class="container">
		<h2>
			Nombre de cat�gories disponibles sur le site :
			<c:out value="${nombreCategorie}"></c:out>
		</h2>
		<table class="table table-hover">
			<c:forEach var="categorie" items="${ListCategories}">
				<tr>
											<c:out value="${categorie.getIdC()}"></c:out> 
							<c:out value="${categorie.getLibelle()}"></c:out> 
				<td><a href="Produit?idCategorie=${categorie.getIdC()}">${categorie.getLibelle() }</a></td> 
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>