package topic_practice.InheritanceConcept;

public class TestAnimal {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		d.run();
		d.walk();
		d.fastBreathing();
		d.domesticAnimal();
		Dog.doSraching();
		Animal.doSraching();
		
		d.setOwnerName("meera");
		d.setVaccinated(true);
		String owner = d.getOwnerName();
		System.out.println(owner);
		
		boolean flag = d.isVaccinated();
		System.out.println(flag);
		
		d.dogBite();
	}

}
