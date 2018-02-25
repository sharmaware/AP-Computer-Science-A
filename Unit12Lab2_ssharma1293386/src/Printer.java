/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author saarthaksharma
 */
public class Printer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnGenerator = new Random(8);
        Scanner input = new Scanner(System.in);
        LinkedList<Job> queue = new LinkedList();

        System.out.println("Type 'Job' to add a job or type 'quit' to quit");

        String UserInput = "Job";
        int count = 0;

        //While user keeps adding jobs, keep making job objects and setting print time and job number
        while (UserInput.equals("Job") || UserInput.equals("job")) {
            UserInput = input.next();

            if (UserInput.equals("job") || UserInput.equals("Job")) {

                count = count + 1;

                Job e = new Job();

                e.setJobNumber(count);
                e.setPrintTime(rnGenerator.nextInt(1000) + 10);
                queue.addLast(e);
                System.out.printf("Job added to queue. Current number of jobs = %s ", count);
            } else {
                break;
            }
        }
        if (UserInput.equals("quit") || UserInput.equals("Quit")) {
            System.out.printf("Job Number\tPrint Time (seconds)%n");
            for (Job job : queue) {

                System.out.printf("%s\t\t%s%n", job.getJobNumber(), job.getPrintTime());
            }
        }

    }

}
