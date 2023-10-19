package hw5.second;

public class M {
    public static void main(String[] args) {
        Test<Integer> test = new Test<>();
        Integer[] array = {1, 2, 3, 4, 5, 5, 2, 3};
        System.out.println("Count of uniq elements: " + test.abc(array));
    }
}
