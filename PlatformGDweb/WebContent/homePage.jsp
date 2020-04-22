<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="__header.jsp"%>

<!-- Load Facebook SDK for JavaScript -->
<div id="fb-root"></div>
<script>
    window.fbAsyncInit = function() {
        FB.init({
            xfbml            : true,
            version          : 'v3.2'
        });
    };

    (function(d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = '../connect.facebook.net/fr_FR/sdk/xfbml.customerchat.js';
        fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));</script>

<!-- Your customer chat code -->
<div class="fb-customerchat"
     attribution=setup_tool
     page_id="1419275118198544"
     logged_in_greeting="Bonjour, On peut vous aider ? "
     logged_out_greeting="Bonjour, On peut vous aider ? ">
</div>

<!-- facebook page -->
<script>(function(d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) return;
        js = d.createElement(s); js.id = id;
        js.src = '../connect.facebook.net/fr_FR/sdk.js#xfbml=1&version=v3.0&appId=1669069353118459&autoLogAppEvents=1';
        fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));</script>
<div id="page">
    <!-- Page Loader -->
    <div id="pageloader">
        <div class="loader-item fa fa-spin text-color"></div>
    </div>

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
                            <li>
                                <a href="./fund/list.html">Créer mon besoin</a>
                            </li>
                            <li >
                                    <a href="./register/index.html"> Inscrire un donateur</a>
                                </li>

                                <li  class="current" >
                                    <a href="./register/association/index.html"> Inscrire mon établissement</a>
                                </li>

                                <li >
                                    <a href="./login.html"> Se connecter</a>
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



    
        <section class="slider rs-slider-full" id="home">
    <div class="tp-banner-container">
        <div class="tp-banner-new responsive">
            <ul>
                                <!-- Features Slide -->
                <li data-slotamount="6" data-masterspeed="1200" data-delay="6000" data-title="Association">
                    <img src="assets/img/sections/slider/Organization.jpg" alt="Association" title="Association" data-bgposition="center top" data-kenburns="on" data-duration="16000" data-ease="Linear.easeNone" data-bgfit="110" data-bgfitend="100" data-bgpositionend="center center" />
                    <div class="elements">
                        <h3 class="tp-caption white text-shadow tp-resizeme sft skewtotop title -text-uppercase customin customout rs-parallaxlevel-1 -text-color" data-hoffset="0" data-voffset="0" data-x="left" data-y="60" data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="800" data-startslide="1" data-easing="Power4.easeOut" data-endspeed="500" data-endeasing="Power4.easeIn">
                            paragraphe <br> paragraphe !
                        </h3>

                        <h2 class="tp-caption white text-shadow tp-resizeme sft skewtotop title text-uppercase customin customout rs-parallaxlevel-1 text-color" data-hoffset="0" data-voffset="0" data-x="right" data-y="60" data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="800" data-startslide="1" data-easing="Power4.easeOut" data-endspeed="500" data-endeasing="Power4.easeIn">
                            un mot
                        </h2>

                        <div class="tp-caption tp-resizeme customin customout rs-parallaxlevel-3" data-x="right" data-y="210" data-customin="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0;scaleY:0;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="1400" data-easing="Power3.easeInOut" data-endspeed="300" style="z-index: 5">
                            <a href="fund/new.html" class="btn btn-default btn-lg">Lancez-vous ! Faire un DON</a>
                        </div>

                    </div>
                </li>
                <!-- Feature Slide Ends -->
                                <!-- Features Slide -->
                <li data-slotamount="6" data-masterspeed="1200" data-delay="6000" data-title="Solidarité">
                    <img src="assets/img/sections/slider/Solidarity.jpg" alt="Solidarité" title="Solidarité" data-bgposition="center top" data-kenburns="on" data-duration="16000" data-ease="Linear.easeNone" data-bgfit="110" data-bgfitend="100" data-bgpositionend="center center" />
                    <div class="elements">
                        <h3 class="tp-caption white text-shadow tp-resizeme sft skewtotop title -text-uppercase customin customout rs-parallaxlevel-1 -text-color" data-hoffset="0" data-voffset="0" data-x="left" data-y="60" data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="800" data-startslide="1" data-easing="Power4.easeOut" data-endspeed="500" data-endeasing="Power4.easeIn">
                            Paragraphe !
                        </h3>

                        <h2 class="tp-caption white text-shadow tp-resizeme sft skewtotop title text-uppercase customin customout rs-parallaxlevel-1 text-color" data-hoffset="0" data-voffset="0" data-x="right" data-y="60" data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="800" data-startslide="1" data-easing="Power4.easeOut" data-endspeed="500" data-endeasing="Power4.easeIn">
                            Un mot
                        </h2>

                        <div class="tp-caption tp-resizeme customin customout rs-parallaxlevel-3" data-x="right" data-y="210" data-customin="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0;scaleY:0;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="1400" data-easing="Power3.easeInOut" data-endspeed="300" style="z-index: 5">
                            <a href="fund/new.html" class="btn btn-default btn-lg">Lancez-vous ! Faire un DON</a>
                        </div>

                    </div>
                </li>
                <!-- Feature Slide Ends -->
                                <!-- Features Slide -->
                <li data-slotamount="6" data-masterspeed="1200" data-delay="6000" data-title="Projet ">
                    <img src="assets/img/sections/slider/Projects.jpg" alt="Projet " title="Projet " data-bgposition="center top" data-kenburns="on" data-duration="16000" data-ease="Linear.easeNone" data-bgfit="110" data-bgfitend="100" data-bgpositionend="center center" />
                    <div class="elements">
                        <h3 class="tp-caption white text-shadow tp-resizeme sft skewtotop title -text-uppercase customin customout rs-parallaxlevel-1 -text-color" data-hoffset="0" data-voffset="0" data-x="left" data-y="60" data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="800" data-startslide="1" data-easing="Power4.easeOut" data-endspeed="500" data-endeasing="Power4.easeIn">
                            Paragraphe !
                        </h3>

                        <h2 class="tp-caption white text-shadow tp-resizeme sft skewtotop title text-uppercase customin customout rs-parallaxlevel-1 text-color" data-hoffset="0" data-voffset="0" data-x="right" data-y="60" data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="800" data-startslide="1" data-easing="Power4.easeOut" data-endspeed="500" data-endeasing="Power4.easeIn">
                            Mot 
                        </h2>

                        <div class="tp-caption tp-resizeme customin customout rs-parallaxlevel-3" data-x="right" data-y="210" data-customin="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0;scaleY:0;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="1400" data-easing="Power3.easeInOut" data-endspeed="300" style="z-index: 5">
                            <a href="fund/new/Projects.html" class="btn btn-default btn-lg">Lancez-vous ! Faire un DON</a>
                        </div>

                    </div>
                </li>
                <!-- Feature Slide Ends -->
                                <!-- Features Slide -->
                <li data-slotamount="6" data-masterspeed="1200" data-delay="6000" data-title="Education">
                    <img src="assets/img/sections/slider/Education.jpg" alt="Education" title="Education" data-bgposition="center top" data-kenburns="on" data-duration="16000" data-ease="Linear.easeNone" data-bgfit="110" data-bgfitend="100" data-bgpositionend="center center" />
                    <div class="elements">
                        <h3 class="tp-caption white text-shadow tp-resizeme sft skewtotop title -text-uppercase customin customout rs-parallaxlevel-1 -text-color" data-hoffset="0" data-voffset="0" data-x="left" data-y="60" data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="800" data-startslide="1" data-easing="Power4.easeOut" data-endspeed="500" data-endeasing="Power4.easeIn">
                            <blockquote><h3>Citation <br>Citation</h3></blockquote> Un mot
                        </h3>

                        <h2 class="tp-caption white text-shadow tp-resizeme sft skewtotop title text-uppercase customin customout rs-parallaxlevel-1 text-color" data-hoffset="0" data-voffset="0" data-x="right" data-y="60" data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="800" data-startslide="1" data-easing="Power4.easeOut" data-endspeed="500" data-endeasing="Power4.easeIn">
                            Un mot
                        </h2>

                        <div class="tp-caption tp-resizeme customin customout rs-parallaxlevel-3" data-x="right" data-y="210" data-customin="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0;scaleY:0;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;" data-speed="800" data-start="1400" data-easing="Power3.easeInOut" data-endspeed="300" style="z-index: 5">
                            <a href="fund/new.html" class="btn btn-default btn-lg">Lancez-vous ! Faire un DON</a>
                        </div>

                    </div>
                </li>
                <!-- Feature Slide Ends -->
                                <!-- Features Slide -->
                <!-- Feature Slide Ends -->
                            </ul>
            <div class="tp-bannertimer"></div>
        </div>
    </div>
