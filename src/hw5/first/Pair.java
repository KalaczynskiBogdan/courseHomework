package hw5.first;

public class Pair<T extends Comparable<T>> {
    public void max(T t1, T t2) {
        int result = t1.compareTo(t2);
        if (result > 0) {
            System.out.println(t1 + ">" + t2);
        } else if (result < 0) {
            System.out.println(t2 + ">" + t1);
        } else System.out.println(t1 + " = " + t2);
    }
}


