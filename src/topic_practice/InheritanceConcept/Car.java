package topic_practice.InheritanceConcept;

public class Car extends Vehicle{

	final int speed = 100;
	int price = 70;
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void start(int a) {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public final void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public void applyBreak() {
		System.out.println("Car -- applyBreak");
	}
	
	// static methods can not be overridden
		public static void billing() {
			System.out.println("car -- billing");
		}

		// private methods can not be overridden
		private void getCarInfo() {
			System.out.println("Car -- get info");
		}

		public void getInfo() {
			getCarInfo();
		}
		
		public void cruiceControl() {
			System.out.println("car -- cruiceControl");
		}
}
