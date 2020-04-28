<%@ include file="__header.jsp"%>
<%@ include file="menu_ministere.jsp"%>
<section class="page-section">
	<div class="container">
	<a href="AjoutEtablissement"
			class="btn btn-success">Ajouter une établissement</a>	
		<div class="row">
		
			<div class="vcenter col-md-12 text-center">
				<div class="visible-sm-block visible-xs-block top-margin-10">
					<div class="form-box-cha9a9a widget bottom-pad-0"
						style="padding-top: 0px;"></div>
				</div>

				<div class="form-box-cha9a9a top-margin-20"
					style="padding: 10px !important;">
					<div class="container">
						<h1>Listes des Besoins</h1>
						<div class="row">
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Nom Produit</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Date Besoin</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Etat</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Q_Initiale</span></strong>
							</div>
							<div class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Q_Restante</span></strong>
							</div>
							<div class="col-xs-2 col-sm-2 text-center lr-pad-10">
								<strong><span class="text-color">Priorite</span></strong>
							</div>
						</div>
						<hr class="margin-20">
						<c:forEach var="besoin" items="${besoins}">
								<div class="row">
									<div class="col-xs-2 col-sm-2 text-center">
										<h5>${besoin.getProduit().getLibelle()}</h5>
									</div>
									<div class="col-xs-2 col-sm-2 text-center">
										<h5>${besoin.getDateBesoin()}</h5>
									</div>
									<div class="col-xs-2 col-sm-2 text-center">
										<h5>${besoin.getEtat()}</h5>
									</div>
									<div class="col-xs-2 col-sm-2 text-center">
										<h5>${besoin.getQuantiteInitiale()}</h5>
									</div>
									<div class="col-xs-2 col-sm-2 text-center">
										<h5>${besoin.getQuantiteRestante()}</h5>
									</div>
									<div class="col-xs-2 col-sm-2 text-center">
										<h5>${besoin.getPriorite()}</h5>
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