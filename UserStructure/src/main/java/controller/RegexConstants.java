package controller;

public interface RegexConstants {
    public final String FIRST_NAME_REGEX = "^[A-Za-z]+$";
    public final String LAST_NAME_REGEX = "^[A-Za-z]+$";
    public final String FATHER_NAME_REGEX = "^[A-Za-z]+$";
    public final String NIK_NAME_REGEX = "^[A-Za-z]+$";
    public final String COMMENT_REGEX = "^[A-Za-z0-9 .,?!=:;\"'()]*$";
    public final String GROUP_REGEX = "^G[A-C]$";
    public final String PHONE_HOME_REGEX = "^[0-9]{10}$";
    public final String PHONE_MOB_REGEX = "^[0-9]{10}$";
    public final String PHONE_MOB2_REGEX = "^([0-9]{10}||[\\n]*)$";
    public final String EMAIL_REGEX = "^[A-Za-z]{1}[A-Za-z0-9_\\.]{2,20}@[A-Za-z_]{2,10}\\.[A-Za-z]{2,10}$";
}
