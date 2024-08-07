package AleksLiss.LearningJavaCore.patterns.builder;

public class Builder {
    private String name;
    private String surname;
    private byte age;
    private String login;
    private String password;
    private boolean activated;
    private String gender;

    Builder buildName(String name) {
        this.name = name;
        return this;
    }

    Builder buildSurname(String surname) {
        this.surname = surname;
        return this;
    }

    Builder buildAge(byte age) {
        this.age = age;
        return this;
    }

    Builder buildLogin(String login) {
        this.login = login;
        return this;
    }

    Builder buildPassword(String password) {
        this.password = password;
        return this;
    }

    Builder buildActivated(boolean activated) {
        this.activated = activated;
        return this;
    }

    Builder buildGender(String gender) {
        this.gender = gender;
        return this;
    }

    User build() {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setSurname(surname);
        user.setActivated(activated);
        user.setLogin(login);
        user.setPassword(password);
        user.setActivated(activated);
        user.setGender(gender);
        return user;
    }
}
