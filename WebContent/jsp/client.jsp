<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Client</title>
		
		<!-- Favicon-->
	    <link rel="icon" href="<%= request.getContextPath() %>/template/sunubanque.ico" type="image/x-icon">
	
	    <!-- Google Fonts -->
	    <link href="<%= request.getContextPath() %>/template/css/googleFontCyrillic.css" rel="stylesheet" type="text/css">
	    <link href="<%= request.getContextPath() %>/template/css/MaterialsIcons.css" rel="stylesheet" type="text/css">
	
	    <!-- Bootstrap Core Css -->
	    <link href="<%= request.getContextPath() %>/template/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">
	
	    <!-- Waves Effect Css -->
	    <link href="<%= request.getContextPath() %>/template/plugins/node-waves/waves.css" rel="stylesheet" />
	
	    <!-- Animation Css -->
	    <link href="<%= request.getContextPath() %>/template/plugins/animate-css/animate.css" rel="stylesheet" />
	
	    <!-- Morris Chart Css-->
	    <link href="<%= request.getContextPath() %>/template/plugins/morrisjs/morris.css" rel="stylesheet" />
	
	    <!-- Custom Css -->
	    <link href="<%= request.getContextPath() %>/template/css/style.css" rel="stylesheet">
	
	    <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
	    <link href="<%= request.getContextPath() %>/template/css/themes/all-themes.css" rel="stylesheet" />
	</head>
	
	<body class="theme-red">
	
		<div class="page-loader-wrapper">
	        <div class="loader">
	            <div class="preloader">
	                <div class="spinner-layer pl-red">
	                    <div class="circle-clipper left">
	                        <div class="circle"></div>
	                    </div>
	                    <div class="circle-clipper right">
	                        <div class="circle"></div>
	                    </div>
	                </div>
	            </div>
	            <p>Please wait...</p>
	        </div>
	    </div>
		
		<!-- Top Bar -->
	    <nav class="navbar">
	        <div class="container-fluid">
	            <div class="navbar-header">
	                <a href="javascript:void(0);" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false"></a>
	                <a href="javascript:void(0);" class="bars"></a>
	                <a class="navbar-brand" href="index.jsp">SUNUBANQUE</a>
	            </div>   
	        </div>
	    </nav>
	    <!-- #Top Bar -->
		
		<section>
	        <!-- Left Sidebar -->
	        <aside id="leftsidebar" class="sidebar">
	            <!-- User Info -->
	            <div class="user-info">
	                <div class="image">
	                    <img src="<%= request.getContextPath() %>/template/images/user.png" width="48" height="48" alt="User" />
	                </div>
	                <div class="info-container">
	                    <div class="name" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${employeConnecte.prenomEmploye} ${employeConnecte.nomEmploye}</div>
	                    <div class="btn-group user-helper-dropdown">
	                        <i class="material-icons" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">keyboard_arrow_down</i>
	                        <ul class="dropdown-menu pull-right">
	                            <li><a href="javascript:void(0);"><i class="material-icons">person</i>Profile</a></li>
	                            <li role="separator" class="divider"></li>
	                            <li><a href="javascript:void(0);"><i class="material-icons">input</i>Sign Out</a></li>
	                        </ul>
	                    </div>
	                </div>
	            </div>
	            <!-- #User Info -->
	            <!-- Menu -->
	            <div class="menu">
	                <ul class="list">
	                    <li class="header">MENU</li>
	                    <li class="active">
	                        <a href="index.jsp">
	                            <i class="material-icons">home</i>
	                            <span>Home</span>
	                        </a>
	                    </li>
	                    <li>
	                        <a href="javascript:void(0);" class="menu-toggle">
	                            <i class="material-icons">group</i>
	                            <span>Groupes</span>
	                        </a>
	                        <ul class="ml-menu">
	                            <li>
	                                <a href="<%= request.getContextPath() %>/jsp/superieur/ajouterGroupe.jsp">Ajouter groupe</a>
	                            </li>
	                            <li>
	                                <a href="<%= request.getContextPath() %>/listeGroupes">Liste des groupes</a>
	                            </li>
	                        </ul>
	                    </li>
	                    <li>
	                        <a href="javascript:void(0);" class="menu-toggle">
	                            <i class="material-icons">face</i>
	                            <span>Employés</span>
	                        </a>
	                        <ul class="ml-menu">
	                            <li>
	                                <a href="<%= request.getContextPath() %>/ajoutEmploye">Ajouter employé</a>
	                            </li>
	                            <li>
		                            <a href="<%= request.getContextPath() %>/ajoutEmployeGroupe">Ajouter employé à un groupe</a>
		                        </li>
	                            <li>
	                                <a href="<%= request.getContextPath() %>/listeEmployes">Liste des Employés</a>
	                            </li>
	                        </ul>
	                    </li>
	                    <li>
	                        <a href="javascript:void(0);" class="menu-toggle">
	                            <i class="material-icons">person</i>
	                            <span>Clients</span>
	                        </a>
	                        <ul class="ml-menu">
	                            <li>
	                                <a href="<%= request.getContextPath() %>/ajoutClient">Ajouter client</a>
	                            </li>
	                            <li>
	                                <a href="pages/ui/alerts.html">Consulter client</a>
	                            </li>
	                            <li>
	                                <a href="<%= request.getContextPath() %>/listeClients">Liste des clients</a>
	                            </li>
	                        </ul>
	                    </li>
	                    <li>
	                        <a href="javascript:void(0);" class="menu-toggle">
	                            <i class="material-icons">attach_money</i>
	                            <span>Comptes Bancaire</span>
	                        </a>
	                        <ul class="ml-menu">
	                            <li>
	                                <a href="<%= request.getContextPath() %>/jsp/ouvrirCompte.jsp">Ouvrir un compte</a>
	                            </li>
	                            <li>
	                                <a href="pages/ui/alerts.html">Consulter compte</a>
	                            </li>
	                            <li>
	                                <a href="<%= request.getContextPath() %>/jsp/effectuerOperation.jsp">Effectuer Opération</a>
	                            </li>
	                        </ul>
	                    </li>
	                    <li>
	                        <a href="javascript:void(0);" class="menu-toggle">
	                            <i class="material-icons">settings</i>
	                            <span>Paramétrage</span>
	                        </a>
	                        <ul class="ml-menu">
	                            <li>
	                                <a href="<%= request.getContextPath() %>/jsp/superieur/ajouterRole.jsp">Ajouter Rôle</a>
	                            </li>
	                            <li>
	                                <a href="<%= request.getContextPath() %>/listeRoles">Liste des Rôles</a>
	                            </li>
	                        </ul>
	                    </li>
	                </ul>
	            </div>
	            <!-- #Menu -->
	            <!-- Footer -->
	            <div class="legal">
	                <div class="copyright">
	                    &copy; 2018 <a href="javascript:void(0);">Kader&amp;Damien</a>.
	                </div>
	                <div class="version">
	                    <b>Version: </b> 1.0.0
	                </div>
	            </div>
	            <!-- #Footer -->
	        </aside>
	        <!-- #END# Left Sidebar -->
	    </section>
		
		<section class="content">
	        <div class="container-fluid">
	            <div class="block-header">
	                <h2>Client</h2>
	            </div>
	            <div class="row clearfix">
	                <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
		                <div class="card">
		                	<div class="body">
		                		<div class="row clearfix">
	                                <div class="col-sm-9">
	                                	<h3>${client.prenomClient} ${client.nomClient}</h3>
	                                	<ul>
	                                		<li><b>Code Client: </b> ${client.codeClient}</li>
	                                		<li>
	                                			<b>Adresse: </b>
	                                			${client.adresse}
	                                		</li>
	                                		<li>
	                                			<b>Téléphone: </b>
	                                			${client.numeroTelephone}
	                                		</li>
	                                	</ul>
	                                </div>
                            	</div>
		                	</div>
		                </div>
	                </div>
	                <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8">
		                <div class="card">
		                	<div class="body">
		                		<div class="row clearfix">
	                                <div class="col-sm-12">
	                                	<h3>Liste des Comptes du Client</h3>
	                                	<div class="table-responsive">
			                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
			                                    <thead>
			                                        <tr>
			                                            <th>Numéro Compte</th>
			                                            <th>Type Compte</th>
			                                            <th>Date Creation</th>
			                                            <th>Solde</th>
			                                            <th>Employe</th>
			                                        </tr>
			                                    </thead>
			                                    <tbody>
			                                    	<c:forEach items="${listeComptes}" var="compte">
				                                        <tr>
				                                            <td><a href="consulterCompte?idCompte=${compte.idCompteBancaire}">${compte.numeroCompte}</a></td>
				                                            <td>${compte.typeCompte}</td>
				                                            <td>${compte.dateCreation}</td>
				                                            <td>${compte.solde}</td>
				                                            <td>${compte.employe.prenomEmploye} ${compte.employe.nomEmploye}</td>
				                                        </tr>
			                                        </c:forEach>
			                                    </tbody>
			                                </table>
			                            </div>
	                                </div>
                            	</div>
		                	</div>
		                </div>
	                </div>
                </div>
	        </div>
    	</section>
    	
    	<!-- Jquery Core Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery/jquery.min.js"></script>
	
	    <!-- Bootstrap Core Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/bootstrap/js/bootstrap.js"></script>
	
	    <!-- Select Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/bootstrap-select/js/bootstrap-select.js"></script>
	
	    <!-- Slimscroll Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>
	
	    <!-- Waves Effect Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/node-waves/waves.js"></script>
	
	    <!-- Jquery CountTo Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-countto/jquery.countTo.js"></script>
	
	    <!-- Morris Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/raphael/raphael.min.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/morrisjs/morris.js"></script>
	
	    <!-- ChartJs -->
	    <script src="<%= request.getContextPath() %>/template/plugins/chartjs/Chart.bundle.js"></script>
	
	    <!-- Flot Charts Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/flot-charts/jquery.flot.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/flot-charts/jquery.flot.resize.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/flot-charts/jquery.flot.pie.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/flot-charts/jquery.flot.categories.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/flot-charts/jquery.flot.time.js"></script>
	
	    <!-- Sparkline Chart Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-sparkline/jquery.sparkline.js"></script>
	
	    <!-- Custom Js -->
	    <script src="<%= request.getContextPath() %>/template/js/admin.js"></script>
	    <script src="<%= request.getContextPath() %>/template/js/pages/index.js"></script>
	
	    <!-- Demo Js -->
	    <script src="<%= request.getContextPath() %>/template/js/demo.js"></script>
	    
	    <!-- Jquery DataTable Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-datatable/jquery.dataTables.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-datatable/skin/bootstrap/js/dataTables.bootstrap.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-datatable/extensions/export/dataTables.buttons.min.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-datatable/extensions/export/buttons.flash.min.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-datatable/extensions/export/jszip.min.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-datatable/extensions/export/pdfmake.min.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-datatable/extensions/export/vfs_fonts.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-datatable/extensions/export/buttons.html5.min.js"></script>
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-datatable/extensions/export/buttons.print.min.js"></script>
	    <script src="<%= request.getContextPath() %>/template/js/pages/tables/jquery-datatable.js"></script>
	
	</body>
</html>