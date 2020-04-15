<%@ include file="__header.jsp"%>
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
					action="${pageContext.request.contextPath}/don_reglement">
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Date
							planifiee</label> <input type="text" id="new_fund_name"
							name="date_planifiee" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Voulez
							vous afficher votre nom avec les listes des donnateurs ?</label> <span
							class="required text-danger form-asterisk"
							title="Ce champ est requis">*</span> 
						<select id="new_fund_type"
							name="visibilite" class="form-control"><option
								value="30">
								<div class="cha9a9a-title text-center pad-5">
									<option value="1">OUI</option>
									<option value="2">NON</option>
								</div>
						</select>
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Vu</label>
						<input type="text" id="new_fund_name" name="vu"
							class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Date de reglement
							</label> <input type="text" id="new_fund_name" name="date_reglement"
							class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">Mode de reglement</label>
						<select id="new_fund_type"
							name="mode_reglement" class="form-control"><option
								value="30">
								<div class="cha9a9a-title text-center pad-5">
									<option value="1">Cheque</option>
									<option value="2">Virement bancaire</option>
								</div>
						</select>
					</div>
					<div class="form-group">
						<label class="control-label required" for="new_fund_name">
							Montant</label> <input type="text" id="new_fund_name" name="montant"
							class="form-control" />
					</div>

					<button class="btn btn-default btn-block" type="submit"
						name="action" value="Faire un don reglement">Faire un don</button>

				</form>

			</div>
		</div>
	</div>
</section>
<%@ include file="__footer.jsp"%>