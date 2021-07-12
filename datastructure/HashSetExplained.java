package datastructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetExplained {

    public static void main(String[] args) {
        
        //hashSet allows only unique values
        //we can add/remove elements from the hashset


        HashSet<String> set = new HashSet<>();

        //add element
        set.add("hey");
        set.add("hey");
        set.add("apple");

        System.out.println(set);

        //check if any item there in set ?

        if(set.contains("banana"))
        {
            System.out.println("Banana available");
        }
        else
        {
            System.out.println("banana not available");
        }

        //Remove element
        set.remove("hey");
        System.out.println(set);

        //add
        set.add("banana");
        set.add("Orange");
        set.add("lotus");

        //iterate in for loop
        System.out.println("Iterating elements in for loop -> ");
        for(String values: set)
        {
            System.out.println(values+" ");
        }

        //Sorting of set
        List<String> arrayListofSet = new ArrayList<String>(set);
        Collections.sort(arrayListofSet);
        System.out.println(arrayListofSet);


    }
    
}
