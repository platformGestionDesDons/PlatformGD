
<%@ include file="pagehead.jsp" %>
	<div class="container">
		<h1>Catégorie : ${categorie}</h1>
		<h2>Nombre de produit disponible dans cette catégorie :
			${NombreProduit}</h2>
		<table class="table table-hover">
			<c:forEach var="produit" items="${ListProduits}">
				<tr>
					<td>${produit.getLibelle() } 
					<small class="form-text text-muted">
							${produit.getDescriptionTechnique() } 
							</small>
					</td>
					<td>${produit.getPrixMax() }</td>
					<td>${produit.getPrixMin() } </td>
					<td><a
						href="AjoutPanier?idProduit=${produit.getIdProduit()}&quantite=1"
						class="btn btn-warning">Ajouter au panier</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>