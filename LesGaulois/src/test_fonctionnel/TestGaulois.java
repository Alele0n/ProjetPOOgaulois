package test_fonctionnel;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		Romain minus = new Romain("Minus", 24);
		Druide panoramix = new Druide("Panoramix", 4);
		
		asterix.parler("Bonjour Obelix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui tres bonne idee");
		System.out.println("Dans la forêt Astérix et Obélix tombent nez à nez sur le romain Minus.");
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
			
		
			
	}
}