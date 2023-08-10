import java.util.LinkedList;

public class LinkedListMerge{
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        // Add elements to the first list
        list1.add("A");
        list1.add("B");
        list1.add("C");

        // Add elements to the second list
        list2.add("X");
        list2.add("Y");
        list2.add("Z");

        // Specify the index where to insert the second list into the first list
        int indexToInsert = 1;

        // Add elements of list2 to list1 at the specified index
        for (String element : list2) {
            list1.add(indexToInsert++, element);
        }

        // Display the merged list
        System.out.println("Merged LinkedList:");
        for (String element : list1) {
            System.out.println(element);
        }
    }
}
