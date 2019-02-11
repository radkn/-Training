package ua.training;

import java.util.List;

public class View {

    public static final String INPUT_DATA_FORMAT_WRONG =
            "Input data format is wrong!";
    public static final String PLEASE_ENTER_NUMBER =
            "Please enter integer number between ";
    public static final String INPUT_DATA_OUT_OF_RANGE =
            "Your number is out of range.";
    public static final String SMALL_INPUT_DATA =
            "Your number is less than a secret number..";
    public static final String BIG_INPUT_DATA =
            "Your number is more than a secret number.";
    public static final String CONGRATULATE =
            "You guessed. Сongratulations!";
    public static final String SECRET_NUMBER =
            "Secret number is: ";
    public static final String COUNT_OF_ATTEMPTS =
            "Used attempts: ";
    public static final String STATISTIC = "All input number: ";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageWithDiapathon(String message, int min, int max){
        System.out.println(message+min+" and "+max+ ": ");
    }

    public void printIntegerListValue(List<Integer> arr){
        for(int i = 0; i <= arr.size()-2; i++) {
            System.out.print(arr.get(i)+", ");
        }
        System.out.print(arr.get(arr.size()-1)+".");
    }
}
