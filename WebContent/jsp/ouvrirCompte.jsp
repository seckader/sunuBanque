<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ouvrir Compte</title>
		<%@ include file="../../include/css.jsp" %>
	</head>
	<body class="theme-red">
	
		<%@ include file="../../include/loader.jsp" %>
		
		<%@ include file="../../include/topBar.jsp" %>
		
		<%@ include file="../../include/sideBar.jsp" %>
		
		<section class="content">
	        <div class="container-fluid">
	            <div class="block-header">
	                <h2>Ouvrir Compte</h2>
	            </div>
	            <div class="row clearfix">
	                <div class="col-xs-9 col-sm-9 col-md-6 col-lg-6">
		                <div class="card">
		                	<div class="body">
		                		<div class="row clearfix">
	                                <div class="col-sm-9">
	                                	<h3>Compte Courant</h3>
	                                	<form method="post" action="<%= request.getContextPath() %>/ouvrirCompte">
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="codeClient" class="form-control" placeholder="Code Client" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="text" name="numeroCompte" class="form-control" placeholder="Numero du Compte" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="solde" class="form-control" placeholder="Solde d'ouverture" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="decouvert" class="form-control" placeholder="Decouvert" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                        	<button type="submit" name="action" value="Courant" class="form-control btn btn-primary waves-effect">Ouvrir</button>
		                                        </div>
	                                    	</div>
	                                    </form>
	                                </div>
                            	</div>
		                	</div>
		                </div>
	                </div>
	                <div class="col-xs-9 col-sm-9 col-md-6 col-lg-6">
		                <div class="card">
		                	<div class="body">
		                		<div class="row clearfix">
	                                <div class="col-sm-9">
	                                	<h3>Compte Epargne</h3>
	                                	<form method="post" action="<%= request.getContextPath() %>/ouvrirCompte">
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="codeClient" class="form-control" placeholder="Code Client" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="text" name="numeroCompte" class="form-control" placeholder="Numero du Compte" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="solde" class="form-control" placeholder="Solde d'ouverture" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                            <input type="number" name="taux" class="form-control" placeholder="Taux rénumération" />
		                                        </div>
	                                    	</div>
	                                    	<div class="form-group form-group-lg">
		                                        <div class="form-line">
		                                        	<button type="submit" name="action" value="Epargne" class="form-control btn btn-primary waves-effect">Ouvrir</button>
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