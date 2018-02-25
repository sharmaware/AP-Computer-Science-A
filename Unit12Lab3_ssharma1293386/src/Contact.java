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
    private String email;

    public Contact(String firstname, String lastname, String phonenumber, String email) {
        this.FirstName = firstname;
        this.LastName = lastname;
        this.PhoneNumber = phonenumber;
        this.email = email;
    }

    public void setFirstName(String name) {
        FirstName = name;
    }

    public void setLastName(String name) {
        LastName = name;
    }

    public void setPhoneNumber(String number) {
        PhoneNumber = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
