package packageJava;

public class A8DrawForConstructorOverLoading {
	
	String drawShape;
	
	//Define Constructor OverLoading
	//Same Constructor with and without Parameter
	
	A8DrawForConstructorOverLoading(){
		
	} 
	
	A8DrawForConstructorOverLoading(String draw){
		drawShape = draw;
	}
	
	public void constructorOverLoadingMethod() {
		System.out.println("Shape: "+ drawShape);
	}

	public static void main(String[] args) {
		A8DrawForConstructorOverLoading NoArg = new A8DrawForConstructorOverLoading();
		A8DrawForConstructorOverLoading Para = new A8DrawForConstructorOverLoading("circle");
		NoArg.constructorOverLoadingMethod();
		Para.constructorOverLoadingMethod();
	}

}
