package controller;

import model.ModelUtility;
import model.WriteToDBException;
import model.entities.Abonent;
import model.entities.Group;
import view.StringConstants;
import view.View;

import java.util.Scanner;

import static view.StringConstants.*;

public class InputAbonentNote {
    private Abonent abonent;
    private View view;
    private Scanner sc;

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

    public InputAbonentNote(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
        this.abonent = new Abonent();
    }

    public void addAbonent() {
        view.printMessage(StringConstants.HELLO);

        firstName = inputField(Regexes.FIRST_NAME_REGEX);
        lastName = inputField(Regexes.LAST_NAME_REGEX);
        fatherName = inputField(Regexes.FATHER_NAME_REGEX);
        nikName = inputField(Regexes.NIK_NAME_REGEX);
        comment = inputField(Regexes.COMMENT_REGEX);
        group = Group.valueOf(inputField(Regexes.GROUP_REGEX));
        homePhone = inputField(Regexes.PHONE_HOME_REGEX);
        mobPhone = inputField(Regexes.PHONE_MOB_REGEX);
        mobPhone2 = inputField(Regexes.PHONE_MOB2_REGEX);
        email = inputField(Regexes.EMAIL_REGEX);

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

        while (true){
            try {
                new ModelUtility().saveAbonent(abonent);
                return;
            }catch (WriteToDBException e) {
                System.err.println(e.getMessage());
                abonent.setNikName(inputField(Regexes.NIK_NAME_REGEX));
            }
        }
    }

    private String inputField(Regexes regexes) {
        DialogueController dc = new DialogueController(sc,view);
        return dc.dataEntryRequest(INPUT_FIELDS +
                regexes.getNameOfField() + LEFT_BRACKET_SYMBOL +
                regexes.getExplanation() + RIGHT_BRACKET_SYMBOL +
                COLON_SYMBOL, regexes.getRegex());
    }
}
