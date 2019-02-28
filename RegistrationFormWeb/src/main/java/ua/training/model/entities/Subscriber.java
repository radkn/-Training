package ua.training.model.entities;

public class Subscriber {
    private String firstName;
    private String lastName;
    private String nikName;
    private Group group;
    private String mobPhone;
    private String email;

    public Subscriber() {
        this.firstName = "";
        this.lastName = "";
        this.nikName = "";
        this.group = null;
        this.mobPhone = "";
        this.email = "";
    }

    public Subscriber(String firstName,
                      String lastName,
                      String nikName,
                      Group group,
                      String mobPhone,
                      String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nikName = nikName;
        this.group = group;
        this.mobPhone = mobPhone;
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

    public String getNikName() {
        return nikName;
    }

    public void setNikName(String nikName) {
        this.nikName = nikName;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getMobPhone() {
        return mobPhone;
    }

    public void setMobPhone(String mobPhone) {
        this.mobPhone = mobPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastNameAndInitial(){
        return lastName+" "+firstName.substring(0,1)+". ";
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nikName='" + nikName + '\'' +
                ", group=" + group +
                ", mobPhone='" + mobPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
