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
public class Patient {
	
	
	
	
	
	
	
	
    private String patientFirstName;
    private String patientMiddleName;
    private String patientLastName;
    private String patientAddress;
    private String patientCity;
    private String patientState;
    private String patientZipCode;
    private String patientPhoneNumber;
    private String patientEmergencyContactName;
    private String patientEmergencyContactPhone;

    public Patient(String firstName, String middleName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhoneNumber) {
        patientFirstName = firstName;
       patientMiddleName = middleName;
        patientLastName = lastName;
        patientAddress = address;
        patientCity = city;
       patientState = state;
       patientZipCode = zipCode;
        patientPhoneNumber = phoneNumber;
        patientEmergencyContactName = emergencyContactName;
        patientEmergencyContactPhone = emergencyContactPhoneNumber;
    }

    public String getFirstName() {
        return patientFirstName;
    }

    public void setFirstName(String firstName) {
        patientFirstName = firstName;
    }

    public String getMiddleName() {
        return patientMiddleName;
    }

    public void setMiddleName(String middleName) {
        patientMiddleName = middleName;
    }

    public String getLastName() {
        return patientLastName;
    }

    public void setLastName(String lastName) {
       patientLastName = lastName;
    }

    public String getAddress() {
        return patientAddress;
    }

    public void setAddress(String address) {
        patientAddress = address;
    }

    public String getCity() {
        return patientCity;
    }

    public void setCity(String city) {
        patientCity = city;
    }

    public String getState() {
        return patientState;
    }

    public void setState(String state) {
        patientState = state;
    }

    public String getZipCode() {
        return patientZipCode;
    }

    public void setZipCode(String zipCode) {
        patientZipCode = zipCode;
    }

    public String getPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        patientPhoneNumber = phoneNumber;
    }

    public String getEmergencyContactName() {
        return patientEmergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        patientEmergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhoneNumber() {
        return patientEmergencyContactPhone;
    }

    public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
        patientEmergencyContactPhone = emergencyContactPhoneNumber;
    }
}
