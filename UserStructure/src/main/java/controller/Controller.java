package controller;

import model.Abonent;
import view.View;

public class Controller {

    private Abonent abonent;
    private View view;
    public Controller(){
        abonent = new Abonent();
        view = new View();
    }

    public void processUser(){
        new InputAbonentNote(abonent).addAbonent();
    }
}
