package model;

public class Abonent {
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

    public Abonent() {}

    public Abonent(String firstName,
                   String lastName,
                   String fatherName,
                   String nikName,
                   String comment,
                   Group group,
                   String homePhone,
                   String mobPhone,
                   String mobPhone2,
                   String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.nikName = nikName;
        this.comment = comment;
        this.group = group;
        this.homePhone = homePhone;
        this.mobPhone = mobPhone;
        this.mobPhone2 = mobPhone2;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getNikName() {
        return nikName;
    }

    public void setNikName(String nikName) {
        this.nikName = nikName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobPhone() {
        return mobPhone;
    }

    public void setMobPhone(String mobPhone) {
        this.mobPhone = mobPhone;
    }

    public String getMobPhone2() {
        return mobPhone2;
    }

    public void setMobPhone2(String mobPhone2) {
        this.mobPhone2 = mobPhone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", nikName='" + nikName + '\'' +
                '}';
    }
}
