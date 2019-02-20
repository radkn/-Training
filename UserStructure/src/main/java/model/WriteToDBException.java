package model;

import model.entities.Abonent;

public class WriteToDBException extends Exception {

    private Abonent abonent = new Abonent();

    public WriteToDBException(){

    }

    public WriteToDBException(String message){
        super(message);
    }


    public WriteToDBException(Abonent abonent, String message) {
        super(message);
        this.abonent = abonent;
    }

    public Abonent getAbonent(){
        return this.abonent;
    }
}
