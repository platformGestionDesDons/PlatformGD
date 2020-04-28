<%@ include file="__header.jsp"%>
<%@ include file="menu_ministere.jsp"%>
<section class="page-section">
	<div class="container">
		<div class="row">
		<a href="AjoutEtablissement"
			class="btn btn-success">Ajouter une établissement</a>	
			<div class="vcenter col-md-12 text-center">
				<div class="visible-sm-block visible-xs-block top-margin-10">
					<div class="form-box-cha9a9a widget bottom-pad-0"
						style="padding-top: 0px;"></div>
				</div>

				<div class="form-box-cha9a9a top-margin-20"
					style="padding: 10px !important;">
					<div class="container">
						<h1>Listes des Intermédiaires</h1>
						<div class="row">
							<div
								class="col-xs-4 col-sm-4 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Nom Etablissement Intermedaire</span></strong>
							</div>
							<div
								class="col-xs-4 col-sm-4 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Adresse</span></strong>
							</div>
							<div
								class="col-xs-4 col-sm-4 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Contact Responsable</span></strong>
							</div>
						</div>
						<hr class="margin-20">
						<c:forEach items="${etablissements}"  var="etab">
							<c:if test="${etab.getIntermediaire() == true}">
								<div class="row">
									<div class="col-xs-4 col-sm-4 text-center">
										<h5>${etab.getNomEtablissement()}</h5>
									</div>
									<div class="col-xs-4 col-sm-4 text-center">
										<!-- <h5>${etablissement.getAdresses().iterator().next().getGouvernorat()}</h5>-->
									</div>
									<div class="col-xs-4 col-sm-4 text-center">
										<!-- <h5>${etablissement.getUtilisateur().getTelephone().iterator().next()}</h5>-->
									</div>
								</div>
							</c:if>
						</c:forEach>
						<div class="row">
							<a href="#" class="btn btn-default btn-menu"><i
								class="fa icon-plus2"></i>Voir plus</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<%@ include file="__footer.jsp"%>