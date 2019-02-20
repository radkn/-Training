package controller;

import view.StringConstants;
import view.View;

import java.util.Scanner;

public class DialogueController {
    private Scanner scanner;
    private View view;

    DialogueController(Scanner scanner, View view){
        this.scanner = scanner;
        this.view = view;
    }

    public String dataEntryRequest(String message, String regex){

        String inputString;
        view.printMessage(message);
        while (!(scanner.hasNext() &&
                (inputString = scanner.next()).matches(regex))) {
            view.printMessage(StringConstants.WRONG_DATA);
            view.printMessage(message);
        }

        return inputString;
    }

}
