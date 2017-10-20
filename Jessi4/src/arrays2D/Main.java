package arrays2D;

public class Main {

	public static void main(String[]) {
		
	}
	/**
	 * increases the element in arr at index psn
	 * and decreases the elements at psn -1 and psn +1
	 * if they exist. PRECONDITION: arr[psn] exists
	 * 
	 * THIS idea is another majort topic in ap csa
	 * idea of avoiding an ArrayIndexOutOfBoundsException
	 * 
	 * @param arr
	 * @param psn
	 */
	public static void changeNeighbors(int[] arr, int psn) {
		for( int i = 0; i < arr.length; i++) {
			arr[psn] = arr[psn] + 1;
			if(psn == 0) {
				
			}
		}
	}
}
