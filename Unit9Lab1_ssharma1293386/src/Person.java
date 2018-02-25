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
    private Name name;
    private Date birthDay;

    public String getFirstName(){
        return name.getFirstName();
    }
    public String getLastName(){
        return name.getLastName();
    }
    public String getNameString(){
        return this.name.getNameString();
    }
    
    public String getDate(){
        return this.birthDay.getDateString();
    }
    
    public String getDateString(){
        return birthDay.getDateString();
    }
    public Person(String fn, String ln, Date  bd){    
        Name name = new Name(fn, ln);
        this.name = name;
        this.birthDay = bd;
    }
    public Person(Name name, Date date){
        this.name = name;
        this.birthDay = date;
    
    }
    
    
    //public Person(){
        //this.name.setFirstName("None");
        //this.name.setLastName("None");
        //this.birthDay = new Date (99, 99, 9999);
    //}

}
