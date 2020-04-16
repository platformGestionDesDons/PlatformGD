<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="__header.jsp"%>


<form name="new_fund" method="post" class="form-group"
	action="${pageContext.request.contextPath}/Dashboard_ministere">
	<section class="page-section">
		<div class="container">


			<div class="row">
				<div class="section-title margin-0">
					<h2 class="title">Gérer vos dons des services sanitaires</h2>
				</div>
			</div>
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
			<div class="row">

				<div class="col-md-3 text-center">
					<select id="new_fund_type" name="visibilite" class="form-control"><option
							value="30">
							<div class="cha9a9a-title text-center pad-5">
								<option value="1">mohamed</option>
							</div></select>
				</div>
				<div class="col-md-3 text-center">
					<input class="btn btn-default white form-control" type="submit"
						name="action" value="Etablissement">
				</div>

				<div class="col-md-3 text-center">
					<select id="new_fund_type" name="visibilite" class="form-control"><option
							value="30">
							<div class="cha9a9a-title text-center pad-5">
								<option value="1">mohamed</option>
							</div></select>
				</div>
				<div class="col-md-3 text-center">
					<input class="btn btn-default white form-control" type="submit"
						name="action" value="Donnateur">
				</div>
			</div>
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
									<div class="row">
										<div
											class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Nom produit</span></strong>
										</div>
										<div
											class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Bénéficiaire</span></strong>
										</div>
										<div
											class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Est acceptee</span></strong>
										</div>
										<div
											class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Est
													supprimee</span></strong>
										</div>
										<div class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Prix totale</span></strong>
										</div>
										<div class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Quantite</span></strong>
										</div>
										<div class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Accepter</span></strong>
										</div>
										<div class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Supprimer</span></strong>
										</div>
									</div>
									<hr class="margin-20">
									<c:forEach items="${don}" var="d">
										<div class="row">
											<div class="col-xs-2 col-sm-2 text-center">
												<h5>${d.nom_produit}</h5>
											</div>
											<div class="col-xs-3 col-sm-3 text-center">
												<h5>${d.visibilite}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<h5>${d.estAccepte}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<h5>${d.estSupprime}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<h5>${d.prix_totale}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<h5>${d.quantite}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<input
													class="btn"
													type="submit" name="action" value="Accepter">
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<input
													class="btn"
													type="submit" name="action" value="Supprimer">
											</div>
										</div>
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
									<h1>Listes des Dons en nature</h1>
									<div class="row">
										<div
											class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Montant</span></strong>
										</div>
										<div
											class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Bénéficiaire</span></strong>
										</div>
										<div
											class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Est acceptee</span></strong>
										</div>
										<div
											class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Est
													supprimee</span></strong>
										</div>
										<div class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Mode reglement</span></strong>
										</div>
										<div class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Date reglement</span></strong>
										</div>
										<div class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Accepter</span></strong>
										</div>
										<div class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
											<strong><span class="text-color">Supprimer</span></strong>
										</div>
									</div>
									<hr class="margin-20">
									<c:forEach items="${don}" var="d">
										<div class="row">
											<div class="col-xs-2 col-sm-2 text-center">
												<h5>${d.montant}</h5>
											</div>
											<div class="col-xs-3 col-sm-3 text-center">
												<h5>${d.visibilite}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<h5>${d.estAccepte}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<h5>${d.estSupprime}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<h5>${d.modeReglement}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<h5>${d.dateReglement}</h5>
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<input
													class="btn"
													type="submit" name="action" value="Accepter">
											</div>
											<div class="col-xs-1 col-sm-1 text-center">
												<input
													class="btn"
													type="submit" name="action" value="Supprimer">
											</div>
										</div>
									</c:forEach>
								</div>
							</div>
						</div>
					</div>
				</c:when>
				<c:when test="${param.action=='Etablissement'}">
					<div class="row">
						<div
							class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
							<strong><span class="text-color">Besoin</span></strong>
						</div>
						<div
							class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
							<strong><span class="text-color">Quantité voulue</span></strong>
						</div>
						<div
							class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
							<strong><span class="text-color">Date</span></strong>
						</div>
						<div
							class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
							<strong><span class="text-color">Quantité servie</span></strong>
						</div>
						<div class="col-xs-1 col-sm-1 text-center lr-pad-10">
							<strong><span class="text-color">Reste à
									collecter</span></strong>
						</div>
						<div class="col-xs-1 col-sm-1 text-center lr-pad-10">
							<strong><span class="text-color">Prix U</span></strong>
						</div>
						<div class="col-xs-1 col-sm-1 text-center lr-pad-10">
							<strong><span class="text-color">Nom
									etablissement</span></strong>
						</div>
						<div class="col-xs-1 col-sm-1 text-center lr-pad-10">
							<strong><span class="text-color">status</span></strong>
						</div>
					</div>
				</c:when>
				<c:when test="${param.action=='Donnateur'}">
					<div class="row">
						<div
							class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
							<strong><span class="text-color">Besoin</span></strong>
						</div>
						<div
							class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
							<strong><span class="text-color">Quantité voulue</span></strong>
						</div>
						<div
							class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
							<strong><span class="text-color">Date</span></strong>
						</div>
						<div
							class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
							<strong><span class="text-color">Quantité servie</span></strong>
						</div>
						<div class="col-xs-1 col-sm-1 text-center lr-pad-10">
							<strong><span class="text-color">Reste à
									collecter</span></strong>
						</div>
						<div class="col-xs-1 col-sm-1 text-center lr-pad-10">
							<strong><span class="text-color">Prix U</span></strong>
						</div>
						<div class="col-xs-1 col-sm-1 text-center lr-pad-10">
							<strong><span class="text-color">Nom
									etablissement</span></strong>
						</div>
						<div class="col-xs-1 col-sm-1 text-center lr-pad-10">
							<strong><span class="text-color">status</span></strong>
						</div>
					</div>
				</c:when>
			</c:choose>

		</div>
	</section>
</form>
<%@ include file="__footer.jsp"%>