
<%@ include file="__header.jsp"%>
<section class="page-section light-bg">
<div class="container">	

 <form name="formAjoutBesoin" action="besoins" method="post" class="col-md-6 col-md-offset-3 form-box-cha9a9a" enctype="multipart/form-data"> 
<h1>Ajouter un besoin</h1>

<div class="form-group">
	<div class="form-group">
		<label class="control-label required" for="produit">Produit</label>
		<span class="required text-danger form-asterisk" title="Ce champ est requis">*</span>
		<select name="produit" class ="form-control" required="required">
			<c:forEach var="produit" items="${produits}">
				<option value="${produit.getIdProduit()}">${produit.getLibelle()}</option>
			</c:forEach>
		</select>
	</div>

	<div class="form-group">
		<label class="control-label required" for="quantite">Quantit� demand�e</label>
		<span class="required text-danger form-asterisk" title="Ce champ est requis">*</span>
		<input type="number" name="quantite" value="0" min="0" class="form-control" required="required"/>
	</div>

	<div class="form-group">
		<label class="control-label required" for="Priorite">Priorit�</label>
		<span class="required text-danger form-asterisk" title="Ce champ est requis">*</span>
		   <input type="radio" name="Priorite" value="forte" required /> Forte
		   <input type="radio" name="Priorite" value="moyenne" /> Moyenne
		   <input type="radio" name="Priorite" value="faible" /> Faible
	</div>
	
	<div class="form-group">
		<label class="control-label required" for="motif">Motif</label>
		<span class="required text-danger form-asterisk" title="Ce champ est requis">*</span>	
   		<textarea name="motif" rows="6" cols="40" class="form-control" required="required">Vous pouvez saisir ici le motif.</textarea>
   	</div>

	<div class="form-group">
		<label class="control-label required" for="photos">Ajouter des photos</label>
<!-- 		<span class="required text-danger form-asterisk" title="Ce champ est requis">*</span>	 -->
		<input type="file" name="file" multiple />
	</div>
	<div class="form-group">
	 <button type="submit" class="btn btn-default btn-block">Envoyer</button>
	 <a href="besoins" class="btn btn-default btn-block" role="button">Annuler</a>
	</div>
</div>
</form> 
	</div>
	
	</section>
<%@ include file="__footer.jsp"%>