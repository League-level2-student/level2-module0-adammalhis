package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static Random bob= new Random();
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] one= new String[5];
		//2. print the third element in the array
		System.out.println(one[2]);
		//3. set the third element to a different value
		one[2]= "hi";
		//4. print the third element again
		System.out.println(one[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0; i<5; i++) {
			System.out.println(one[i]);
			
		}
		
		//6. make an array of 50 integers
		int[] intarrager= new int[50];
		//7. use a for loop to make every value of the integer array a random number
		
		for (int i=0; i<intarrager.length; i++) {
			
			intarrager[i]= bob.nextInt(1000000);
			
			
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber= Integer.MAX_VALUE;
		int largestNumber= Integer.MIN_VALUE;
		
		for (int i=0; i<intarrager.length; i++) {
			if (intarrager[i]<smallestNumber) {
				smallestNumber= intarrager[i];
				
			}
			
		}
		System.out.println("smallest number: " + smallestNumber); 
		//9 print the entire array to see if step 8 was correct
		for (int i=0; i<intarrager.length; i++) {
			if (intarrager[i]>largestNumber) {
				largestNumber= intarrager[i];
			}
			
		}
		System.out.println("largest number: " + largestNumber);
		for (int i=0; i<intarrager.length; i++) {
			System.out.println(intarrager[i]);
		}
		//10. print the largest number in the array.
		
	}
}
