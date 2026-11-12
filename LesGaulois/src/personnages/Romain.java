 package personnages;
import objets.Equipement;
public class Romain {

    private String nom;
    private int force;
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;
    

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le romain " + nom + " : ";
    }
    
    public void recevoirCoup(int forceCoup) {
    	assert (forceCoup >=0);
    	force = force - forceCoup;
    	if(force < 1) {
    		parler( "J'abandone");
    	}else {
    		parler("Aie");
    	}
    	assert (forceCoup*-1 <= 0);
    }
    
    
    
    public void ajouterEquipement(Equipement equipement) {
    	equipements[nbEquipement] = equipement;
    	nbEquipement++;
    	
    	 System.out.println("Le soldat " + nom + " s'équipe avec un "+ equipement + ".");
    }
    
    public void afficherPossetions(Equipement equipement) {
    	 System.out.println("Le soldat " + nom + " possède déjà un "
    	            + equipement + " !");
    }
    
    
    public void sEquiper(Equipement equipement) {
    	switch(nbEquipement) {
    	case 0: 
    		ajouterEquipement(equipement);
    		break;
    	case 1:
    		if(equipements[0].equals(equipement)) {
    			afficherPossetions(equipement);
    		}else {
    			ajouterEquipement(equipement);
    		}
    		break;
    	case 2: 
    		System.out.println("Le soldat"+ getNom()+" est bien protege!");
    		break;
    	}
    }
    
    
    
}