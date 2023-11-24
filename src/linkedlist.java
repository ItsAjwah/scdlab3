import java.util.LinkedList;

public class linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();


        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);


        linkedList.addLast(4);
        linkedList.addLast(5);


        System.out.println("Linked List: " + linkedList);


        linkedList.remove(Integer.valueOf(3));

        System.out.println("Linked List after deleting 3: " + linkedList);


        boolean check2 = linkedList.contains(2);
        boolean check6 = linkedList.contains(6);

        System.out.println("Linked list has 2: " + check2);
        System.out.println("Linked list has 6: "+ check6);
    }
}
