/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Student extends Person {

    private String classStatus;

    public Student(String name, String address, String eAddress, String phoneNumber, Date birthDate) {
        super(name, address, eAddress, phoneNumber, birthDate);
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    public String toStringClassStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return String.format("Class Name: Student%nStudent Name: %s", this.toStringName());
    }
}
