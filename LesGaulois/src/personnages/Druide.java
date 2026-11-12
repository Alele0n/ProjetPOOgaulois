package personnages;
import objets.*;
public class Druide {
	private int force;
	private String nom;
	private Chaudron chaudron = new Chaudron();
	
	public Druide(String nom,int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String prendreParole() {
		return "Le Druide" + nom +" : ";
	}
		

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte +"\"");
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concate"+ quantite + "doses de potion magique.Elle a une force de:"+ forcePotion+".");
	}
	
	public void booster(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		boolean disponibilite = chaudron.resterPotion();
		if(disponibilite == true) {
			if(nomGaulois == "Obelix") {
				parler("Non "+ nomGaulois +" Non!.. Et tu le sais tres bien");
			}else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois + " un peut de potion magique.");
			}
		}else {
			parler("Desole "+ nomGaulois +" Tiens"+ nomGaulois + " il n'y a plus une suele goutte de potion");
		}
	}

	public String getNom() {
		return nom;
	}
	
	
}
