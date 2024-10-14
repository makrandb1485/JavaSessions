package topic_practice.EncapsulationConcept;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank b = new Bank("Pooja", 50, "35454545", "8356665656");
		
		System.out.println(b.getAadharNumber());
		
		System.out.println(b.getAge());
		
		b.openAccount();
		
		//Company c = new Company(); cannot create object of class having private constructor
		
		Company.getDetails();
		
	}

}
