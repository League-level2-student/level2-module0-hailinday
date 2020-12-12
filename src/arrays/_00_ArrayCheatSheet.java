package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		
		
		String [] arr = new String [5];
		arr[0] = "zero";
		arr[1] = "Earth";
		arr[2] = "Sun";
		arr[3] = "pop";
		arr[4] = "four";
		//    0      1       2
		// ["Sun","Water","Earth"]
		
	
		
		
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "Water";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int [] arr1 = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i <= 49; i++) {
			Random r = new Random();
			arr1[i] = r.nextInt();
		}
		//8. without printing the entire array, print only the smallest number in the array
		int min = arr1[0];
		for (int i = 0; i <= 49; i++) {
			if (arr1[i]<min) {
				min = arr1[i];
			}
		}
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i <= 49; i++) {
			System.out.println(arr1[i]);
		}
		//10. print the largest number in the array.
		int max = arr1[0];
		for (int i = 0; i <= 49; i++) {
			if (arr1[i]>max) {
				max = arr1[i];
			}
		}
	}
}
