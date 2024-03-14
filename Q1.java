import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5,100,-1, 2, 8, 1, 9, 3, 6, 4, 7);

        Set<Integer> sortedSet = new TreeSet<>(integerList);

        System.out.println("Sorted List of Integers:");
        for (Integer num : sortedSet) {
            System.out.print(num+" ");
        }
    }
}
