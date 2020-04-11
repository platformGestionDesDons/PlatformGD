
<%@ include file="pagehead.jsp" %>
	<div class="container">
		<h1>Liste des Besoins :</h1>
		<h2>Nombre de besoins :
			${NombreBesoin}</h2>
		<table class="table table-hover">
			<c:forEach var="besoin" items="${ListBesoins}">
				<tr>
				<a href="produits?idProduit=${besoin.getProduit().getIdProduit()}">${besoin.getProduit().getLibelle() } </a>
					<td>
					<small class="form-text text-muted">
							${produit.getDescriptionTechnique() } 
							</small>
					</td>

<!-- 					<td><a -->
<%-- 						href="AjoutPanier?idProduit=${produit.getIdProduit()}&quantite=1" --%>
<!-- 						class="btn btn-warning">Ajouter au panier</a></td> -->
<!-- 				</tr> -->
			</c:forEach>
		</table>
	</div>
</body>
</html>