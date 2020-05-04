
<%@ include file="__header.jsp"%>

<%@ include file="menu_etablissement.jsp"%>
<section class="page-section light-bg">
	<div class="container">
		<h1>Liste des cat�gories</h1>

 <a href="ajoutCategorie"
			class="btn btn-success">Ajouter une cat�gorie</a>			
			
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Cat�gorie</th>
      <th scope="col">Produits</th>
    </tr>
  </thead>
  <tbody>
<c:forEach var="categorie" items="${categories}">			
    <tr id="${categorie.getIdC()}">
      <td><c:out value="${categorie.getLibelle() }"></c:out></td>
      	<td>
      	<ul>
      		<c:forEach var="produit" items="${categorie.getProduits()}">
      			<li >
      			<c:out value="${produit.getLibelle()}"></c:out>
      			</li>
      		</c:forEach>
      	</ul>
      	</td>
		<td><button class="btn btn-danger btn-sm" id="deletecategorie">
					Supprimer </button></td>
			
    </tr>
   </c:forEach>
  </tbody>
</table>

	</div>
<script>
		$(document).ready(function() {
			$("button").click(function() {
				let id = $(this).closest('tr').attr('id');
				switch (this.id) {
					case "deletecategorie":
						console.log("delete categorie" + id);
						async("delete",{id:id})
						break;
				}
			})
			function async(method,data){
				console.log(data);
				$.ajax({
					url:"categories",
					data:data,
					method:method
			})
			.done(
					function(data){
						console.log(data);
						if(data){
							location.href="categories"
						}
					}
			);
		}

		})	
</script>
</section>
<%@ include file="__footer.jsp"%>