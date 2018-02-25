/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class MyPublisher extends Publisher {

    private int count;
    private int max;

    public MyPublisher(int max) {
        super(max);
        count = 0;
    }

    public void increment() {
        count++;

        // Notify subscribers if count >= 3
        if (count >= 3) {
            this.notifySubscribers();
        }
    }
}
