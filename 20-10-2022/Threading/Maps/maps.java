package Pack3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {
   public static void main(String args[]) {
     
	   //insertion the data
      Map<String, String> map = new HashMap<String, String>();
      map.put("Aditya", "20");
      map.put("Ayush", "21");
      map.put("Ram", "22");
      map.put("Anuj", "23");
      map.put("Sahil", "24");

      Map<String, String> map1 = new LinkedHashMap<String, String>();
      map1.put("Aditya", "20");
      map1.put("Ayush", "21");
      map1.put("Ram", "22");
      map1.put("Anuj", "23");
      map1.put("Sahil", "24");

      //Updating the previous data
      Map<String, String> map2 = new TreeMap<String, String>();
      map2.put("Raju", "66");
      map2.put("Soham", "21");
      map2.put("Devil", "42");
      map2.put("Roni", "27");
      map2.put("Rocky", "35");
      System.out.println("HashMap:" + map);
      System.out.println("LinkedHashMap:" + map);
      System.out.println("TreeMap:-" + map2);
      System.out.println(" ");
     
      //Delete the previous data
      map.put("Devil", "20"); 
      map1.put("Raju", "21");
      map2.put("Three", "6");
      System.out.println("HashMap:" + map);
      System.out.println("LinkedHashMap:" + map);
      System.out.println("TreeMap:-" + map2);
      System.out.println(" ");
     
      map.remove("Aditya","20");
      map1.remove("Shail","24");
      map2.remove("Rocky","35");
      System.out.println("HashMap:" + map);
      System.out.println("LinkedHashMap:" + map);
      System.out.println("TreeMap:-" + map2);
   }
}