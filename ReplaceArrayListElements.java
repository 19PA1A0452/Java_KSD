import java.util.ArrayList;
import java.util.List;

public class ReplaceArrayListElements {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Fig");
        
        System.out.println("Original ArrayList: " + arrayList);
        
        // Element to be replaced
        String oldElement = "Banana";
        
        // Element to replace with
        String newElement = "Grapes";
        
        // Find the index of the element to be replaced
        int index = arrayList.indexOf(oldElement);
        
        if (index != -1) {
            // Replace the element at the specified index
            arrayList.set(index, newElement);
            
            System.out.println("ArrayList after replacing '" + oldElement + "' with '" + newElement + "': " + arrayList);
        } else {
            System.out.println("Element '" + oldElement + "' not found in the ArrayList.");
        }
    }
}

