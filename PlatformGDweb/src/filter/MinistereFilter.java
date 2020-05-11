//package filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import metier.entities.Utilisateur;
//
//@WebFilter(urlPatterns = { "/accepter_don", "/accepter_inscrit", "/ajoutCategorieMinistere", "/AjoutEtablissement",
//		"/ajoutFournisseurMinistere", "/ajoutProduitMinistere", "/ajout_unite_de_mesure", "/besoinMinistere",
//		"/Liste_categories", "/Demandes_inscrit", "/editFournisseur", "/editProduitMinistere", "/Liste_Besoins",
//		"/Liste_Donnateurs", "/Liste_Dons", "/Liste_DRS", "/Liste_Etablissements", "/Liste_Fournisseurs",
//		"/Liste_Intermediaire", "/Ministere", "/produitMinistere", "/Liste_produits", "/supprimer_inscrit",
//		"/Liste_unite_de_mesure", "/supprimer_don", "/accepter_don_reglement", "supprimer_don_reglement" })
//public class MinistereFilter implements Filter {
//
////	private static final Set<String> ALLOWED_PATHS_lOGIN = Collections.unmodifiableSet(new HashSet<>(
////            Arrays.asList()));
////            
////    private static final Set<String> ALLOWED_PATHS = Collections.unmodifiableSet(new HashSet<>(
////            Arrays.asList("", "/index.jsp","/accepter_don", "/accepter_inscrit", "/ajoutCategorieMinistere", "/AjoutEtablissement", 
////            		"/ajoutFournisseurMinistere", "/ajoutProduitMinistere", "/ajout_unite_de_mesure", "/besoin", "/besoins", 
////            		"/categorie", "/Liste_categories", "/Demandes_inscrit", "/editFournisseur", "/editProduit","/Liste_Besoins"
////            		,"/Liste_Donnateurs", "/Liste_Dons", "/Liste_DRS", "/Liste_Etablissements", "/Liste_Fournisseurs", "/Liste_Intermediaire"
////            		, "/Ministere", "/produit", "/Liste_produits", "/supprimer_inscrit", "/Liste_unite_de_mesure", "/supprimer_don"
////            		)));
//
//	@Override
//	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
//			throws IOException, ServletException {
//		HttpServletRequest request = (HttpServletRequest) req;
//		HttpServletResponse response = (HttpServletResponse) res;
//		HttpSession session = request.getSession(false);
//		String loginURI = request.getContextPath() + "/";
//
////        String path = request.getRequestURI().substring(request.getContextPath().length()).replaceAll("[/]+$", "");
//
//		boolean loggedIn = session != null && session.getAttribute("user") != null;
//		// boolean loginRequest = request.getRequestURI().equals(loginURI);
//		// boolean allowedPath = ALLOWED_PATHS.contains(path);
//		// boolean allowedPathLogin = ALLOWED_PATHS_lOGIN.contains(path);
//		Utilisateur user;
////		System.out.println("**************************** before test ******************************************");
//		if (loggedIn) {
//			user = (Utilisateur) session.getAttribute("user");
////			System.out.println("**************************** before ministere ******************************************");
////			System.out.println(user.getRole());
////			System.out.println(user.getRole().equals("ministere"));
//			if (user.getRole().equals("ministere")) {
////    			System.out.println("**************************** ministere ******************************************");
//				System.out.println(session.getAttribute("user"));
//				chain.doFilter(request, response);
//			}
//		}
//
//		else {
////    			System.out.println("**************************** No user ******************************************");
//			response.sendRedirect(loginURI);
//		}
//
//	}
//}