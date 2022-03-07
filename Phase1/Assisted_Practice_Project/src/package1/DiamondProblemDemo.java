package package1;

interface First 
{ 
 default void show() 
 { 
 System.out.println("Default First"); 
 } 
} 
interface Second 
{ 
 default void show() 
 { 
 System.out.println("Default Second"); 
 } 
} 
public class DiamondProblemDemo implements First, Second 
{ 
 public void show() 
 { 
 First.super.show(); 
 Second.super.show(); 
 } 
 public static void main(String args[]) 
 { 
 DiamondProblemDemo ob = new DiamondProblemDemo(); 
 ob.show(); 
 } 
}

