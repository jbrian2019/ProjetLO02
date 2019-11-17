package projet;

public class Principale {

	public static void main(String[] args) {
			Partie partie1 = new Partie(1,0);
			
			Joueur rodolphe = new Joueur("Rodolphe");
			System.out.println(rodolphe);
			partie1.AjouterJoueur(rodolphe);
	}

}
