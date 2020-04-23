<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=Arimo:300,400,700,400italic,700italic'
	media="none" onload="if(media!='all')media='all'">
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700'
	rel='stylesheet' type='text/css' media="none"
	onload="if(media!='all')media='all'">
<!-- Font Awesome Icons -->
<link href='assets/css/font-awesome.min.css'  rel='stylesheet'
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
<link href="assets/css/style.css"  rel="stylesheet">
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
<link href="assets/css/jquery.filer-dragdropbox-theme.css"
	type="text/css" rel="stylesheet" media="none"
	onload="if(media!='all')media='all'" />

<link href="assets/css/icheck/_all.css" type="text/css" rel="stylesheet" />

<link type="text/css" rel="stylesheet" href="assets/css/jssocials.css" />
<link type="text/css" rel="stylesheet"
	href="assets/css/jssocials-theme-classic.css" />
<!-- Latest compiled and minified CSS -->


<!-- css for multiselect -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/css/bootstrap-select.css" />


<style>
@media only screen and (min-width: 768px) {
	.arabesque::before {
		content: url('assets/img/hr-left.png'); /* with class ModalCarrot ??*/
		position: relative; /*or absolute*/
		z-index: 10; /*a number that's more than the modal box*/
		left: -30px;
		top: 20px;
	}
	.arabesque::after {
		content: url('assets/img/hr-right.png'); /* with class ModalCarrot ??*/
		position: relative; /*or absolute*/
		z-index: 10; /*a number that's more than the modal box*/
		left: 30px;
		top: 20px;
	}
}
</style>

<link href="../vjs.zencdn.net/7.1.0/video-js.css"  rel="stylesheet">
<link href="assets/css/videojs.css"  rel="stylesheet">






<!-- Facebook Pixel Code -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/js/bootstrap-select.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
    
<script>
        !function(f,b,e,v,n,t,s)
        {if(f.fbq)return;n=f.fbq=function(){n.callMethod?
            n.callMethod.apply(n,arguments):n.queue.push(arguments)};
            if(!f._fbq)f._fbq=n;n.push=n;n.loaded=!0;n.version='2.0';
            n.queue=[];t=b.createElement(e);t.async=!0;
            t.src=v;s=b.getElementsByTagName(e)[0];
            s.parentNode.insertBefore(t,s)}(window, document,'script',
            '../connect.facebook.net/en_US/fbevents.js');
        fbq('init', '353811311810939');
        fbq('track', 'PageView');
    </script>
<noscript>
	<img height="1" width="1" style="display: none"
		src="https://www.facebook.com/tr?id=353811311810939&amp;ev=PageView&amp;noscript=1" />
</noscript>
<title>Insert title here</title>
</head>
<body>
<header class="fixed-header">
    <!-- navbar -->
    <div id="navigation" class="navbar navbar-default navbar-bg-light navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="navbar-header">
                        <!-- Button For Responsive toggle -->
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target=".navbar-collapse">
                            <span class="sr-only">&nbsp;</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span></button>

                        <a class="navbar-brand scroll" href="../../index.html#">
                            <h6>LOGO</h6>
                        </a></div>
                    <!-- Navbar Collapse -->
                    <div class="navbar-collapse collapse">
                        <!-- nav -->
                        <ul class="nav navbar-nav">     
                            

                                <li  class="current" >
                                    <a href="besoins">Besoins</a>
                                </li>

                                <li >
                                    <a href="produits"> Produits</a>
                                </li>
                                 <li >
                                    <a href="fournisseurs"> Fournisseurs</a>
                                </li>
                                                                 <li >
                                    <a href="categories"> Categories</a>
                                </li>
                                                                                                 <li >
                                    <a href="udms"> Unités de mesure</a>
                                </li>
                            
                         <a href="./fund/new.html" class="btn btn-default btn-menu"><i class="fa icon-plus2"></i> Faire un DON</a>
                            
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