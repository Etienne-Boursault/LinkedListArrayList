import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Almost no differences between ArrayList and LinkedList for small Lists
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Etienne");
        namesLinkedList.add("Elise");
        namesLinkedList.add("Jacques");
        namesLinkedList.add("Lol");
        // It has to go through every elements
        System.out.println(namesLinkedList.get(2));
        // Fast addition
        namesLinkedList.add(1, "Jerry");

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Etienne");
        namesArrayList.add("Elise");
        namesArrayList.add("Jacques");
        // It takes the same amount of time to get access to any element
        System.out.println(namesArrayList.get(2));
        // Slow addition
        namesArrayList.add(1, "Jerry");

    }
}
