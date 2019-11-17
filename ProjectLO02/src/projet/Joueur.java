package projet;
import java.util.LinkedList;

public class Joueur {

	private String pseudo;
	private Boolean type_joueur=false;
	private LinkedList<Carte> main;
	
	public Joueur(String nom) {
		this.pseudo=nom;
		main = new LinkedList<Carte>();
		
	}
	public String getNom() {
		return pseudo;
	}
	public void setNom(String nom) {
		this.pseudo = nom;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.pseudo);
		sb.append(";");
		sb.append(main);
		sb.append("\n");
		return sb.toString();
	}
	
	
}
