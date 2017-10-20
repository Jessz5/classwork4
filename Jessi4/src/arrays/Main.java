package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ObjectArrays oA = new ObjectArrays();
		Person s = new Person ("Ben","Nockles", Borough.NY_BOROUGHS[0]);
		int x = 10;
		int [] a = {5,6,7};
		test3(s,x,a);
		System.out.println(s+", "+x+", "+Arrays.toString(a));
	}
	
	/** DOESN"T CHANGE NAME
	 * 
	 * @param s
	 * @param x
	 * @param arr
	 */
	public static void test1(Person s, int x, int[] arr) {
		String name = s.getFirstName();
		name = "Ilona";
		x = 5;
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
	}
	
	/** DOES CHANGE NAME
	 * 
	 * @param s
	 * @param x
	 * @param arr
	 */
	/**
	 * PASS_BY_VALUE EXAMPLES
	 * THIS DOES CHANGE THE NAME
	 * THIS ALSO CHANGES THE ARRAY
	 * NO VOID METHOD CAN PERMANENTLY CHANGE AN INT
	 * (you can if you set it as a return type)
	 */
	public static void test3(Person s, int x, int[] arr) {
		s.setFirstName("Ilona");
		x = 5;
		//arr = new int[3]; AS LONG AS YOU DON"T MAKE A "NEW" ARRAY
		// THE REFERENCES THEMSELVES WILL CHANGE
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
	}
	
}
