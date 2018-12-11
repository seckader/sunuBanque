<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>sunuBanque - Authentification</title>
		
		<!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

    <!-- Bootstrap Core Css -->
    <link href="<%= request.getContextPath() %>/template/plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

    <!-- Waves Effect Css -->
    <link href="<%= request.getContextPath() %>/template/plugins/node-waves/waves.css" rel="stylesheet" />

    <!-- Animation Css -->
    <link href="<%= request.getContextPath() %>/template/plugins/animate-css/animate.css" rel="stylesheet" />

    <!-- Custom Css -->
    <link href="<%= request.getContextPath() %>/template/css/style.css" rel="stylesheet">
	</head>
	<body  class="login-page">
	
		<div class="login-box">
        <div class="logo">
            <a href="javascript:void(0);">sunu<b>Banque</b></a>
            <small>sunuBanque - La Banque de l'avenir</small>
        </div>
        <div class="card">
            <div class="body">
                <form method="POST" action="j_security_check">
                    <div class="msg">Connecter vous au système</div>
                    <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">person</i>
                        </span>
                        <div class="form-line">
                            <input type="text" class="form-control" name="j_username" placeholder="Login" required autofocus>
                        </div>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">lock</i>
                        </span>
                        <div class="form-line">
                            <input type="password" class="form-control" name="j_password" placeholder="Mot de Passe" required>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-4">
                            <button class="btn btn-block bg-pink waves-effect" type="submit">SE CONNECTER</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
	
	
		<!-- Jquery Core Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery/jquery.min.js"></script>
	
	    <!-- Bootstrap Core Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/bootstrap/js/bootstrap.js"></script>
	
	    <!-- Waves Effect Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/node-waves/waves.js"></script>
	
	    <!-- Validation Plugin Js -->
	    <script src="<%= request.getContextPath() %>/template/plugins/jquery-validation/jquery.validate.js"></script>
	
	    <!-- Custom Js -->
	    <script src="<%= request.getContextPath() %>/template/js/admin.js"></script>
	    
	    <script src="<%= request.getContextPath() %>/template/js/pages/examples/sign-in.js"></script>
    
    </body>
</html>