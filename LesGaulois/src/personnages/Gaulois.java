package personnages;
import village_gaulois.Village;
public class Gaulois {

    private String nom;
    private int force;
    private int effetPotion = 1;
    private Village village;

    public Gaulois(String nom, int force) {
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
        return "Le gaulois " + nom + " : ";
    }

	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain){
		String nomRomain = romain.getNom();
		System.out.println(getNom() +" envoi un grand coup dans la machoire de" + nomRomain);
		int forceCoup = force/3;
		romain.recevoirCoup(forceCoup);
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		force *= effetPotion;
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void sePresenter() {
		if (village == null) {
		    // No pertenece a ningún pueblo
			parler("Bonjour je m'appelle: "+ getNom()+ ". Je voyage de village en village");
		} else if (village.getChef() == this) {
			parler("Bonjour je m'appelle: "+ getNom()+". Je suis le chef du Village "+ village.getNom());
		} else {
		    // Es un habitante
			parler("Bonjour je m'appelle: "+ getNom()+". J'habite dans le village : "+village.getNom());
		}
	}
	
	
    
}

