package hw5.third;

public class Main {
    public static void main(String[] args) {
        Search<String> stringSearch = new Search<>(new String[]{"hello", "hi", "s"});
        stringSearch.find("s");
        stringSearch.isMax("hi");
    }
}
