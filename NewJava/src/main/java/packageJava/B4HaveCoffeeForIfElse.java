package packageJava;

public class B4HaveCoffeeForIfElse {
	
	boolean isCupEmpty = false;	

	public static void main(String[] args) {
		B4HaveCoffeeForIfElse coffee = new B4HaveCoffeeForIfElse();
		if(coffee.isCupEmpty) {
			System.out.println("Fill the Cup");
		}else
		{
			System.out.println("Drink the Cofee");
		}

	}

}
