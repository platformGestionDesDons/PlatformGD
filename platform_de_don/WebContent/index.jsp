<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>
<meta charset="UTF-8">
<title>Faire un don</title>
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=Arimo:300,400,700,400italic,700italic'
	media="none" onload="if(media!='all')media='all'">
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700'
	rel='stylesheet' type='text/css' media="none"
	onload="if(media!='all')media='all'">
<!-- Font Awesome Icons -->
<link href='assets/css/font-awesome.min.css' async rel='stylesheet'
	type='text/css' media="none" onload="if(media!='all')media='all'" />
<!-- Bootstrap core CSS -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/bootstrap-datetimepicker.min.css"
	rel="stylesheet">
<link href="assets/css/hover-dropdown-menu.css" rel="stylesheet">
<!-- Icomoon Icons -->
<link href="assets/css/icons.css" rel="stylesheet" media="none"
	onload="if(media!='all')media='all'" />
<!-- Revolution Slider -->
<link href="assets/css/revolution-slider.css" rel="stylesheet" />
<link href="assets/rs-plugin/css/settings.css" rel="stylesheet"
	media="none" onload="if(media!='all')media='all'" />
<!-- Animations -->
<link href="assets/css/animate.min.css" rel="stylesheet">
<!-- Owl Carousel Slider -->
<!-- PrettyPhoto Popup -->
<link href="assets/css/prettyPhoto.css" rel="stylesheet" media="none"
	onload="if(media!='all')media='all'" />

<link rel="stylesheet" type="text/css"
	href="assets/css/cookieconsent.min.css" media="none"
	onload="if(media!='all')media='all'" />
<!-- Custom Style -->
<link href="assets/css/style.css" async rel="stylesheet">
<link href="assets/css/scarlet.css" rel="stylesheet">
<link href="assets/css/menu.css" rel="stylesheet">
<link href="assets/css/bootstrap-social.css" rel="stylesheet"
	media="none" onload="if(media!='all')media='all'" />
<link href="assets/css/responsive.css" rel="stylesheet" />
<!-- token -->
<link href="assets/tokenfield/css/bootstrap-tokenfield.css"
	rel="stylesheet" media="none" onload="if(media!='all')media='all'">
<!-- fancy Select -->
<link href="assets/css/fancySelect.css" rel="stylesheet" media="none"
	onload="if(media!='all')media='all'" />
<link href="assets/select2/css/select2.min.css" rel="stylesheet"
	media="none" onload="if(media!='all')media='all'" />
<!-- fancy Box -->
<link rel="stylesheet" href="assets/fancybox/jquery.fancybox.css"
	type="text/css" media="screen" media="none"
	onload="if(media!='all')media='all'" />
<!-- Color Scheme -->
<link href="assets/css/color.css" rel="stylesheet">
<!-- jQuery.filter -->
<link href="assets/css/jquery.filer.css" type="text/css"
	rel="stylesheet" media="none" onload="if(media!='all')media='all'" />
<link href=".assets/css/jquery.filer-dragdropbox-theme.css"
	type="text/css" rel="stylesheet" media="none"
	onload="if(media!='all')media='all'" />

<link href="../assets/css/icheck/_all.css" type="text/css"
	rel="stylesheet" />

<link type="text/css" rel="stylesheet"
	href="../assets/css/jssocials.css" />
<link type="text/css" rel="stylesheet"
	href="../assets/css/jssocials-theme-classic.css" />

