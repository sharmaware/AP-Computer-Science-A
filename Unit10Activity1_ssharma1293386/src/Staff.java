/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Staff extends Employee {

    public Staff(Date BirthDate) {
        super("0", "0", "0", "0", BirthDate);
    }

    private String jobTitle;

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String toStringJobTitle() {
        return String.format("%s", jobTitle);
    }

    @Override
    public String toString() {
        return String.format("Class Name: Staff%nStudent Name: %s", this.toStringName());
    }
}
