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
public class Procedure {
    private String nameOfTheProcedure;
    private String dateOfTheProcedure;
    private String nameOfTheProcedurePerformer;
    private double chargesForTheProcedure;

    //Class Constructor Method below: Its format is "public " + class_name;
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
        nameOfTheProcedure = procedureName;
       dateOfTheProcedure = procedureDate;
        nameOfTheProcedurePerformer = practitionerName;
        chargesForTheProcedure = procedureCharges;
    }
    //Accessor Methods below
    public String getProcedureName() {
        return nameOfTheProcedure;
    }
    public double getProcedureCharges() {
        return chargesForTheProcedure;
    }
    public String getProcedureDate() {
        return dateOfTheProcedure;
    }
    public String getPractitionerName() {
        return nameOfTheProcedurePerformer;
    }

    //Mutator Methods below
    public void setProcedureName(String procedureName) {
        nameOfTheProcedure = procedureName;
    }
    public void setProcedureDate(String procedureDate) {
        dateOfTheProcedure = procedureDate;
    }
    public void setPractitionerName(String practitionerName) {
       nameOfTheProcedurePerformer = practitionerName;
    }
    public void setProcedureCharges(double procedureCharges) {
        chargesForTheProcedure = procedureCharges;
    }
}