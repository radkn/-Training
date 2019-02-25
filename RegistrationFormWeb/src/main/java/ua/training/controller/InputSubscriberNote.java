package ua.training.controller;

import ua.training.model.ModelUtility;
import ua.training.model.WriteToDBException;
import ua.training.model.entities.Group;
import ua.training.model.entities.Subscriber;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputSubscriberNote {
    private Subscriber subscriber;

    HttpServletRequest req;
    HttpServletResponse resp;

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

    public InputSubscriberNote(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;
    }


    public void addAbonent() {

        System.out.println("do get main Servlet");
        firstName = req.getParameter("firstName");
        lastName = req.getParameter("lastName");
        fatherName = req.getParameter("fatherName");
        nikName = req.getParameter("nikName");
        comment = req.getParameter("comment");
        group = req.getParameter("group");
        homePhone = req.getParameter("homePhone");
        mobPhone = req.getParameter("mobPhone");
        mobPhone2 = req.getParameter("mobPhone2");
        email = req.getParameter("email");

        Subscriber subscriber = new Subscriber();
        subscriber.setFirstName(name);
        subscriber.setLastName(lastName);
        subscriber.setNikName(nikName);
        subscriber.setEmail(email);

        System.out.println(subscriber.toString());

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

        subscriber = new Subscriber(firstName,
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
                new ModelUtility().saveAbonent(subscriber);
                return;
            }catch (WriteToDBException e) {
                System.err.println(e.getMessage());
                subscriber.setNikName(inputField(Regexes.NIK_NAME_REGEX));
            }
        }
    }

    private String inputField(Regexes regexes) {
        DialogueController dc = new DialogueController();
        return "";
    }
}
