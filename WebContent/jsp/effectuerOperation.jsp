<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Effectuer Operation</title>
		<%@ include file="../../include/css.jsp" %>
	</head>
	<body class="theme-red">
	
		<%@ include file="../../include/loader.jsp" %>
		
		<%@ include file="../../include/topBar.jsp" %>
		
		<%@ include file="../../include/sideBar.jsp" %>
		
		<section class="content">
	        <div class="container-fluid">
	            <div class="block-header">
	                <h2>Effectuer Operation</h2>
	            </div>
	            <div class="row clearfix">
	                <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
		                <div class="card">
		                	<div class="body">
		                		<div class="row clearfix">
	                                <div class="col-sm-9">
	                                	<h3>Effectuer Versement</h3>
	                                	<form method="post" action="<%= request.getContextPath() %>/effectuerVersement">
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="text" name="numeroCompte" class="form-control" placeholder="Numero du Compte" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="montant" class="form-control" placeholder="Montant à verser" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                        	<button type="submit" class="form-control btn btn-primary waves-effect">Effectuer</button>
		                                        </div>
	                                    	</div>
	                                    </form>
	                                </div>
                            	</div>
		                	</div>
		                </div>
	                </div>
	                <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
		                <div class="card">
		                	<div class="body">
		                		<div class="row clearfix">
	                                <div class="col-sm-9">
	                                	<h3>Effectuer Retrait</h3>
	                                	<form method="post" action="<%= request.getContextPath() %>/effectuerOperation">
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="text" name="numeroCompte" class="form-control" placeholder="Numero du Compte" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="montant" class="form-control" placeholder="Montant à retirer" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                        	<button type="submit" name="action" value="Retrait" class="form-control btn btn-primary waves-effect">Effectuer</button>
		                                        </div>
	                                    	</div>
	                                    </form>
	                                </div>
                            	</div>
		                	</div>
		                </div>
	                </div>
	                <div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
		                <div class="card">
		                	<div class="body">
		                		<div class="row clearfix">
	                                <div class="col-sm-9">
	                                	<h3>Effectuer Virement</h3>
	                                	<form method="post" action="<%= request.getContextPath() %>/effectuerOperation">
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="text" name="numeroCompte" class="form-control" placeholder="Numero du Compte débiteur" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="text" name="numeroCompte" class="form-control" placeholder="Numero du Compte bénéficiaire" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="montant" class="form-control" placeholder="Montant à virer" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                        	<button type="submit" name="action" value="Virement" class="form-control btn btn-primary waves-effect">Effectuer</button>
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
    	
    	<%@ include file="../../include/js.jsp" %>
	
	</body>
</html>