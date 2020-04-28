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
						<label class="control-label required" for="new_fund_name">Date
							de réception</label> <input type="text" id="new_fund_name"
							name="date_planifiee" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Voulez
							vous afficher votre nom avec les listes des donnateurs ?</label> <span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span> <select id="new_fund_type"
							name="visibilite" class="form-control">
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
							de réglement</label> <select id="new_fund_type" name="mode_reglement"
							class="form-control"><option value="30">
								<div class="cha9a9a-title text-center pad-5">
									<option value="Chéque">Chéque</option>
									<option value="Virement bancaire">Virement bancaire</option>
								</div></select>
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">
							Montant</label> <input type="text" id="new_fund_name" name="montant"
							class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Nom
							Bénéficiaire</label> <select id="new_fund_type" name="nom_bene"
							class="form-control"><option value="30">
								<div class="cha9a9a-title text-center pad-5">
									<c:forEach items="${beneficiaire}" var="bene">
										<option value="${bene.getIdEtablissement()}">${bene.getNomEtablissement()}</option>
									</c:forEach>
								</div></select>

					</div>
					<div class="form-group">
						<label class="control-label required" for="photos">Ajouter
							des photos</label>
						<!-- 		<span class="required text-danger form-asterisk" title="Ce champ est requis">*</span>	 -->
						<input type="file" name="file" multiple />
					</div>
					<button class="btn btn-default btn-block" type="submit"
						name="action" value="Faire un don reglement">Faire un don</button>

				</form>

			</div>
		</div>
	</div>
</section>
<%@ include file="__footer.jsp"%>