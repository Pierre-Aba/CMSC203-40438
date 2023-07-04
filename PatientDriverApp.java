/*
 * Class: CMSC203 40438
 * Instructor: Professor Grinberg
 * Description: The Patient Class is used to instantiate an object that controls the attributes of a medical patient
 *              The Procedure Class is used to instantiate an object that controls the attributes of a medical Procedure
 * Due: 7/3/2023
 * Platform/compiler: Eclipse Workspace
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Pierre Aba
*/
package Patient_Procedure_Package;
public class PatientDriverApp {


	public static void main(String[] args)
{
	// Instantiating patient class
	var newPat = new Patient("Jack", "The","Ripper","616 demise ave","Smallville","OH","20123",
			"260-124-5473","Jill Beans","224-231-2423");

	// Printing patient info
	System.out.println("Patient Information:");
	System.out.println("First Name: " + newPat.getFirstName());
	System.out.println("Middle Name: " + newPat.getMiddleName());
	System.out.println("Last Name: " + newPat.getLastName());
	System.out.println("Address: " + newPat.getAddress());
	System.out.println("City: " + newPat.getCity());
	System.out.println("State: " + newPat.getState());
	System.out.println("ZIP Code: " + newPat.getZipCode());
	System.out.println("Phone Number: " + newPat.getPhoneNumber());
	System.out.println("Emergency Contact Info: " + newPat.getEmergencyContactName()+"  "+newPat.getEmergencyContactPhoneNumber());

	System.out.println();
	System.out.println("The procedures are below\n");


	// Instantiating 3 objects of the Procedure class
	Procedure proc_1 = new Procedure("Physical Exam", "7/3/2023", "Dr. Irvine", 250.00);
	Procedure proc_2 = new Procedure("X-ray", "7/3/2023", "Dr. Jamison", 500.00);
	Procedure proc_3 = new Procedure("Blood test", "7/3/2023", "Dr. Smith", 200.00);  // Assuming blood test charges are not applicable here

	// Printing procedure info
	System.out.println("Procedure #1:");
	System.out.println("Procedure name: " + proc_1.getProcedureName());
	System.out.println("Date: " + proc_1.getProcedureDate());
	System.out.println("Practitioner: " + proc_1.getPractitionerName());
	System.out.println("Charge: $" + proc_1.getProcedureCharges());
	System.out.println();

	System.out.println("Procedure #2:");
	System.out.println("Procedure name: " + proc_2.getProcedureName());
	System.out.println("Date: " + proc_2.getProcedureDate());
	System.out.println("Practitioner: " + proc_2.getPractitionerName());
	System.out.println("Charge: $" + proc_2.getProcedureCharges());
	System.out.println();

	System.out.println("Procedure #3:");
	System.out.println("Procedure name: " + proc_3.getProcedureName());
	System.out.println("Date: " + proc_3.getProcedureDate());
	System.out.println("Practitioner: " + proc_3.getPractitionerName());
	System.out.println("Charge: $" + proc_3.getProcedureCharges());
	System.out.println();
	System.out.println("The total charge of the procedures is $"+(proc_1.getProcedureCharges()+proc_2.getProcedureCharges()+proc_3.getProcedureCharges()));
	System.out.println("Student: Pierre Aba\nStudent M# M21058617\nDue: 7/3/2023");

}
}
