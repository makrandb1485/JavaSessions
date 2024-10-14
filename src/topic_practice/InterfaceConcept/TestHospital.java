package topic_practice.InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		
		fh.physioServices();
		fh.entServices();
		fh.cardioServices();
		fh.dentalServices();
		fh.orthoServices();
		fh.nuroServices();
		fh.pediaServices();
		
		fh.medicalTraining();
		fh.pathalogyServices();
		
		fh.emergencyServices();
		fh.medicalInsurance();
		
		USMedicals.billing();
		FortisHospital.billing();
		
		System.out.println(USMedicals.MIN_FEE);//10
		//USMedical.MIN_FEE = 100;
		
		System.out.println(FortisHospital.MIN_FEE);//50
		
		fh.covidVaccination();
		
		fh.medicalInsurance();
		
		fh.medicalNews();
		fh.medicalRD();

		
		//
		//USMedical us = new USMedical();//not allowed
		
		//top casting:
		//child class object can be referred by parent interface ref variable.
		USMedicals us = new FortisHospital();
		us.oncologyServices();
		us.physioServices();
		us.dentalServices();
		us.emergencyServices();
		us.medicalInsurance();
		us.covidVaccination();
		
		//down casting:
		//FortisHospital f1 = new USMedical();
		
	
	}
	
}
