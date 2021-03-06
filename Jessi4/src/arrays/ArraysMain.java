package arrays;

import java.util.Arrays;

public class ArraysMain {
	
	private String[] testArray;
	private int[] intRay;

	public ArraysMain() {
		//int[] consecTest1 = {1,2,3,6,7,8,9,10,11,45,46,47};
		//int[] consecTest2 = {10,11,12,13,14,15,6,7,8,9,10,11,45,46,47};
		int[] randomRolls = new int[1000];
		populate(randomRolls);
		
		//System.out.println("The longest sequence in the first test is " + longestConsecutiveSequence(consecTest1));
		//System.out.println("The longest sequence in the second test is " + longestConsecutiveSequence(consecTest2));
		//System.out.println("The longest sequence in the third test is " + longestConsecutiveSequence(randomRolls));
		//int[] result = longestConsecSeqAndPos(randomRolls);
		//System.out.println("The longest sequence of dice rolls is " + result[0] + " it happened on the " + (result[1]+1) + "th roll. Starting with a roll of "+randomRolls[result[1]]+".");
		
		//intRay = new int[100];
		//populate(intRay);
		//checkOccurences(intRay,3,18);
		//populate1ToN(intRay);
		//swap(intRay,0,1);
		//shuffle(intRay);
		//reverseOrder(intRay);
		//frontToBack(intRay);
		//Arrays is a Utility class  included in Java for formatting output
		//System.out.println(Arrays.toString(intRay));
	}
	
	public int countLessThan(int[] arr, int n) {
		int count = 0;
		for(int value: arr) {
			if(value < n)count++;
		}
		return count;
	}
	
	
	//private void reverseOrder(int[]arr) {
		//int[] newArr = new int[arr.length];
		//for(int i = 0; i < arr.length; i++) {
		//	newArr[i] = arr[arr.length - 1 -i];
		//}
		//return newArr;
	//}
	
	private void reverseOrder(int[]arr) {
		for(int i = 0; i < arr.length/2; i++) {
			swap(arr,i,arr.length - 1 - i);
		}
	}

	/**
	 * remove the element at index zero, push every other element up by one. 1 to 0, 2 to 1, etc...
	 * Put the element that was at zero at the end of arr
	 * @param arr
	 */
	public void frontToBack(int[] intRay) {
		int front = intRay[0];
		for(int i = 0; i < intRay.length - 1; i++) {
			swap(intRay, i, i+1);
		}
	}
	
	public void cycleThrough(int[] arr, int n) {
		for(int i = 0; i < n; i++) {
			frontToBack(arr);
		}
	}
	
	
	
	public int longestConsecutiveSequence(int[] arr) {
		int count = 0;
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
		  if(isConsecutive(arr,i)) {
			  count ++;
		  }
		  else {
			  if(temp < count) {
				  temp = count;
				  count = 1;
			  }
		  }
		}
		if(temp < count)
			temp = count;
		return count;
	}
	
	//public int[] longestConsecSeqAndPos(int[] arr) {
		//int[] output = new int[longestConsecutiveSequence(arr)];
		//for(int i = 0; i < longestConsecutiveSequence(arr); i++) {
		
		//return data;
//	}
	
	public boolean isConsecutive(int[] arr, int pos) {
		if(arr[pos+1] == arr[pos]+1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	private void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			swap(arr,(int)(Math.random()*arr.length), (int)(Math.random()*arr.length));
		}
	}

	private void swap(int[] arr, int i, int j) {
		int placeholder = arr[i];
			arr[i] = arr[j];
			arr[j] = placeholder;
	}

	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
	}

	private void checkOccurences(int[] arr, int start, int end) {
		int[] counter = new int[end-start+1];
		
		for(int value: arr) {
			counter[value-start]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println("A "+(start+i)+" was rolled "+counter[i]+" times.");
		}
	}

	private void populate(int[] intRay) {
		for(int i = 0; i < intRay.length; i++) {
			intRay[i] = diceRoll(3);
		}
		//This does not work:
		//for(int value: intRay) {
			//value = diceRoll(2);
		//}
	}
	
	public void notes() {
		//1. collection of primitives or objects
		//SPECIAL NOTE: This is the ONLY collection of primitives
				
		//2. size cannot be modified
				
		/*3. Elements of an array are REFERENCES to objects. 
		*In other words, changing an element of an array changes 
		*the REFERENCE, not the object(more on this later)
		*/
				
		//-----------------------------------------------------
				
		//There are two types of constructors, the first we've seen already:
		int[] firstType = {3,14,-9,10};
		//This constructor can only be used at the declaration. Error:
		//firstType = {12,13,14,15};
				
		//The 2nd type:
		testArray = new String[50];
		/*SPECIAL NOTE: for primitive arrays, when they are instantiated, 
		* they are automatically populated with 0s. This is not the case 
		* with Object arrays, which are populated with 'null'
		*/
				
		for(int i = 0; i < testArray.length; i++) {
			System.out.println("The #"+i+" item is:"+testArray[i]);
		}
				
		//for each loop (useful only when you don't need to keep track of an index
		for(String value:testArray) {
		//"for each int in testArray..."
		System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		ArraysMain arrayPractice = new ArraysMain();
		
	}
	
	/** Returns the result from rolling "numberOfDice" dice. **/
	
	public int diceRoll(int numberOfDice) {
		int roll = 0;
		
		for(int i = 0; i < numberOfDice; i++) {
			roll = roll + 1 +(int)(Math.random()*6);
		}
		return roll;
	}

}
