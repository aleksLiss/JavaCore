package AleksLiss.LearningJavaCore.patterns.builder;

public class User {
    private String name;

    private String surname;

    private byte age;

    private String login;

    private String password;

    private boolean activated;

    private String gender;

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", activated=" + activated +
                ", gender='" + gender + '\'' +
                '}';
    }
}