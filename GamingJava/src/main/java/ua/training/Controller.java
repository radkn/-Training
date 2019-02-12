package ua.training;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        this.model.setSecretNumber();
        int secretNumber;
        while (!model.checkSecretNumber(secretNumber = inputIntNumber(sc))){

            if(model.getAnswerState().equals("less")){
                view.printMessage(View.SMALL_INPUT_DATA);
            }else if(model.getAnswerState().equals("grater")){
                view.printMessage(View.BIG_INPUT_DATA);
            }
        }
        view.printMessage(View.CONGRATULATE);
        view.printMessage(View.SECRET_NUMBER + secretNumber);
        view.printMessage(View.COUNT_OF_ATTEMPTS + model.getHistory().size());
        view.printMessage(View.STATISTIC);
        view.printIntegerListValue(model.getHistory());
    }

    private int inputIntNumber(Scanner sc){
        int res = 0;
        while(true){
            view.printMessageWithDiapathon(View.PLEASE_ENTER_NUMBER,
                    model.getMinBarrier(), model.getMaxBarrier());
            if (!sc.hasNextInt()){
                view.printMessage(View.INPUT_DATA_FORMAT_WRONG);
                sc.next();
                continue;
            }

            res = sc.nextInt();
            if(res <= model.getMinBarrier() || res >= model.getMaxBarrier()){
                view.printMessage(View.INPUT_DATA_OUT_OF_RANGE);
                continue;
            }
            break;
        }
        return res;
    }
}
