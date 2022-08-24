package src.Collections.List;

import java.util.*;
import java.util.LinkedList;

class comparableInterface {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add(78);
        //Traversing the list of elements in reverse order
        Iterator itr=ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    



}
