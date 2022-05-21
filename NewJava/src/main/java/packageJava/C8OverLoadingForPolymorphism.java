package packageJava;

public class C8OverLoadingForPolymorphism {
	
	public void talk(C9ParentsForOverloadingExample StyleOfTalking) {
		System.out.println("Talking to Parents: Polite, respectful!!");
	}
	
	public void talk(D1PartnerForOverloadingExample StyleOfTalking) {
		System.out.println("Talking to Partner: Love, respectful!!");
	}
	public void talk(D2BossForOverLoadingExample StyleOfTalking) {
		System.out.println("Talking to Boss: Strictly Business!!");
	}

	public static void main(String[] args) {
		
		C8OverLoadingForPolymorphism poly = new C8OverLoadingForPolymorphism();
		D1PartnerForOverloadingExample partner = new D1PartnerForOverloadingExample();
		poly.talk(partner);
		D2BossForOverLoadingExample boss = new D2BossForOverLoadingExample();
		poly.talk(boss);
		C9ParentsForOverloadingExample parents = new C9ParentsForOverloadingExample();
		poly.talk(parents);

	}

}
