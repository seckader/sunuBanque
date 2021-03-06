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
                            <span>Employ�s</span>
                        </a>
                        <ul class="ml-menu">
                            <li>
                                <a href="<%= request.getContextPath() %>/ajoutEmploye">Ajouter employ�</a>
                            </li>
                            <li>
	                            <a href="<%= request.getContextPath() %>/ajoutEmployeGroupe">Ajouter employ� � un groupe</a>
	                        </li>
                            <li>
                                <a href="<%= request.getContextPath() %>/listeEmployes">Liste des Employ�s</a>
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
                                <a href="<%= request.getContextPath() %>/jsp/effectuerOperation.jsp">Effectuer Op�ration</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">settings</i>
                            <span>Param�trage</span>
                        </a>
                        <ul class="ml-menu">
                            <li>
                                <a href="<%= request.getContextPath() %>/jsp/superieur/ajouterRole.jsp">Ajouter R�le</a>
                            </li>
                            <li>
                                <a href="<%= request.getContextPath() %>/listeRoles">Liste des R�les</a>
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