package packageJava;

public class B6HeroOrNotForSwitchCase {
	
	String hero = "BatMan";
	
	public void heroOrNot() {
		switch(hero) {
		case "batMan":
			System.out.println("IronMan is a Super Hero");
			break;
		case "SuperMan":
			System.out.println("SuperMan is a Super Hero");
			break;
		case "Hulk":
			System.out.println("Hulk is a Super Hero");
			break;
		default:
			System.out.println("Not sure about "+ hero);
		}
	}
	public static void main(String[] args) {
		
		B6HeroOrNotForSwitchCase isHero = new B6HeroOrNotForSwitchCase();
		isHero.heroOrNot();
	}

}
