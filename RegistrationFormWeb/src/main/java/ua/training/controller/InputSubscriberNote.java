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
    private String nikName;
    private Group group;
    private String mobPhone;
    private String email;

    public InputSubscriberNote(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;
        this.subscriber = new Subscriber();
    }


    public boolean addSubscriber() {

        System.out.println("do get main Servlet");

        if (!inputFields()) {
            req.setAttribute("isSubscriberAdded", false);
            return false;
        }

        req.setAttribute("isSubscriberAdded", true);
        try {
            new ModelUtility().saveAbonent(subscriber);
            return true;
        } catch (WriteToDBException e) {
            System.err.println(e.getMessage());
            req.setAttribute("isSubscriberAdded", false);
            return true;
        }
    }

    private boolean inputFields() {

        subscriber.setFirstName(req.getParameter("firstName")
                .matches(Regexes.FIRST_NAME_REGEX.getRegex()) ? req.getParameter("firstName") : "Error. " + Regexes.FIRST_NAME_REGEX.getExplanation());
        subscriber.setLastName(req.getParameter("lastName")
                .matches(Regexes.LAST_NAME_REGEX.getRegex()) ? req.getParameter("lastName") : "Error. " + Regexes.LAST_NAME_REGEX.getExplanation());
        subscriber.setNikName(req.getParameter("nikName")
                .matches(Regexes.NIK_NAME_REGEX.getRegex()) ? nikName = req.getParameter("nikName") : "Error. " + Regexes.NIK_NAME_REGEX.getExplanation());
        subscriber.setGroup(req.getParameter("group")
                .matches(Regexes.GROUP_REGEX.getRegex()) ? group = Group.valueOf(req.getParameter("group")) : null);
        subscriber.setMobPhone(req.getParameter("mobPhone")
                .matches(Regexes.PHONE_MOB_REGEX.getRegex()) ? req.getParameter("mobPhone") : "Error. " + Regexes.PHONE_MOB_REGEX.getExplanation());
        subscriber.setEmail(req.getParameter("email")
                .matches(Regexes.EMAIL_REGEX.getRegex()) ? req.getParameter("email") : "Error. " + Regexes.EMAIL_REGEX.getExplanation());


        req.setAttribute("firstName", subscriber.getFirstName());
        req.setAttribute("lastName", subscriber.getLastName());
        req.setAttribute("nikName", subscriber.getNikName());
        req.setAttribute("group", subscriber.getGroup());
        req.setAttribute("mobPhone", subscriber.getMobPhone());
        req.setAttribute("email", subscriber.getEmail());


        return subscriber.getFirstName().startsWith("Error") &
                subscriber.getLastName().startsWith("Error") &
                subscriber.getNikName().startsWith("Error") &
                subscriber.getGroup() != null &
                subscriber.getMobPhone().startsWith("Error") &
                subscriber.getEmail().startsWith("Error");
    }

}
