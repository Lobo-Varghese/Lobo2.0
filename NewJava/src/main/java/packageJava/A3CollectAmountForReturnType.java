package packageJava;

//Requirement : Go Collect the Amount for me from another Person
public class A3CollectAmountForReturnType {

	public Integer collectedAmount = 1000;
	
	//void will not return anything - will just say i have collected
	public void collectAmountAndLetMeKnow() {
		System.out.println("Hi I have Collected Amount Rupees: "+ collectedAmount);
	}
	
	//Return Type - Integer will return a value
	public Integer collectAmountAndGiveItToMe() {
		System.out.println("Take this Collected Amount Rupees: "+ collectedAmount);
		return collectedAmount;
	}
	public static void main(String[] args) {
		
		// Creation Of Object for the Class
		A3CollectAmountForReturnType celine = new A3CollectAmountForReturnType();
		
		//Returns Void
		celine.collectAmountAndLetMeKnow();
		
		//Returns Integer
		Integer Amount = celine.collectAmountAndGiveItToMe();
		System.out.println("Celine Says: Take This Amount: "+ Amount);
		
	}

}
