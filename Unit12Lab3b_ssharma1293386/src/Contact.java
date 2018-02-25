/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Contact {

    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String Email;

    public Contact(String FirstName, String LastName, String PhoneNumber, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
