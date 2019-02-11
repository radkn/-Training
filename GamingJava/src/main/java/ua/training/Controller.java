package ua.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.lang.Math;

public class Controller {

    private Model model;
    private View view;

    private static final int RAND_MIN = 0;
    private static final int RAND_MAX = 100;

    private List<Integer> history = new ArrayList<Integer>();

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;

        this.model.setSecretNumber(rand());
        this.model.setMinBarrier(RAND_MIN);
        this.model.setMaxBarrier(RAND_MAX);
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        int secretNumber;
        while (!checkSecretNumber(secretNumber = inputIntNumber(sc))){

        }
        view.printMessage(View.CONGRATULATE);
        view.printMessage(View.SECRET_NUMBER + secretNumber);
        view.printMessage(View.COUNT_OF_ATTEMPTS + history.size());
        view.printMessage(View.STATISTIC);
        view.printIntegerListValue(history);
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


    private boolean checkSecretNumber(int inputNumber){

        history.add(inputNumber);
        if(inputNumber == model.getSecretNumber()){
            return true;
        } else if ( inputNumber > model.getSecretNumber()){
            model.setMaxBarrier(inputNumber);
            view.printMessage(View.BIG_INPUT_DATA);
        }else{
            model.setMinBarrier(inputNumber);
            view.printMessage(View.SMALL_INPUT_DATA);
        }
        return false;
    }

    public int rand(){
        return rand(RAND_MIN,RAND_MAX);
    }

    public int rand(int min, int max){
        return min + (int) (Math.random() * (max-min));
    }
}
