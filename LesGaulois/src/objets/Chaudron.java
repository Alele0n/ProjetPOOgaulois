package objets;
import personnages.*;
public class Chaudron {
	int quantitePotion;
	int forcePotion;
	
	public void remplirChaudron(int quantitePotion, int forcePotion) {
		this.forcePotion = forcePotion;
		this.quantitePotion = quantitePotion;
	}
	
	public boolean resterPotion() {
		if (quantitePotion != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int prendreLouche() {
		quantitePotion--;
		return forcePotion;
	}
}
