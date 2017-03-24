package it.unibs.ing.fp.schildt.ch17JFC;
//listing 1
// Demonstrate ArrayList. 
import java.util.*; 
 
class Es1_ArrayListDemo { 
  public static void main(String args[]) { 
    // Create an array list. 
    List<String> al = new Vector<String>(); 
     
    System.out.println("Initial size of al: " + 
                       al.size()); 
 
    // Add elements to the array list. 
    al.add("C"); 
    al.add("A"); 
    al.add("E"); 
    al.add("B"); 
    al.add("D"); 
    al.add("F"); 
    al.add(1, "A2"); 
 
    System.out.println("Size of al after additions: " + 
                       al.size()); 
 
    // Display the array list. 
    System.out.println("Contents of al: " + al); 
 
    // Remove elements from the array list. 
    al.remove("F"); 
    al.remove(2); 
 
    System.out.println("Size of al after deletions: " + 
                       al.size()); 
    System.out.println("Contents of al: " + al); 
  } 
}