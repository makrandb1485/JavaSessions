package topic_practice.InterfaceConcept;

public class FortisHospital extends Medical implements USMedicals, UKMedicals, IndianMedicals {

	@Override
	public void cardioServices() {

		System.out.println("FS- cardioServices");
	}

	@Override
	public void orthoServices() {
		
		System.out.println("FS- orthoServices");
		
	}

	@Override
	public void nuroServices() {
		System.out.println("FS- nuroServices");
		
	}

	@Override
	public void entServices() {
		System.out.println("FS- entServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FS- pediaServices");
		
	}

	@Override
	public void dermaServices() {
		System.out.println("FS- dermaServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FS- physioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FS- oncologyServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FS- dentalServices");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FS- emergencyServices");
		
	}

	@Override
	public int test(int a) {
		System.out.println("FS- test 1");
		return 100;
	}

	@Override
	public int test(int a, int b) {
		System.out.println("FS- test 2");
		return 0;
	}
	
	public static void billing() {
		System.out.println("FH -- billing");
		
	}
	
	//trying to override default method of interface with public:
//	@Override
//	public void medicalInsurance() {
//		System.out.println("FH -- medical insurance");
//	}

	@Override
	public void covidVaccination() {
		
		System.out.println("FS- covidVaccination");		
	}
	
	@Override
	public void medicalRD() {
		System.out.println("FH R&D");
	}
	
	//Individual:
		public void medicalTraining() {
			System.out.println("Fh -- medical training");
		}
		
		public void pathalogyServices() {
			System.out.println("Fh -- pathalogyServices");
			medicalInsurance();

		}
	
}
