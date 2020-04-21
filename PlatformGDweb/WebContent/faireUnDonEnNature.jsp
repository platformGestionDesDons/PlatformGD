<%@ include file="__header.jsp"%>

<%@ include file="menu_1.jsp"%>
<div class="page-header">
	<div class="container">
		<h3 class="title text-center">Créer votre Don</h3>
	</div>
</div>
<section class="page-section light-bg">

	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3 form-box-cha9a9a">

				<form name="new_fund" method="post" class="form-group"
					action="${pageContext.request.contextPath}/don_en_nature"
					enctype="multipart/form-data">
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Nom
							besoin </label> <span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span><select id="new_fund_type" name="nom_produit"
							class="form-control"><option value="30">
								<div class="cha9a9a-title text-center pad-5">
									<c:forEach items="${besoin_etab}" var="b">
										<option value="${b.getProduit().getIdProduit()}">${b.getProduit().getLibelle()}</option>
									</c:forEach>
								</div></select>
					</div>
					<!--  <div class="form-group">
						<label class="control-label required" for="new_fund_name">Nom
							produit ( indépendant du besoin )</label> <input type="text"
							id="new_fund_name" name="" class="form-control" />
					</div> -->
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Date
							de réception</label> <span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span><input type="text" id="new_fund_name" name="date_planifiee"
							class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Voulez
							vous afficher votre nom avec la liste des donnateurs ?</label> <span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span> <select id="new_fund_type"
							name="visibilite" class="form-control">
							<div class="cha9a9a-title text-center pad-5">
								<option value="OUI">OUI</option>
								<option value="NON">NON</option>
							</div>
						</select>
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Prix
							totale</label> <span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span><input type="text" id="new_fund_name" name="prix_totale"
							class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Quantite</label><span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span>
						<input type="text" id="new_fund_name" name="quantite"
							class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Nom
							Bénéficiaire</label> <span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span><select id="new_fund_type" name="nom_produit"
							class="form-control"><option value="30">
								<div class="cha9a9a-title text-center pad-5">
									<c:forEach items="${beneficiaire}" var="bene">
										<option value="${bene.getIdEtablissement()}">${bene.getNomEtablissement()}</option>
									</c:forEach>
								</div></select>
					</div>
					<!-- <div class="form-group">
						<label class="control-label required" for="new_fund_name">Nom
							Fournisseur</label> <select id="new_fund_type" name="nom_produit"
							class="form-control"><option value="30">
								<div class="cha9a9a-title text-center pad-5">
									<c:forEach items="${fournisseur}" var="c">
										<option value="${c.getIdF()}">${c.getLibelle()}</option>
									</c:forEach>
								</div></select>
					</div> -->
					<div class="form-group">
						<label class="control-label required" for="photos">Ajouter
							des photos</label>
						<!-- 		<span class="required text-danger form-asterisk" title="Ce champ est requis">*</span>	 -->
						<input type="file" name="file" multiple />
					</div>
					<button class="btn btn-default btn-block" type="submit"
						name="action" value="Faire un don en nature">
						<strong>Faire un don</strong>
					</button>

				</form>

			</div>
		</div>
	</div>
</section>
<%@ include file="__footer.jsp"%>