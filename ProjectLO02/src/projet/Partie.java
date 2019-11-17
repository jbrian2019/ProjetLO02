package projet;
import java.util.ArrayList;

public class Partie {
	private int nombre_reel=0;
	private int nombre_virtuel=0;
	private ArrayList<Joueur> joueurs;
	private String vainqueur="";
	
	public Partie(int reel, int virtuel){
		this.nombre_reel=reel;
		this.nombre_virtuel=virtuel;
	}
	public void AjouterJoueur(Joueur a) {
		joueurs.add(a);

	}
}
