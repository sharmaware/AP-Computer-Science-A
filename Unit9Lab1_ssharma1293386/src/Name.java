/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Name {
    private String firstName;
    private String lastName;
    
    public Name(){
        firstName = "None";
        lastName = "None";
    }

    public Name(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public String getNameString(){
        return String.format("%s %s", this.firstName, this.lastName);
    }
    public void setFirstName(String fn){
        firstName = fn;
    }
    public void setLastName(String ln){
       lastName = ln;
    }
}
