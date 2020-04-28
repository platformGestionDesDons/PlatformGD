
<%@ include file="__header.jsp"%>

<%@ include file="menu_etablissement.jsp"%>
<section class="page-section light-bg">
<div class="overlay"></div>
<div class="container">	

 <form name="formAjoutProduit" action="categories" method="post" class="col-md-6 col-md-offset-3 form-box-cha9a9a">
<h1>Ajouter une cat�gorie</h1>

  <div class="form-group">
 	 <div class="form-group">
	    <label class="control-label required" for="libelle">Libell�</label>
		<span class="required text-danger form-asterisk" title="Ce champ est requis">*</span>
	    <input type="text" class="form-control" id="libelle" name="libelle" required="required">
	  </div>

  	<div class="form-group">
	 <button type="submit" class="btn btn-default btn-block">Ajouter</button>
	 <a href="categories" class="btn btn-default btn-block" role="button">Annuler</a>
	</div>
  </div>
</form>
</div>
</section>
<%@ include file="__footer.jsp"%>