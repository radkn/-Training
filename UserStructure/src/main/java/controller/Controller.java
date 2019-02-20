package controller;

import view.StringConstants;
import view.View;

import java.util.Scanner;

public class Controller {

    private Scanner sc;
    private View view;
    public Controller(){
        sc =  new Scanner(System.in);
        view = new View();
    }

    public void processUser(){
        new InputAbonentNote(sc,view).addAbonent();
    }
}
