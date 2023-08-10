import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate elements
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueSet = new HashSet<>(numbers);

        // Clear the original ArrayList
        numbers.clear();

        // Add the unique elements back to the ArrayList
        numbers.addAll(uniqueSet);

        System.out.println("ArrayList after removing duplicates: " + numbers);
    }
}
