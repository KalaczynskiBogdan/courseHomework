package hw5.third;

public class Search<T extends Comparable<T>> {
    private T[] array;

    public Search(T[] array) {
        this.array = array;
    }

    public void find(T t) {
        for (T element : array) {
            if (element.equals(t)) {
                System.out.println("We have this element");
                return;
            }
        }
        System.out.println("We don't have this element");
    }

    public void isMax(T t) {
        for (T element : array) {
            int result = t.compareTo(element);
            if (result > 0) {
                System.out.println(element + ">" + t);
            } else if (result < 0) {
                System.out.println(t + ">" + element);
            } else System.out.println(t + " = " + element);
        }
    }
}
