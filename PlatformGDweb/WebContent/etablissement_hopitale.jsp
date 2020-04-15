<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="__header.jsp"%>
<section class="page-section">
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
							<div class="fund-organizer-fixed text-white text-left">Hôpital
								Farhat-Hached de Sousse</div>
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
								<strong><span class="text-color">code besoin</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Nom besoin</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">quantite initiale</span></strong>
							</div>
							<div
								class="col-xs-2 col-sm-2 text-center fund-bottom-border lr-pad-10">
								<strong><span class="text-color">Quantite restante</span></strong>
							</div>
							<div class="col-xs-2 col-sm-2 text-center lr-pad-10">
								<strong><span class="text-color">Etat</span></strong>
							</div>
						</div>
						<hr class="margin-20">
						<c:forEach items="${besoin}" var="b">
						<div class="row">
							<div class="col-xs-2 col-sm-2 text-center">
								<img src="uploads/images/bavette.jpg"
									alt="Makers Against Corona (Masques pour l&#039;équipe medicale)"
									title="Makers Against Corona (Masques pour l&#039;équipe medicale)">
							</div>
							<div class="col-xs-2 col-sm-2 text-center">
								<h5>${b.id_besoin}</h5>
							</div>
							<div class="col-xs-2 col-sm-2 text-center">
								<h5>${b.nom_besoin}</h5>
							</div>
							<div class="col-xs-2 col-sm-2 text-center">
								<h5>${b.quantite_initiale}</h5>
							</div>
							<div class="col-xs-2 col-sm-2 text-center">
								<h5>${b.quantite_restante}</h5>
							</div>
							<div class="col-xs-2 col-sm-2 text-center">
								<h5>${b.etat}</h5>
							</div>
						</div>
						</c:forEach>
						<hr class="margin-20">
						<div class="row">
							<div class="col-md-12 text-center top-pad-20">
								<div>
									<a href="#"
										class="btn btn-box btn-default fs20 pad-20 animated fadeInDown visible"
										style="min-width: 240px;" data-animation="fadeInDown">Voir
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
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>Donnateur 1</h5>
							</div>
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>Bavettes</h5>
							</div>
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>500 Unités</h5>
							</div>
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>01-04-2020</h5>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>Donnateur 2</h5>
							</div>
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>Gel désinfectant</h5>
							</div>
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>100L</h5>
							</div>
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>02-04-2020</h5>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>Anonyme</h5>
							</div>
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>Javel</h5>
							</div>
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>100L</h5>
							</div>
							<div class="col-xs-3 col-sm-3 text-center">
								<h5>02-04-2020</h5>
							</div>
						</div>
						<hr class="margin-20">
						<div class="row">
							<div class="col-md-12 text-center top-pad-20">
								<div>
									<a href="#"
										class="btn btn-box btn-default fs20 pad-20 animated fadeInDown visible"
										style="min-width: 240px;" data-animation="fadeInDown">Voir
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