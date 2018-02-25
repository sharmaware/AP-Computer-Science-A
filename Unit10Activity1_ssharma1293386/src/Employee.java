/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Employee extends Person {

    public Employee(String name, String address, String eAddress, String phoneNumber, Date birthDate) {
        super(name, address, eAddress, phoneNumber, birthDate);
    }

    public Employee(Date birthdate) {
        super("0", "0", "0", "0", birthdate);

    }
    private double salary;
    private Date hireDate;

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String toStringHireDate() {
        return hireDate.dateToString();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toStringSalary() {
        return String.format("%s", salary);
    }

    @Override
    public String toString() {
        return String.format("Class name: Employee %nPerson Name: %s", this.toStringName());
    }
}
