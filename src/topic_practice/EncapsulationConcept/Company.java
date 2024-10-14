package topic_practice.EncapsulationConcept;

public class Company {
	
	private Company() {
		
	}
	
	private static void getRevenue() {
		System.out.println("get rev");
	}
	
	public static void getDetails() {
		getRevenue();
	}
	

}
