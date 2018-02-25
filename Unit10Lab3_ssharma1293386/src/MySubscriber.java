/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class MySubscriber extends Subscriber {

    public void update(String subscriber) {
        System.out.println(String.format("Subscriber %s has been notified", subscriber));
    }
}
