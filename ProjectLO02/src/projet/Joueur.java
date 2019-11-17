package projet;

public class Joueur {

	private String pseudo="Joueur00";
	private Boolean type_joueur=false;
	
	public Joueur(String name, Boolean type) {
		this.pseudo=name;
		this.type_joueur = type;
		
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.pseudo);
		sb.append(";");
		sb.append(this.type_joueur);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Joueur player = new Joueur("Rodolphe",true);
		System.out.println(player);
	}
}
