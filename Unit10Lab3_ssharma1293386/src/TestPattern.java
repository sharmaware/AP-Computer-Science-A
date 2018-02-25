/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class TestPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create Publisher & Subscriber objects
        MySubscriber aSubscriber = new MySubscriber();
        MyPublisher aPublisher = new MyPublisher(3);

        // Register a Subscriber
        aPublisher.register(aSubscriber);
        aPublisher.register(aSubscriber);
        aPublisher.register(aSubscriber);
        // Increment Publisher object to cause state changes
        aPublisher.increment();
        aPublisher.increment();
        aPublisher.increment();

    }

}
