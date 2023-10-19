package hw4.exercise1.exercise5;

public class Main {
    public static void main(String[] args) {
        String userUrl = Configuration.getUrl();
        String userName = Configuration.getName();
        String userPassword = Configuration.getPassword();

        System.out.println("Name: " + userName + ", password: "+ userPassword+
                ", url: " + userUrl);
    }
}
