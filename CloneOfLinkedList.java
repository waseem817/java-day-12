import java.util.*;

class CloneOfLinkedList {
    public static void main(String args[]) {
        LinkedList<Integer> originalList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the linked list:");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " integers to add to the linked list:");
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            originalList.addFirst(element); // Adds elements to the front of the list
        }
        LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();
        System.out.println("Original LinkedList: " + originalList);
        System.out.println("Cloned LinkedList: " + clonedList);
    }
}