<style>
@media only screen and (min-width: 768px) {
	.arabesque::before {
		content: url('../assets/img/hr-left.png');
		/* with class ModalCarrot ??*/
		position: relative; /*or absolute*/
		z-index: 10; /*a number that's more than the modal box*/
		left: -30px;
		top: 20px;
	}
	.arabesque::after {
		content: url('../assets/img/hr-right.png');
		/* with class ModalCarrot ??*/
		position: relative; /*or absolute*/
		z-index: 10; /*a number that's more than the modal box*/
		left: 30px;
		top: 20px;
	}
}
</style>
</head>
<body>

	<header class="fixed-header">
		<!-- navbar -->
		<div id="navigation"
			class="navbar navbar-default navbar-bg-light navbar-fixed-top"
			role="navigation">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="navbar-header">
							<!-- Button For Responsive toggle -->
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">&nbsp;</span> <span class="icon-bar"></span>
								<span class="icon-bar"></span> <span class="icon-bar"></span>
							</button>

							<a class="navbar-brand scroll" href="../index.html#">
								<h6>LOGO</h6>
							</a>
						</div>
						<!-- Navbar Collapse -->
						<div class="navbar-collapse collapse">
							<!-- nav -->
							<ul class="nav navbar-nav">



								<li><a href="../login.html"> Déconnexion</a></li>

								<a href="new.html" class="btn btn-default btn-menu"><i
									class="fa icon-plus2"></i> Faire un DON</a>

							</ul>
							<!-- Right nav -->
						</div>
						<!-- /.navbar-collapse -->
					</div>
					<!-- /.col-md-12 -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container -->
		</div>
		<!-- navbar -->
	</header>






	<div class="page-header">
		<div class="container">
			<h3 class="title text-center">Choisissez le type de don</h3>
		</div>
	</div>
	<section class="page-section light-bg">

		<div class="container">
			<div class="row">
				<div class="col-md-6 col-md-offset-3 form-box-cha9a9a">
					<form name="new_fund" method="post" class="form-group" action="">
						<div class="form-group">
							<label class="control-label " for="new_fund_type">Type de don </label>
							<select id="new_fund_type" name="new_fund[type]"
								class="form-control" >
								<option>Autres</option>
								<option value="produit">Produit</option>
								<option value="cheque">Chéque</option>
								<option value="virm_bancaire">Virement bancaire</option>
							</select>
						</div>
						<div>
							<button class="btn btn-default btn-block" type="submit">Suivant</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>

	







	<footer id="footer">
		<div class="footer-widget dark-section">
			<div class="container">
				<div class="row">
					<div class="col-xs-12 col-sm-6 col-md-3 widget bottom-xs-pad-20">
						<div class="widget-title">
							<!-- Title -->
							<h3 class="title">A propos de nous</h3>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-3 widget bottom-xs-pad-20">
						<div class="widget-title">
							<!-- Title -->
							<h3 class="title">Infos pratiques</h3>
						</div>
						<nav>
							<ul>
								<!-- List Items -->
								<li><a href="contact.html">Nous contacter</a></li>
								<li><a href="cgu.html">C.G.U</a></li>
								<li><a href="faq.html">Foire aux Questions (FAQ)</a></li>
								<li><a href="privacy.html">Politique de confidentialité</a>
								</li>
							</ul>
						</nav>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-3 widget">
						<div class="widget-title">
							<!-- Title -->
							<h3 class="title">Autres info</h3>
						</div>
					</div>
					<div
						class="col-xs-12 col-sm-6 col-md-3 widget newsletter bottom-xs-pad-20">
						<!-- Social Links -->
						<div class="widget-title">
							<h3 class="title">SUIVEZ-NOUS</h3>
						</div>

						<!-- Social Links -->
						<div class="social-icon gray-bg icons-circle i-3x">
							<a href="#" target="_blank">&nbsp; <i class="fa fa-facebook"></i>
							</a> <a href="#" target="_blank">&nbsp; <i class="fa fa-twitter"></i>
							</a>
						</div>

					</div>
				</div>
			</div>
		</div>
		<!-- footer-top -->
		<div class="copyright dark-section">
			<div class="container">
				<div class="row">
					<!-- Copyrights -->
					<div class="col-xs-10 col-sm-6 col-md-6">
						&copy; 2020 <a href="index.html">www.nom_platform.tn</a>.
					</div>
					<div
						class="col-xs-2  col-sm-6 col-md-6 text-right page-scroll gray-bg icons-circle i-3x">
						<!-- Goto Top -->
						<a href="#page"> <i class="glyphicon glyphicon-arrow-up"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
		<!-- footer-bottom -->
	</footer>
	<!-- footer -->
	<script type="text/javascript" src="assets/js/jquery.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.form.min.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
	<!-- Menu jQuery plugin -->
	<script type="text/javascript" src="assets/js/hover-dropdown-menu.js"></script>
	<!-- Menu jQuery Bootstrap Addon -->
	<script type="text/javascript"
		src="assets/js/jquery.hover-dropdown-menu-addon.js"></script>
	<script type="text/javascript" src="assets/js/moment.js"></script>
	<script type="text/javascript" src="assets/js/moment-with-locales.js"></script>
	<script type="text/javascript"
		src="assets/js/bootstrap-datetimepicker.js"></script>
	<!-- Scroll Top Menu -->
	<script type="text/javascript" src="assets/js/jquery.easing.1.3.js"></script>
	<!-- Sticky Menu -->
	<script type="text/javascript" src="assets/js/jquery.sticky.js"></script>
	<!-- Bootstrap Validation -->
	<script type="text/javascript"
		src="assets/js/bootstrapValidator.min.js"></script>
	<!-- Revolution Slider -->
	<script type="text/javascript"
		src="assets/rs-plugin/js/jquery.themepunch.tools.min.js"></script>
	<script type="text/javascript"
		src="assets/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
	<script type="text/javascript"
		src="assets/js/revolution-custom6654.js?v1"></script>
	<!-- Portfolio Filter -->
	<script type="text/javascript" src="assets/js/jquery.mixitup.min.js"></script>
	<!-- Animations -->
	<script type="text/javascript" src="assets/js/jquery.appear.js"></script>
	<script type="text/javascript" src="assets/js/effect.js"></script>
	<script type="text/javascript" src="assets/js/facebook.js"></script>
	<!-- Owl Carousel Slider -->
	<!-- Parallax BG -->
	<script type="text/javascript" src="assets/js/jquery.parallax-1.1.3.js"></script>
	<!-- PieChart -->
	<script type="text/javascript"
		src="assets/js/jquery.easypiechart.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.countTo.js"></script>
	<!-- Background Video -->
	<script type="text/javascript" src="assets/js/jquery.mb.YTPlayer.js"></script>
	<!-- token -->
	<script type="text/javascript"
		src="assets/tokenfield/bootstrap-tokenfield.min.js"></script>
	<!-- Fancy select -->
	<script type="text/javascript" src="assets/js/fancySelect.js"></script>
	<!-- Fancy select -->
	<script type="text/javascript" src="assets/select2/js/select2.min.js"></script>
	<!-- fancy Box -->
	<script type="text/javascript" src="assets/fancybox/jquery.fancybox.js"></script>
	<!-- Scripts -->
	<script type="text/javascript" src="assets/js/clipboard.min.js"></script>
	<!-- jQuery.filter -->
	<script src="assets/js/jquery.filer.min.js"></script>
	<script src="assets/js/icheck.js"></script>
	<!--script src="assets/js/cookieconsent.min.js"></script-->

	<script type="text/javascript" src="assets/js/jssocials.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.inputmask.min.js"></script>

	<!-- Custom Js Code -->
	<script type="text/javascript" src="assets/js/custom.js"></script>
</body>
</html>