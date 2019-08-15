import java.util.*;
import java.io.*;

class TimeOfExecution{
	public static void main(String[] args){
		long startTime = getStartTime();
        ArrayList<Integer> arrlist = new ArrayList<>();
        int i = 0;
        Scanner fileInput;
        File file = new File("input_timeOfExecution.txt");
        try 
        {
            fileInput = new Scanner(file);
            while (fileInput.hasNext()) {
                arrlist.add(i++,fileInput.nextInt()) ;
            }
            fileInput.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.print("\nOriginal Array: "+arrlist+"\n");
        int[] arr = new int[arrlist.size()];
        int m=0;
        for(int j = 0; j<arrlist.size(); j++){
            int element = (Integer)arrlist.get(j);
            arr[m] = element;
            m++;
        }
        int n = arr.length;
       	sort(arr, 0, n-1);
       	long endTime = getEndTime();
        System.out.print("\nSorted Array: ");
        printArray(arr);
        System.out.print("\n");
		long diff = endTime - startTime;
		System.out.print("Time of Execution: "+diff+" ms."+"\n");
	}
 	static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	static long getEndTime(){
		return System.currentTimeMillis();
	}
	static long getStartTime(){
		return System.currentTimeMillis();
	} 
}