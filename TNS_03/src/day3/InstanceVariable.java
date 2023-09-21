package day3;

class Student{
    int id;  // instance variables
    String name; // instance variables
}

public class InstanceVariable {
	public static void main(String[] args) {
        Student object1 = new Student(); //object creation
object1.id = 1; //instance variable used
object1.name = "Srikanth";//instance variable used

     Student obj2;
 obj2 = new Student();
      obj2.id = 2;
      obj2.name = "Simple Snippets";
      System.out.println("Here the instance variable used to assign id "+object1.id);
      System.out.println("Here the instance variable used to assign name "+object1.name);
      System.out.println("Here the instance variable used to assign id second time "+obj2.id);
      System.out.println("Here the instance variable used to assign name second time "+obj2.name);     
  } 
}