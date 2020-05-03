<%@ include file="__header.jsp"%>

<%@ include file="menu_donnateur.jsp"%>
<section class="page-section light-bg">
	<div class="overlay"></div>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3 form-box-cha9a9a">
				<h3 class="title">Créer un don</h3>
						<hr>
				<form name="new_fund" method="post" class="form-group"
					action="${pageContext.request.contextPath}/don_reglement"
					enctype="multipart/form-data">
					
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Nom
							Bénéficiaire</label> <span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span>
						<div class="cha9a9a-title text-center pad-5">
							<select id="nom_etablissement" name="nom_etablissement" class="form-control" disabled>
								<option value="${etablisement.getIdEtablissement()}" selected>${etablisement.getNomEtablissement()}</option>
							</select>
							<input type="hidden" name="nom_etablissement" value="${beneficiaire.getIdEtablissement()}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Date
							de réception</label> 
							<input type="text" id="new_fund_name"
							name="date_planifiee" class="form-control" required/>
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Voulez
							vous afficher votre nom avec les listes des donnateurs ?</label> <span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span> <select id="new_fund_type"
							name="visibilite" class="form-control" required>
							<div class="cha9a9a-title text-center pad-5">
								<option value="OUI">Oui</option>
								<option value="NON">Non</option>
							</div>
						</select>
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Date
							de réglement </label> <input type="text" id="new_fund_name"
							name="date_reglement" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Mode
							de réglement</label> 
						<div class="cha9a9a-title text-center pad-5">
							<select id="new_fund_type" name="mode_reglement" class="form-control">
									<option value="30">
									<option value="Chéque">Chéque</option>
									<option value="Virement bancaire">Virement bancaire</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">
							Montant</label> <input type="number" id="new_fund_name" name="montant"
							class="form-control" step=any  required />
					</div>

					<div class="form-group">
						<label class="control-label required" for="photos">Ajouter des photos</label>
						<span class="required text-danger form-asterisk" >(formats acceptés : jpeg/png)</span>	
						<input type="file" name="file" accept="image/*" multiple />
					</div>
					<button class="btn btn-default btn-block" type="submit"
						name="action" value="Faire un don reglement">Faire un don</button>

				</form>

			</div>
		</div>
	</div>
</section>
<%@ include file="__footer.jsp"%>