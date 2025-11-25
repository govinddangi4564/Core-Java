package OOPM.Object;

class Person{
	String name;
	String gender;
	int age;
	
	void display() {
		System.out.println("Name : " + name + ", Gender : " + gender + ", Age : " + age);
	}
}

class Patient extends Person{
	long aadhar;
	String illness;
	
	void display() {
		super.display();
		 System.out.println("Aadhar Number : " + aadhar + ", Illness : " + illness);
	}
}

class Doctor extends Person{
	String speciality;
	int id;
	
	void display() {
		super.display();
		 System.out.println("Speciality : " + speciality + ", Doctor Id : " + id);
	}
}

class Nurse extends Person{
	String department;
	
	void display() {
		super.display();
		System.out.println("Department : " + department);
	}
}

class Admin extends Person{
	void managebilling() {
		System.out.println("Billing Managed by Admin" );
	}
}

class Appointment {
    Patient patient;
    Doctor doctor;
    String date;

    void schedule() {
        System.out.println("Appointment scheduled for " + patient.name + " with " + doctor.name + " on " + date);
    }
}

public class HospitalManagment {
	public static void main(String[] args) {
		Patient p = new Patient();
		p.name = "Rizwan";
		p.age = 19;
		p.gender = "Male";
		p.aadhar = 684845564;
		p.illness = "Bukhar.";
		
		Doctor d1 = new Doctor();
        d1.name = "Dr. Jhatka";
        d1.age = 45;
        d1.id = 10005;
        d1.gender = "Male";
        d1.speciality = "General Physician";

        Appointment app = new Appointment();
        app.patient = p;
        app.doctor = d1;
        app.date = "2025-05-01";

        p.display();
        d1.display();
        app.schedule();

        Admin admin = new Admin();
        admin.name = "Mr. Akshat";
        admin.managebilling();
	}

}
