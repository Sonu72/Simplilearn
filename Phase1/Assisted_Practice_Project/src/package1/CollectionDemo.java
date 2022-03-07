package package1;

import java.util.*;
public class CollectionDemo
  {
public static void main(String[] args) 
    {
	  //creating array-list
      System.out.println("ArrayList");
      ArrayList<String> city=new ArrayList<String>(); 
      city.add("Patna");//
      city.add("Ranchi"); 
      System.out.println(city); 
      
      //creating vector
      System.out.println("\n");
      System.out.println("Vector");
      Vector<Integer> vec = new Vector();
      vec.addElement(150); 
      vec.addElement(301); 
      System.out.println(vec);
      
      //creating linked-list
      System.out.println("\n");
      System.out.println("LinkedList");
      LinkedList<String> names=new LinkedList<String>(); 
      names.add("Ankit"); 
      names.add("Jinny"); 
      
      Iterator<String> itr=names.iterator(); 
      while(itr.hasNext()){ 
      System.out.println(itr.next()); 
 
      //creating hash-set
      System.out.println("\n");
      System.out.println("HashSet");
      HashSet<Integer> set=new HashSet<Integer>(); 
      set.add(108); 
      set.add(103); 
      set.add(102);
      set.add(104);
      System.out.println(set);
 
      //creating linked-hash-set
      System.out.println("\n");
      System.out.println("LinkedHashSet");
      LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>(); 
      set2.add(11); 
      set2.add(13); 
      set2.add(12);
      set2.add(14); 
      System.out.println(set2);
      } 
   } 
}
