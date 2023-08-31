package ProjectAssociation;

public class HospitalDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Invoking main in HospitalDoctor");
		
		Hospital hospital=new Hospital();
		hospital.treatment();
		hospital.rooms();
		
		Doctor doctor=new Doctor();
		doctor.stethoscope();
		doctor.whiteCoat();
		
		Nurse nurse=new Nurse();
		nurse.injection();
		nurse.tools();
		
		Patient patient=new Patient();
		patient.fever();
		patient.cough();
	}

}