</section>
<div class="clearfix"></div>
<!-- slider -->

        <!-- call to action -->
<section class="page-section">

    <div class="container">
        <div class="row">
            <div class="section-title" data-animation="fadeInUp">
                <!-- Heading -->
                <h2 class="title"><strong>All<span class="text-color">   </span></strong></h2>
            </div>
        </div>
        <hr class="margin-20">
        <c:forEach var="etablissement" items="${etablissements}">	
        <div class="row">
            <div class="col-sm-6 col-md-6">
                <a href="faire_un_don">
                <div class="visible card-1">
                <div class="img-wrapper">
                    <div class="thumb-fund" style="background-image: url(media/cache/cha9a9a_thumb/uploads/images/Hopital_Farhat_Hached_de_Sousse.jpg);"></div>
                </div>
                <div class="cha9a9a-title text-center pad-5"><h5>${etablissement.getNomEtablissement()}</h5></div>
                </div>
                </a>
            </div>
            <div class="col-sm-6 col-md-6">
                <div class="row">
                         <div class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
                            <strong><span class="text-color">Besoin</span></strong>
                        </div>
                                                <div class="col-xs-3 col-sm-3 text-center fund-bottom-border lr-pad-10">
                            <strong><span class="text-color">Quantité</span></strong>
                        </div>
                                                <div class="col-xs-3 col-sm-3 text-center lr-pad-10">
                            <strong><span class="text-color">Date</span></strong>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center lr-pad-10">
                            <strong><span class="text-color">Status</span></strong>
                        </div>
                </div>
                <hr class="margin-20">
                <div class="row">
                         <div class="col-xs-3 col-sm-3 text-center">
                            <h5>Javel</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <h5>100 L</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <h5>04-04-2020</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <span style="color: green; font-size: 30px;" class="glyphicon glyphicon-ok-sign"></span>
                        </div>
                </div>
                <div class="row">
                         <div class="col-xs-3 col-sm-3 text-center">
                            <h5>Bavettes</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <h5>500 Unités</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <h5>05-04-2020</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <span style="color: #BB0B0B; font-size: 30px;" class="glyphicon glyphicon-remove-sign"></span>
                        </div>
                </div>
                <div class="row">
                         <div class="col-xs-3 col-sm-3 text-center">
                            <h5>Alcool</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <h5>200 L</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <h5>02-04-2020</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <span style="color: #03224C; font-size: 30px;" class="glyphicon glyphicon-share"></span>
                        </div>
                </div>
                <div class="row">
                         <div class="col-xs-3 col-sm-3 text-center">
                            <h5>Solution hydroalcoolique</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <h5>100 L</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <h5>05-04-2020</h5>
                        </div>
                        <div class="col-xs-3 col-sm-3 text-center">
                            <span style="color: #BB0B0B; font-size: 30px;" class="glyphicon glyphicon-remove-sign"></span>
                        </div>
                </div>
                <div class="text-right">
                    <a href="./fund/detail/Hopital_Farhat_Hached_de_Sousse.html" class="btn btn-default btn-menu">Détails ...<i style="font-size: 20px" class=" glyphicon glyphicon-circle-arrow-right"></i> </a>
                </div>
            </div>
        </div>
        <hr class="margin-20">
        <div class="row">
            <div class="col-md-12 text-center top-pad-20">
                <div>
                    <a href="#" class="btn btn-box btn-default fs20 pad-20 animated fadeInDown visible" style="min-width: 240px;" data-animation="fadeInDown">Voir plus</a>
                </div>
            </div>
        </div>
        </c:forEach>
    </div>
