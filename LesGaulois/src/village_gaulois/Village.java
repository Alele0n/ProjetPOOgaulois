package village_gaulois;
import personnages.Gaulois;
public class Village {
	
	private String nom;
	private Gaulois chef;
	private int nbVillageois = 0;
	private int countVillageois = 0;
	public Gaulois[] villageois;
	
	public Village( String nom,int nbVillageois,Gaulois chef) {
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.villageois = new Gaulois[nbVillageois];
		this.chef = chef;
		
		chef.setVillage(this);
	}
	
	
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[countVillageois] = gaulois;
		gaulois.setVillage(this);
		countVillageois++;
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if(numVillageois - 1 > countVillageois-1) {
			System.out.println("Il n'y a autant d'habitants dans notre village!");
			return null;
		}else {
			return villageois[countVillageois-1];
		}
	}
		
	public void afficherViallage() {
		System.out.println("Dans le village \"Village des Irréductibles\" du chef "+chef.getNom()+" vivent les legendaires gaulois: ");
		for (int i = 0; i < countVillageois; i++) {
			System.out.println("-"+villageois[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		Gaulois abraracourcix  = new Gaulois("Abraracourcix ", 6);
		Village village = new Village("Village des ireducctibles",30,abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);
		village.trouverVillageois(30);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherViallage();
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterVillageois(obelix);
		Gaulois doublepolemix = new Gaulois("Doublepolemix", 4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();
		
		
	}
	
}