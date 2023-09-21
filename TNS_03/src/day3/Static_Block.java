package day3;

public class Static_Block {
    static
		{
		System.out.println("Static block is invoked first and then it goes to the main method");
		}
		static int calculateCube(int side)
		{
		return (side*side*side);
		}
		public static void main(String[] args) {
		System.out.println("Cube value of 5 is: "+Cube.calculateCube(5));
		}
}
