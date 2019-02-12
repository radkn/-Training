package ua.training;

public enum AnswerStateEnum {
    GRATER("grater"), LESS("less");

    private String str;

    AnswerStateEnum(String s) {
        this.str = s;
    }

    public String getString(){
        return str;
    }
}
