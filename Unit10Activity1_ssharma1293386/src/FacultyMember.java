/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class FacultyMember extends Employee {

    public FacultyMember(Date BirthDate) {
        super(BirthDate);
    }
    private String officeHours;
    private String rank;

    public String toStringOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toStringRank() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("Class Name: FacultyMember%n Person Name:", this.toStringName());
    }
}
