<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ajouter Employe - Groupe</title>
		
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
	                <h2>Ajouter Employe à un Groupe</h2>
	            </div>
	            <div class="row clearfix">
	                <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8">
		                <div class="card">
		                	<div class="body">
		                		<div class="row clearfix">
	                                <div class="col-sm-12">
	                                	<form method="post" action="<%= request.getContextPath() %>/ajouterEmployerGroupe">
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="codeEmploye" class="form-control" placeholder="Code Employe" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg demo-checkbox">
<!-- 		                                        <div class="demo-checkbox"> -->
													<h2 class="card-inside-title">Groupes d'appartenance</h2>
													<c:forEach items="${listeGroupes}" var="groupe">
					                                	<input type="checkbox" id="${groupe.numeroGroupe}" name="${groupe.nomGroupe}" value="${groupe.nomGroupe}" class="filled-in chk-col-red" />
						                                <label for="${groupe.numeroGroupe}">${groupe.nomGroupe}</label>
					                                </c:forEach>
<!-- 				                                </div> -->
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                        	<button type="submit" class="form-control btn btn-primary waves-effect">Ajouter</button>
		                                        </div>
	                                    	</div>
	                                    </form>
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
	</body>
</html>