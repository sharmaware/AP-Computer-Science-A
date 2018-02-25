/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Person {

    private String name;
    private String address;
    private String eAddress;
    private String phoneNumber;
    private Date birthDate;

    public Person(String name, String address, String eAddress, String phoneNumber, Date birthDate) {
        this.name = name;
        this.address = address;
        this.eAddress = eAddress;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEAddress(String eAddress) {
        this.eAddress = eAddress;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(int month, int day, int year) {
        this.birthDate = new Date(month, day, year);
    }

    public String toStringName() {
        return String.format("The name is %s", name);
    }

    public String toStringAddress() {
        return String.format("The address is %s", address);
    }

    public String toStringEAddress() {
        return String.format("The email address is %s", eAddress);

    }

    public String toStringPhoneNumber() {
        return String.format("The phone number is %s", phoneNumber);
    }

    public String toStringBirthDate() {
        return String.format("The birth date is %s", birthDate.dateToString());
    }

    @Override
    public String toString() {
        return String.format("Class Name: Person%nPerson Name: %s", this.toStringName());
    }
}
