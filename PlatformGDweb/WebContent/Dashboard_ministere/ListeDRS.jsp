<%@ include file="__header.jsp"%>
<%@ include file="menu_ministere.jsp"%>
<section class="page-section">
	<div class="container">
		<div class="row">
			<div class="vcenter col-md-12 text-center">
				<div class="visible-sm-block visible-xs-block top-margin-10">
					<div class="form-box-cha9a9a widget bottom-pad-0"
						style="padding-top: 0px;"></div>
				</div>

				<div class="form-box-cha9a9a top-margin-20"
					style="padding: 10px !important;">
					<div class="container">
						<h1>Listes des DRS</h1>
						<div class="row">
							<div
								class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Nom DRS</span></strong>
							</div>
							<div
								class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Adresse</span></strong>
							</div>
							<div
								class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Contact Responsable</span></strong>
							</div>
							<div
								class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Nombre Etablissements</span></strong>
							</div>
						</div>
						<hr class="margin-20">
						<c:forEach var="etablissement" items="${etablissement}">
								<div class="row">
									<div class="col-xs-3 col-sm-3 text-center">
										<h5>${etablissement.getNomEtablissement()}</h5>
									</div>
									<div class="col-xs-3 col-sm-3 text-center">
										<!-- <h5>${etablissement.getAdresses().iterator().next().getGouvernorat()}</h5>-->
									</div>
									<div class="col-xs-3 col-sm-3 text-center">
										<!-- <h5>${etablissement.getUtilisateur().getTelephone().iterator().next()}</h5>-->
									</div>
									<div class="col-xs-3 col-sm-3 text-center">
										<h5>-</h5>
									</div>
								</div>
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