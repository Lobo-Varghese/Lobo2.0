package packageJava;

public class D4ChildForOverridingExample extends D3ParentsForIOverridingExample{
	
	public void condition(){
		System.out.println("Will be a Enteurperner");
	}
	
	public static void main(String[] args) {		
		
		D3ParentsForIOverridingExample parent = new D4ChildForOverridingExample();
		parent.properties();
		parent.condition();
	}
}
