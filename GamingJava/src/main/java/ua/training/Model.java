package ua.training;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int minBarrier;
    private int maxBarrier;
    private int secretNumber;
    private List<Integer> history = new ArrayList<Integer>();
    private String answerState;

    private static final int RAND_MIN = 0;
    private static final int RAND_MAX = 100;

    public boolean checkSecretNumber(int inputNumber){

        history.add(inputNumber);
        if(inputNumber == secretNumber){
            return true;
        } else if ( inputNumber > secretNumber){
            maxBarrier = inputNumber;
            answerState = AnswerStateEnum.GRATER.getString();
        }else{
            minBarrier = inputNumber;
            answerState = AnswerStateEnum.LESS.getString();
        }
        return false;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }

    public List<Integer> getHistory() {
        return history;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber() {
        secretNumber = rand();
    }

    public String getAnswerState() {
        return answerState;
    }

    public int rand(){
        minBarrier = RAND_MIN;
        maxBarrier = RAND_MAX;
        return rand(RAND_MIN,RAND_MAX);
    }

    public int rand(int min, int max){
        return min + (int) (Math.random() * (max-min));
    }



}
