<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="__header.jsp"%>

<%@ include file="menu_1.jsp"%>



<section class="page-section">
	<div class="container">


		<div class="row">
			<div class="section-title margin-0">
				<h2 class="title">Gérer vos dons des services sanitaires</h2>
			</div>
		</div>
		<form name="new_fund" method="post" class="form-group"
			action="${pageContext.request.contextPath}/Dashboard_ministere">
			<div class="row">
				<div class="col-md-3 text-center"></div>
				<div class="col-md-3 text-center">
					<input class="btn btn-default fs20 white igive-btn form-control"
						type="submit" name="action" value="Voir tous les dons en nature">
				</div>
				<div class="col-md-3 text-center">
					<input class="btn btn-default fs20 white igive-btn form-control"
						type="submit" name="action" value="Voir tous les reglements">
				</div>
			</div>
		</form>
		<form name="new_fund" method="post" class="form-group"
			action="${pageContext.request.contextPath}/Dashboard_ministere">
			<c:choose>
				<c:when test="${param.action=='Voir tous les dons en nature'}">
					<div class="row">
						<div class="vcenter col-md-12 text-center">
							<div class="visible-sm-block visible-xs-block top-margin-10">
								<div class="form-box-cha9a9a widget bottom-pad-0"
									style="padding-top: 0px;"></div>
							</div>
							<div class="form-box-cha9a9a top-margin-20"
								style="padding: 10px !important;">
								<div class="container">
									<h1>Listes des Dons en nature</h1>
									<c:forEach items="${don_en_nature}" var="d">
										<div class="row">
											<div
												class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
												<strong><span class="text-color">Photo Don</span></strong>
											</div>
											<div
												class="col-xs-10 col-sm-10 text-center fund-bottom-border lr-pad-10">

												<div class="container">
													<div class="row">
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Nom Don
															</span></strong>
														</div>
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Bénéficiaire
															</span></strong>
														</div>
														<div
															class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Donnateur
															</span></strong>
														</div>
														<div
															class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Prix
																	totale </span></strong>
														</div>
														<div
															class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Quantite
															</span></strong>
														</div>
													</div>
													<div class="row">
														<div class="col-xs-3 col-sm-3 text-center">
															<h5>${d.nom_produit}</h5>
														</div>
														<div class="col-xs-3 col-sm-3 text-center">
															<h5>Etablissement</h5>
														</div>
														<div class="col-xs-2 col-sm-2 text-center">
															<h5>Donnateur</h5>
														</div>
														<div class="col-xs-2 col-sm-2 text-center">
															<h5>${d.prix_totale}</h5>
														</div>
														<div class="col-xs-2 col-sm-2 text-center">
															<h5>${d.quantite}</h5>
														</div>
													</div>
													<hr class="margin-20">
													<div class="row">
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Est
																	acceptee</span></strong>
														</div>
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Est
																	supprimee</span></strong>
														</div>
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Accepter</span></strong>
														</div>
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Supprimer</span></strong>
														</div>
													</div>
													<div class="row">
														<div class="col-xs-3 col-sm-3 text-center">
															<h5>${d.estAccepte}</h5>
														</div>
														<div class="col-xs-3 col-sm-3 text-center">
															<h5>${d.estSupprime}</h5>
														</div>
														<div class="col-xs-3 col-sm-3 text-center">
																 <a href="accepter_don?code_don_en_nature=${d.id_don}">Accepter</a>															 
														</div>
														<div class="col-xs-3 col-sm-3 text-center">
															<a href="supprimer_don?code_don_en_nature=${d.id_don}">Supprimer</a>
														</div>
													</div>
												</div>

											</div>
										</div>
										<hr class="margin-20">
									</c:forEach>
								</div>
							</div>
						</div>
					</div>
				</c:when>
				<c:when test="${param.action=='Voir tous les reglements'}">
					<div class="row">
						<div class="vcenter col-md-12 text-center">
							<div class="visible-sm-block visible-xs-block top-margin-10">
								<div class="form-box-cha9a9a widget bottom-pad-0"
									style="padding-top: 0px;"></div>
							</div>
							<div class="form-box-cha9a9a top-margin-20"
								style="padding: 10px !important;">
								<div class="container">
									<h1>Listes des Dons Reglements</h1>
									<c:forEach items="${reglement}" var="d">
										<div class="row">
											<div
												class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
												<strong><span class="text-color">Photo Don</span></strong>
											</div>
											<div
												class="col-xs-10 col-sm-10 text-center fund-bottom-border lr-pad-10">

												<div class="container">
													<div class="row">
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Montant
															</span></strong>
														</div>
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Bénéficiaire
															</span></strong>
														</div>
														<div
															class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Donnateur
															</span></strong>
														</div>
														<div
															class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Mode Reglement
																	 </span></strong>
														</div>
														<div
															class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Date Reglement
															</span></strong>
														</div>
													</div>
													<div class="row">
														<div class="col-xs-3 col-sm-3 text-center">
															<h5>${d.montant}</h5>
														</div>
														<div class="col-xs-3 col-sm-3 text-center">
															<h5>Etablissement</h5>
														</div>
														<div class="col-xs-2 col-sm-2 text-center">
															<h5>Donnateur</h5>
														</div>
														<div class="col-xs-2 col-sm-2 text-center">
															<h5>${d.modeReglement}</h5>
														</div>
														<div class="col-xs-2 col-sm-2 text-center">
															<h5>${d.dateReglement}</h5>
														</div>
													</div>
													<hr class="margin-20">
													<div class="row">
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Est
																	acceptee</span></strong>
														</div>
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Est
																	supprimee</span></strong>
														</div>
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Accepter</span></strong>
														</div>
														<div
															class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
															<strong><span class="text-color">Supprimer</span></strong>
														</div>
													</div>
													<div class="row">
														<div class="col-xs-3 col-sm-3 text-center">
															<h5>${d.estAccepte}</h5>
														</div>
														<div class="col-xs-3 col-sm-3 text-center">
															<h5>${d.estSupprime}</h5>
														</div>
														<div class="col-xs-3 col-sm-3 text-center">
																 <a href="accepter_don?code_reglement=${d.id_don}">Accepter</a>
														</div>
														<div class="col-xs-3 col-sm-3 text-center">
															<a href="supprimer_don?code_reglement=${d.id_don}">Supprimer</a>
														</div>
													</div>
												</div>

											</div>
										</div>
										<hr class="margin-20">
									</c:forEach>
								</div>
							</div>
						</div>
					</div>
				</c:when>
			</c:choose>
		</form>
	</div>
</section>
<%@ include file="__footer.jsp"%>