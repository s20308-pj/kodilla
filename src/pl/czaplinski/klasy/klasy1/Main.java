package pl.czaplinski.klasy.klasy1;

class User {
    private String name;
    private double age;
    private double height;

    public User() {
    }

    public User(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}

class UserValidator {

    private boolean isEmptyName(User user) {
        return user.getName() != null;
    }

    private String isAgeHigherThanThirty(User user) {
        if (user.getAge() > 30) {
            return "User is older than 30";
        } else {
            return "User is younger than 30";
        }
    }

    private String isHeightHigherThanHundredSixty(User user) {
        if (user.getHeight() > 160) {
            return "higher then 160cm";
        } else {
            return "lower then 160cm";
        }
    }
    public void validateUser(User user){
        if (isEmptyName(user)) {
            System.out.println(isAgeHigherThanThirty(user)
                    + " and "
                    + isHeightHigherThanHundredSixty(user));
        }
    }

}

public class Main {
    public static void main(String[] args) {
        User user = new User("Adam", 40.5, 178);
        UserValidator userValidator = new UserValidator();

        userValidator.validateUser(user);
    }
}