package service;

import javax.ejb.EJB;
import java.nio.charset.StandardCharsets;
import javax.ejb.NoSuchEJBException;
import javax.naming.Context;
import javax.naming.InitialContext;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Hashtable;

import metier.entities.Utilisateur;
import metier.session.PlatformGDRemote;

public class DaoManagement {
	@EJB
	private PlatformGDRemote gestionCommandeBean;
	
	public DaoManagement() {
		try {
			final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
			jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			final Context context = new InitialContext(jndiProperties);
			gestionCommandeBean = (PlatformGDRemote) context
					.lookup("java:global/PlatformGDEAR/PlatformGD/BK!metier.session.PlatformGDRemote");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public boolean authentification(String username, String clearPassword) {
		MessageDigest digest = null;
		try {
			try {
				digest = MessageDigest.getInstance("SHA-256");
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			byte[] hash = digest.digest(clearPassword.getBytes(StandardCharsets.UTF_8));
			String hashedPassword = Base64.getEncoder().encodeToString(hash);
			return gestionCommandeBean.authentification(username, hashedPassword);
		} catch (NoSuchEJBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public String ajouteUtilisateur(Utilisateur utilisateur) {
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] hash = digest.digest(utilisateur.getMdp().getBytes(StandardCharsets.UTF_8));
		String hashedPassword = Base64.getEncoder().encodeToString(hash);
		utilisateur.setMdp(hashedPassword);
		return gestionCommandeBean.ajouteUtilisateur(utilisateur);
	}
}
