package ua.training;

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



    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageWithDiapathon(String message, int min, int max){
        System.out.println(message+min+" and "+max+ ": ");
    }
}
