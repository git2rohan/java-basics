package datastructure;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExplain {
    
    //ArrayList is an advancement of Array
    //We can add/update/delete items from the ArrayList
    //This is from java.util package
    //How does it works ? -> A new array gets created once any item added/updated/removed and the old array gets removed
    //It implements List interface

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        //Add items in arraylist, new items added at the last
        arrayList.add("Rohan");
        arrayList.add("Shweta");
        arrayList.add("Mayank");

        //Add items based on index number
        arrayList.add(3, "Maa");
        arrayList.add(4, "Papa");

        //get element based on index number
        System.out.println(arrayList.get(1));

        //update existing element
        arrayList.set(0, "New Rohan");
        System.out.println("Element updated - "+arrayList.get(0));

        //remove element - based on index number
        //It removes element and then all the elements gets shifted and maintains contegious index number
        arrayList.remove(0);
        System.out.println(arrayList.get(0));

        //remove all the elements -
        arrayList.clear();
        System.out.println(arrayList);

        //print size of the element
        System.out.println(arrayList.size());

        //add elements using for loop
        System.out.println("Add array using for loop");
        for(int i=0; i<=10; i++)
        {
            arrayList.add(""+i+"");
        }

        //traverse through array using foreach 
        System.out.println("Print array using for each loop");
        for (String string : arrayList) {
            System.out.println(string);
        }

        //traverse using for loop using size()
        System.out.println("Print array using size() for loop");
        for(int i=0; i<arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
        
        //Sort array
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        arrayListInt.add(2);
        arrayListInt.add(1);
        arrayListInt.add(0);
        arrayListInt.add(5);
        arrayListInt.add(4);

        Collections.sort(arrayListInt);
        System.out.println("Integer Sort- "+arrayListInt); //Integer sorts based on integer

        //sorting previous array ( string )
        Collections.sort(arrayList);
        System.out.println("String Sort - "+arrayList); //String sorts based on the 1st char in the element
       

    }
}
