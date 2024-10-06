package Java.linkedList;
import java.util.LinkedList;

public class LinkedListFromLibrary {

    public static void main(String args[]){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

    }
    
}
