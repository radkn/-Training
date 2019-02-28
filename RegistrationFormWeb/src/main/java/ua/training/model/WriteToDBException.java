package ua.training.model;

import ua.training.model.entities.Subscriber;

public class WriteToDBException extends Exception {

    private Subscriber subscriber = new Subscriber();

    public WriteToDBException(Subscriber subscriber, String message) {
        super(message);
        this.subscriber = subscriber;
    }

    public Subscriber getSubscriber(){
        return this.subscriber;
    }
}
