<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="__header.jsp"%>
<section class="page-section">
<div class="overlay"></div>
	<div class="container">


		<div class="row">
			<div class="section-title margin-0">
				<h2 class="title">Collecter des besoins pour l&#039;équipe
					medicale</h2>
			</div>
		</div>

		<div class="row">

			<div class="col-md-9">
				<div class="form-box-cha9a9a">
					<div class="container">
						<div class="fund-image -opacity text-center">
							<img src="media/cache/cha9a9a_pic/uploads/images/1.jpg"
								alt="Makers Against Corona (Masques pour l&#039;équipe medicale)"
								title="Makers Against Corona (Masques pour l&#039;équipe medicale)">
							<div class="fund-organizer-fixed text-white text-left">${etablissement.getNomEtablissement()}</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
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
								<strong><span class="text-color"></span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Besoin</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Date besoin</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Quantite
										Initiale</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Quantite
										Restante</span></strong>
							</div>
							<div
								class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Motif</span></strong>
							</div>
							<div
								class="col-xs-1 col-sm-1 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Priorité</span></strong>
							</div>
						</div>
						<hr class="margin-20">
						<c:forEach items="${besoin_etab}" var="b">
							<div class="row">
								<div class="col-xs-2 col-sm-2 text-center">
									<img src="uploads/images/bavette.jpg"
										alt="Makers Against Corona (Masques pour l&#039;équipe medicale)"
										title="Makers Against Corona (Masques pour l&#039;équipe medicale)">
								</div>
								<div class="col-xs-2 col-sm-2 text-center">
									<h5>
										<a href="produit?idProduit=${b.getProduit().getIdProduit()}">${b.getProduit().getLibelle()}</a>
									</h5>
								</div>
								<div class="col-xs-2 col-sm-2 text-center">
									<h5>${b.getDateBesoin()}</h5>
								</div>
								<div class="col-xs-2 col-sm-2 text-center">
									<h5>${b.getQuantiteInitiale()}</h5>
								</div>
								<div class="col-xs-2 col-sm-2 text-center">
									<h5>${b.getQuantiteRestante()}</h5>
								</div>
								<div class="col-xs-1 col-sm-1 text-center">
									<h5>${b.getEtat()}</h5>
								</div>
								<div class="col-xs-1 col-sm-1 text-center">
									<h5>${b.getPriorite()}</h5>
								</div>
							</div>
							<hr class="margin-20">
						</c:forEach>
						<hr class="margin-20">
						<div class="row">
							<div class="col-md-12 text-center top-pad-20">
								<div>
									<a href="#"
										class="btn btn-box btn-default fs20 pad-20 animated fadeInDown visible"
										style="min-width: 100px;" data-animation="fadeInDown">Voir
										plus</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="form-box-cha9a9a top-margin-20"
					style="padding: 10px !important;">
					<div class="container">
						<h1>Listes des donnateurs</h1>
						<div class="row">
							<div
								class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Nom Donnateur</span></strong>
							</div>
							<div
								class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Nom besoin</span></strong>
							</div>
							<div
								class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Quantité donnée</span></strong>
							</div>
							<div class="col-xs-3 col-sm-3 text-center lr-pad-10">
								<strong><span class="text-color">Date</span></strong>
							</div>
						</div>
						<hr class="margin-20">
						
						<div class="row">
							<div class="col-md-12 text-center top-pad-20">
								<div>
									<a href="#"
										class="btn btn-box btn-default fs20 pad-20 animated fadeInDown visible"
										style="min-width: 100px;" data-animation="fadeInDown">Voir
										plus</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="form-box-cha9a9a top-margin-20"
					style="padding: 10px !important;">
					<div class="container">
						<h1>Listes des Fournisseurs</h1>
						<div class="row">
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Libelle
										Fournisseur</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Adresse</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Code Postal</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">E mail</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Gouvernorat</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Numéro de Tel</span></strong>
							</div>
						</div>
						<hr class="margin-20">
						<c:forEach items="${fournisseur}" var="b">
							<div class="row">
								<div class="col-xs-2 col-sm-2 fund-bottom-border text-center">
									<h5>${b.getLibelle()}</h5>
								</div>
								<div class="col-xs-2 col-sm-2 fund-bottom-border text-center">
									<h5>${b.getAdresseF()}</h5>
								</div>
								<div class="col-xs-2 col-sm-2 fund-bottom-border text-center">
									<h5>${b.getCodePostal()}</h5>
								</div>
								<div class="col-xs-2 col-sm-2 fund-bottom-border text-center">
									<h5>${b.getEmailF()}</h5>
								</div>
								<div class="col-xs-2 col-sm-2 fund-bottom-border text-center">
									<h5>${b.getGouvernorat()}</h5>
								</div>
								<div class="col-xs-2 col-sm-2 fund-bottom-border text-center">
									<h5>${b.getNumTelF()}</h5>
								</div>
							</div>
						</c:forEach> 
						<hr class="margin-20">
						<div class="row">
							<div class="col-md-12 text-center top-pad-20">
								<div>
									<a href="#"
										class="btn btn-box btn-default fs20 pad-20 animated fadeInDown visible"
										style="min-width: 100px;" data-animation="fadeInDown">Voir
										plus</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="form-box-cha9a9a top-margin-20"
					style="padding: 10px !important;">
					<div class="container">

						<form name="new_fund" method="post" class="form-group"
							action="${pageContext.request.contextPath}/faire_un_don">
							<div class="pull-right btn-box">
								<input class="btn btn-default fs20 white igive-btn form-control"
									type="submit" name="action" value="Faire un don en nature">
							</div>
							<div class="pull-left btn-box">
								<input class="btn btn-default fs20 white igive-btn form-control"
									type="submit" name="action" value="faire un don reglement">
							</div>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
</section>
<%@ include file="__footer.jsp"%>