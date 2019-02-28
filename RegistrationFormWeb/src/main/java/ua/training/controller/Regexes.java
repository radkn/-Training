package ua.training.controller;

import ua.training.model.entities.Group;

public enum Regexes {
    FIRST_NAME_REGEX("^[A-Za-z]+$","first name","must contains just latin alphabet symbol"),
    LAST_NAME_REGEX("^[A-Za-z]+$","last name","must contains just latin alphabet symbol"),
    NIK_NAME_REGEX ("^[A-Za-z]+$","nik name","must contains just latin alphabet symbol"),
    GROUP_REGEX("^"+getGroupRegex()+"$","group",getGroupNames()),
    PHONE_MOB_REGEX("^[0-9]{10}$","first mobile phone","must contains 10 digits"),
    EMAIL_REGEX("^[A-Za-z]{1}[A-Za-z0-9_\\.]{2,20}@[A-Za-z_]{2,10}\\.[A-Za-z]{2,10}$","email","must contains latin alphabet symbol: abc@abc.com");


    private String regex;
    private String nameOfField;
    private String explanation;

    Regexes(String regex, String nameOfField, String explanation){
        this.regex = regex;
        this.nameOfField = nameOfField;
        this.explanation = explanation;
    }

    public String getRegex() {
        return regex;
    }

    public String getNameOfField() {
        return nameOfField;
    }

    public String getExplanation() {
        return explanation;
    }

    private static String getGroupRegex(){

        StringBuilder reg = new StringBuilder();
        for (Group group:Group.values()) {
            reg.append(group).append("|");
        }

        return reg.toString();
    }

    private static String getGroupNames(){

        StringBuilder reg = new StringBuilder();
        for (Group group:Group.values()) {
            reg.append(group).append(" ");
        }

        return reg.toString();
    }
}
