package day3;

public class ParameterizedConstructorConstructor {
    int number;//Instance variable
	 ParameterizedConstructorConstructor(int x) {
	        System.out.println("Parameterized Constructor Called");
	        x+=5;
	        number=x;
	    }
}
