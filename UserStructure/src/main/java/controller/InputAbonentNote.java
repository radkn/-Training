package controller;

import model.Abonent;
import model.Group;
import view.StringConstants;
import view.View;

import java.util.Scanner;

public class InputAbonentNote {
    private Abonent abonent;
    private View view;
    private Scanner sc = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String fatherName;
    private String nikName;
    private String comment;
    private Group group;
    private String homePhone;
    private String mobPhone;
    private String mobPhone2;
    private String email;

    public InputAbonentNote(Abonent abonent) {
        this.abonent = abonent;
        this.view = new View();
    }

    public void addAbonent(){
        view.printMessage(StringConstants.HELLO);

        firstName = inputField(View.FIRST_NAME, RegexConstants.FIRST_NAME_REGEX);
        lastName = inputField(View.LAST_NAME, RegexConstants.LAST_NAME_REGEX);
        fatherName = inputField(View.FATHER_NAME, RegexConstants.FATHER_NAME_REGEX);
        nikName = inputField(View.NIK_NAME, RegexConstants.NIK_NAME_REGEX);
        comment = inputField(View.COMMENT, RegexConstants.COMMENT_REGEX);
        group = Group.valueOf(inputField(View.GROUP, RegexConstants.GROUP_REGEX));
        homePhone = inputField(View.PHONE_HOME, RegexConstants.PHONE_HOME_REGEX);
        mobPhone = inputField(View.PHONE_MOB, RegexConstants.PHONE_MOB_REGEX);
        mobPhone2 = inputField(View.PHONE_MOB2, RegexConstants.PHONE_MOB2_REGEX);
        email = inputField(View.EMAIL, RegexConstants.EMAIL_REGEX);

        if(checkAllFields()){
            abonent = new Abonent(firstName,
                    lastName,
                    fatherName,
                    nikName,
                    comment,
                    group,
                    homePhone,
                    mobPhone,
                    mobPhone2,
                    email);
        }
    }

    private String inputField(String fieldName, String regex) {


        view.printMessage(View.INPUT_FIELDS +
                fieldName + View.LEFT_BRACKET_SYMBOL +
                regex + View.RIGHT_BRACKET_SYMBOL +
                View.COLON_SYMBOL);
        
        String inputString;
        while (!(sc.hasNext() && (inputString=sc.next()).matches(regex))){
            view.printMessage(StringConstants.WRONG_DATA);
        }

        return inputString;
    }

    private boolean checkAllFields() {
        return true;
    }

}