</section>




        <section class="page-section dark-bg">
        <div class="container">
        <div class="row text-center fact-counter white">
            <div class="col-sm-4 col-md-4 bottom-xs-pad-30" data-animation="fadeInLeft">
                <!-- Icon -->
                <i class="icon-user7 fa-3x text-color"></i>
                <!-- number -->
                <div class="count-number" data-count="1024"><span class="counter"></span></div>
                <!-- Title -->
                <h4 class="text-color">Utilisateurs</h4>
            </div>
            <div class="col-sm-4 col-md-4 bottom-xs-pad-30" data-animation="fadeInRight">
                <!-- Icon -->
                <i class="icon-organization fa-3x text-color"></i>
                <!-- number -->
                <div class="count-number" data-count="148"><span class="counter"></span></div>
                <!-- Title -->
                <h4 class="text-color">Etablissements</h4>
            </div>
            <div class="col-sm-4 col-md-4 bottom-xs-pad-30" data-animation="fadeInRight">
                <!-- Icon -->
                <i class="icon-heart3 fa-3x text-color"></i>
                <!-- number -->
                <div class="count-number" data-count="3740"><span class="counter"></span></div>
                <!-- Title -->
                <h4 class="text-color">Donateurs</h4>
            </div>
        </div>
    </div>
</section>

        
        
        <section id="video" class="page-section light-bg">
        <div class="container">
            <div class="row text-center">
                <div class="col-md-4">
                    <div class="section-title" data-animation="fadeInUp">
                        <h2 class="title">Pour quels besoins ?</h2>
                    </div>
                    <p>..........</p>
                </div>
                <div class="col-md-4">
                    <div class="section-title" data-animation="fadeInUp">
                        <h2 class="title">C'est quoi ?</h2>
                    </div>
                    <p>..........</p>
                </div>
                <div class="col-md-4">
                    <div class="section-title" data-animation="fadeInUp">
                        <h2 class="title">Comment ça marche ?</h2>
                    </div>
                    <p>..........</p>
                </div>
                <!--  space -->
            </div>
        </div>
    </section>

    <%@ include file="__footer.jsp"%>