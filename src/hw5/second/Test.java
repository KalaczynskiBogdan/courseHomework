package hw5.second;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test<T> {
    public int abc(T[] t) {
        Set<T> set = new HashSet<>(List.of(t));
        return set.size();
    }
}
