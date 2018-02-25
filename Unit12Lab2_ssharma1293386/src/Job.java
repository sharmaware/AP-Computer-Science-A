/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Job {

    private int JobNumber;
    private int PrintTime;

    public void setJobNumber(int number) {
        this.JobNumber = number;

    }

    public int getJobNumber() {
        return JobNumber;
    }

    public void setPrintTime(int time) {
        PrintTime = time;
    }

    public int getPrintTime() {
        return PrintTime;
    }
}
