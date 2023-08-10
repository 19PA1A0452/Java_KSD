import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveFirstandLastOccurence {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(8);

        int elementToRemove = 7;

        System.out.println("Original LinkedList: " + linkedList);

        removeFirstOccurrence(linkedList, elementToRemove);
        System.out.println("LinkedList after removing first occurrence of " + elementToRemove + ": " + linkedList);

        removeLastOccurrence(linkedList, elementToRemove);
        System.out.println("LinkedList after removing last occurrence of " + elementToRemove + ": " + linkedList);
    }

    public static void removeFirstOccurrence(LinkedList<Integer> list, int element) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                iterator.remove();
                break;
            }
        }
    }

    public static void removeLastOccurrence(LinkedList<Integer> list, int element) {
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            if (iterator.previous() == element) {
                iterator.remove();
                break;
            }
        }
    }
}

