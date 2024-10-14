package topic_practice.InheritanceConcept;

public class Dog extends Animal {
	
	private String ownerName;
	private boolean isVaccinated;
	

	@Override
	public void eat(){
		System.out.println("Dog -- eat");
	}
	
	@Override
	public void walk(){
		System.out.println("Dog -- walk");
	}
	
	@Override
	public void run(){
		System.out.println("Dog -- run");
	}
	
	public void fastBreathing() {
		System.out.println("Dog -- fastBreathing");
	}

	public boolean isVaccinated() {
		return isVaccinated;
	}

	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void dogBite() {
		Lion l = new Lion();
		l.doBite();
	}
}
