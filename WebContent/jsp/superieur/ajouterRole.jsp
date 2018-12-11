<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ajouter Role</title>
		<%@ include file="../../include/css.jsp" %>
	</head>
	<body class="theme-red">
	
		<%@ include file="../../include/loader.jsp" %>
		
		<%@ include file="../../include/topBar.jsp" %>
		
		<%@ include file="../../include/sideBar.jsp" %>
		
		
		<section class="content">
	        <div class="container-fluid">
	            <div class="block-header">
	                <h2>Ajouter Rôle</h2>
	            </div>
	            <div class="row clearfix">
	                <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8">
		                <div class="card">
		                	<div class="body">
		                		<div class="row clearfix">
	                                <div class="col-sm-12">
	                                	<form method="post" action="<%= request.getContextPath() %>/ajouterRole">
	                                    	<div class="form-group form-group-lg">
	                                    	
		                                        <div class="form-line">
		                                            <input type="text" name="nomRole" class="form-control" placeholder="Nom du Rôle" />
		                                        </div>
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
    
    	<%@ include file="../../include/js.jsp" %>
	
	</body>
</html>