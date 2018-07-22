import java.util.*;
import java.io.*;


class MinMax{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array to check: ");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		//Checking begins here
		int maximum = findMax(arr,size);
		int minimum = findMin(arr,size);

		System.out.print("Minimum is "+minimum);
		System.out.println("Maximum is "+maximum);
	}	

	static int findMin(int arr[], int size){
		int min = arr[0];
		int i,j;
		for(i=0;i<size;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}

	static int findMax(int arr[], int size){
		int max = arr[0];
		int i,j;
		for(i=0;i<size;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
}