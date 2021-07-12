package datastructure;

import java.util.LinkedList;

public class LinkedListExample {
    
    public static void main(String[] args) {
        /*
        The LinkedList stores its items in "containers." The list has a link to the first container and each container has a 
        link to the next container in the list. To add an element to the list, 
        the element is placed into a new container and that container is linked to one of the other containers in the list.
        */
        //These containers are called as Nodes.
        //So nodes contains data and address of the next node
        //1st Node is head
        //last node is data + null ( address )
        //Linkedlist is same as arraylist but they have been build differently
        //LinkedList does not store data into contigious location, ( randome allocation )
        //Slower than array


        LinkedList<String> list = new LinkedList<>();
        list.add(0, "1st Element");
        list.add(1, "2nd Element");
        System.out.println(list);
        //Get element
        System.out.println("Get element - "+list.get(1));

        //update element
        list.set(1, "New 2nd element");
        System.out.println(list.get(1));

        //Use for each loop
        System.out.println("for each - ");
        for(String value : list)
        {
            System.out.println(value);
        }

        //find size
        System.out.println("Current size - "+list.size());

        //remove element, remove element at index 1
        list.remove(1);

        //find size
        System.out.println("Current size (after remove) - "+list.size());
    }
}
