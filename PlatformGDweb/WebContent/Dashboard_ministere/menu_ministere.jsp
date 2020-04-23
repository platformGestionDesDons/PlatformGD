<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
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

                        <a class="navbar-brand scroll" href="Ministere">
                            <img src="images/Logo/Capture.PNG" style="width: 70px; height: 60px;">
                        </a></div>
                    <!-- Navbar Collapse -->
                    <div class="navbar-collapse collapse">
                        <!-- nav -->
                        <ul class="nav navbar-nav">
                            
                            <li >
                                <a href="Liste_Intermediaire">Liste intermédiaires</a>
                            </li>
                            <li>
                                <a href="Liste_Fournisseurs">Liste Fournisseurs</a>
                            </li>
                            <li>
                                <a href="Liste_Donnateurs">Liste donnateurs</a>
                            </li>
                            <li >
                                <a href="Liste_Etablissements"> Liste établissments</a>
                            </li>

                            <li >
                                <a href="Liste_Dons">Liste des Dons</a>
                            </li>
                            <li >
                                <a href="Liste_Besoins">Liste des Besoins</a>
                            </li>

                            <li >
                                <a href="Liste_DRS">Liste DRS</a>
                            </li>
                            <li>
                                <a href="index.jsp">Deconnection</a>
                            </li> 

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