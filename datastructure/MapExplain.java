package datastructure;

import java.util.HashMap;

public class MapExplain {
    public static void main(String[] args) {

        //Map stores values in key/value formate
        //key and value's datatype can be different
        
        HashMap<String, String> capitalCities = new HashMap<>();

        //add elements inside map
        capitalCities.put("England", "London");
        capitalCities.put("India", "Delhi");
        capitalCities.put("Nepal", "Kathmandu");
        capitalCities.put("USA", "WDC");

        //pprint all elements
        System.out.println("Get all - "+capitalCities);

        //fetch value from map
        System.out.println("Get India's value - "+capitalCities.get("India"));

        //Update Nepal value
        capitalCities.put("Nepal", "New Cap");
        System.out.println("Updated - "+capitalCities);

        //let's use for Loop
            //KeySet() returns set of all the keys inside the MAP
            for (String string : capitalCities.keySet()) {

                System.out.println(string);
                
            }
            
            //values() - Returns all the values
            for (String string : capitalCities.values()) {
                
                System.out.println(string);
            }

            //Fetch both keys and values
            for (String key : capitalCities.keySet()) {

                System.out.println(key + " -> " + capitalCities.get(key));
                
            }
        
        //print size
        System.out.println("Size - "+ capitalCities.size());

        //Traverse using for loop
        for(int i=0; i<capitalCities.size(); i++ )
        {
            System.out.println("values -> "+capitalCities.get(capitalCities.keySet().toArray()[i]));
        }

    }
    
}
