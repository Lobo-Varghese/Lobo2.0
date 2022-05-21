package packageJava;

public class B5HeroGuesserIfElseIf {
	
	//String superHero ;
	
	public void SuperHeroGuesser(String superHero) {
		if(superHero.equals("IronMan")) {
			System.out.println("Super Hero is: IronMan");
		}else if(superHero.equals("SuperMan")){
			System.out.println("Super Hero is: SuperMan");
		}else if((superHero.equalsIgnoreCase("BlackWidow"))){
			System.out.println("Super Hero is: BlackWidow");
		}else {
			System.out.println("I can't guess your Super Hero");
		}
	}

	public static void main(String[] args) {
		B5HeroGuesserIfElseIf heroGuesser = new B5HeroGuesserIfElseIf();
		heroGuesser.SuperHeroGuesser("blackwidow");
	}

}
