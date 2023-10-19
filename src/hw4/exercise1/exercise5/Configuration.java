package hw4.exercise1.exercise5;

public class Configuration {
    public static String url;
    public static String name;
    public static String password;
    static {
        url = "http://www.bohdanurl.com";
        name = "Bohdan";
        password = "123454321";
    }

    public static String getUrl() {
        return url;
    }

    public static String getName() {
        return name;
    }

    public static String getPassword() {
        return password;
    }
}
