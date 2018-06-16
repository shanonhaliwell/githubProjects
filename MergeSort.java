import java.util.*;
import java.util.ArrayList;

public class MergeSort {

    public static void sort() {
        int []tempArray = new int[a.length];
        mergeSort(tempArray, 0, a.length-1);
    }
	
    public static void mergeSort(int[] tempArray, int lowerIndex, int upperIndex) {
        if(lowerIndex == upperIndex) {
            return;
        }
        else {
            int mid = ( lowerIndex + upperIndex) / 2;
            mergeSort(tempArray, lowerIndex, mid);
            mergeSort(tempArray, mid + 1, upperIndex);
	    merge(tempArray, lowerIndex, mid + 1, upperIndex);
        }
    }
	
    public static void merge(int[] tempArray, int lowerIndexCursor, int higerIndex, int upperIndex) {
        int tempIndex = 0;
	int lowerIndex = lowerIndexCursor;
	int midIndex = higerIndex - 1;
        int totalItems = upperIndex - lowerIndex + 1;
        while(lowerIndex <= midIndex && higerIndex <= upperIndex) {
            if(a[lowerIndex] < a[higerIndex]) {
                tempArray[tempIndex++] = a[lowerIndex++];
            }
            else {
                tempArray[tempIndex++] = a[higerIndex++];
            }
        }
        
        while(lowerIndex <= midIndex) {
            tempArray[tempIndex++] = a[lowerIndex++];
        }
        
        while(higerIndex <= upperIndex) {
            tempArray[tempIndex++] = a[higerIndex++];
        }
        
        for(int i = 0; i < totalItems; i++) {
            a[lowerIndexCursor + i] = tempArray[i];
        }
    }

    
    public static void printArray(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }
    }
    
    public static int[] getArray() {
        int size=10;
        int []array = new int[size];
	int item = 0;
	for(int i=0; i<size; i++) {
            item = (int)(Math.random()*1000); 
            array[i] = item;
        }
        return array;
    }
    
    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }


    private static int[] a;
    public static void main (String[] args) {
        a = getArray();
        printArray(a);
        sort();
        System.out.println();
        printArray(a);
        System.out.println();
	System.out.println("Chech whether or not the given array is sorted: " + isSorted(a));
    }

}


// public class MergeSort
// {
//     // Merges two subarrays of arr[].
//     // First subarray is arr[l..m]
//     // Second subarray is arr[m+1..r]
//     void merge(int arr[], int f, int m, int r)
//     {
//         // Find sizes of two subarrays to be merged
//         int n1 = m - f + 1;
//         int n2 = r - m;
//  
//         /* Create temp arrays */
//         int L[] = new int [n1];
//         int R[] = new int [n2];
//  
//         /*Copy data to temp arrays L[] and R[]*/
//         for (int i = 0; i < n1; ++i)
//             L[i] = arr[f + i];
//         for (int j = 0; j < n2; ++j)
//             R[j] = arr[m + 1+ j];
//  
//  
//         /* Merge the temp arrays back into arr[f...r]*/
//  
//         // Initial indexes of first and second subarrays
//         int i = 0, j = 0;
//  
//         // Initial index of merged subarry array
//         int k = l;
//         while (i < n1 && j < n2)
//         {
//             if (L[i] <= R[j])
//             {
//                 arr[k] = L[i];
//                 i++;
//             }
//             else
//             {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }
//  
//         /* Copy remaining elements of L[] if any */
//         while (i < n1)
//         {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }
//  
//         /* Copy remaining elements of R[] if any */
//         while (j < n2)
//         {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }
//  
//     // Main function that sorts arr[l..r] using
//     // merge()
//     void sort(int arr[], int start, int end)
//     {
//         if (start < end)
//         {
//             // Find the middle point
//             int mid = start + (start - end) / 2;
//  
//             // Sort first and second halves
//             sort(arr, start, end);
//             sort(arr , start + 1, end);
//  
//             // Merge the sorted halves
//             merge(arr, start, mid, end);
//         }
//     }
//  
//     /* A utility function to print array of size n */
//     static void printArray(int arr[])
//     {
//         int n = arr.length;
//         for (int i=0; i<n; ++i)
//             System.out.print(arr[i] + " ");
//         System.out.println();
//     }
//  
//     // Driver method
//     public static void main(String args[])
//     {
//         int arr[] = {12, 11, 13, 5, 6, 7};
//  
//         System.out.println("Given Array");
//         printArray(arr);
//  
//         MergeSort ob = new MergeSort();
//         ob.sort(arr, 0, arr.length-1);
//  
//         System.out.println("\nSorted array");
//         printArray(arr);
//     }
// }



// public class MergerSort {
//     
//     public static void mergeSort(Comparable [ ] a)
//     {
//         Comparable[] tmp = new Comparable[a.length];
//         mergeSort(a, tmp,  0,  a.length - 1);
//     }
//     
//     private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right) {
//     	
//         if( left < right ) {
//             int center = (left + right) / 2;
//             mergeSort(a, tmp, left, center);
// 	    mergeSort(a, tmp, center + 1, right);
// 	    merge(a, tmp, left, center + 1, right);
//         }
//     }
// 
// 
//     private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
//     {
//         int leftEnd = right - 1;
//         int k = left;
//         int num = rightEnd - left + 1;
// 
//         while(left <= leftEnd && right <= rightEnd) {
//             if(a[left].compareTo(a[right]) <= 0)
//                 tmp[k++] = a[left++];
//             else
//                 tmp[k++] = a[right++];
//         }
//             
//         while(left <= leftEnd)    // Copy rest of first half
//             tmp[k++] = a[left++];
// 
//         while(right <= rightEnd)  // Copy rest of right half
//             tmp[k++] = a[right++];
// 
//         // Copy tmp back
//         for(int i = 0; i < num; i++, rightEnd--)
//             a[rightEnd] = tmp[rightEnd];
//     }
//     
//     public static void main(String[] args)
//     {
//         Integer[] a = {2, 6, 3, 5, 1};
//         mergeSort(a);
//         System.out.println(Arrays.toString(a));
//     }
// }


// public class MergeSort {
// 	private static Scanner sc;
// 
// 	public static void main(String args[]) {
// 		sc = new Scanner(System.in);
// 
// 		System.out.println("Enter no of terms");
// 		int n = sc.nextInt();
// 
// 		System.out.println("Enter the terms");
// 		int arr[] = new int[n];
// 		for (int i = 0; i < n; i++)
// 			arr[i] = sc.nextInt();
// 
// 		System.out.println("The unsorted array is:");
// 		System.out.println(Arrays.toString(arr));
// 
// 		mergesort(arr);
// 
// 		System.out.println("The sorted array is:");
// 		System.out.println(Arrays.toString(arr));
// 	}
// 
// 	public static void mergesort(int arr[]) {
// 		int n = arr.length;
// 		if (n < 2)
// 			return;
// 		int mid = n / 2;
// 		int left[] = new int[mid];
// 		int right[] = new int[n - mid];
// 		for (int i = 0; i < mid; i++)
// 			left[i] = arr[i];
// 		for (int i = mid; i < n; i++)
// 			right[i - mid] = arr[i];
// 		mergesort(left);
// 		mergesort(right);
// 		merge(arr, left, right);
// 	}
// 
// 	public static void merge(int arr[], int left[], int right[]) {
// 		int nL = left.length;
// 		int nR = right.length;
// 		int i = 0, j = 0, k = 0;
// 		while (i < nL && j < nR) {
// 			if (left[i] <= right[j]) {
// 				arr[k] = left[i];
// 				i++;
// 			} else {
// 				arr[k] = right[i];
// 				j++;
// 			}
// 			k++;
// 		}
// 		while (i < nL) {
// 			arr[k] = left[i];
// 			i++;
// 			k++;
// 		}
// 		while (j < nR) {
// 			arr[k] = right[j];
// 			j++;
// 			k++;
// 		}
// 	}
// }


// public class MergeSort {
//  
//     private ArrayList<String> strList;
//  
//     // Constructor
//     public MergeSort(ArrayList<String> input) {
//         strList = input;
//     }
//      
//     public void sort() {
//         strList = mergeSort(strList);
//     }
//  
//     public ArrayList<String> mergeSort(ArrayList<String> whole) {
//         ArrayList<String> left = new ArrayList<String>();
//         ArrayList<String> right = new ArrayList<String>();
//         int center;
//  
//         if (whole.size() == 1) {    
//             return whole;
//         } else {
//             center = whole.size()/2;
//             // copy the left half of whole into the left.
//             for (int i=0; i<center; i++) {
//                     left.add(whole.get(i));
//             }
//  
//             //copy the right half of whole into the new arraylist.
//             for (int i=center; i<whole.size(); i++) {
//                     right.add(whole.get(i));
//             }
//  
//             // Sort the left and right halves of the arraylist.
//             left  = mergeSort(left);
//             right = mergeSort(right);
//  
//             // Merge the results back together.
//             merge(left, right, whole);
//         }
//         return whole;
//     }
//  
//     private void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> whole) {
//         int leftIndex = 0;
//         int rightIndex = 0;
//         int wholeIndex = 0;
//  
//         // As long as neither the left nor the right ArrayList has
//         // been used up, keep taking the smaller of left.get(leftIndex)
//         // or right.get(rightIndex) and adding it at both.get(bothIndex).
//         while (leftIndex < left.size() && rightIndex < right.size()) {
//             if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
//                 whole.set(wholeIndex, left.get(leftIndex));
//                 leftIndex++;
//             } else {
//                 whole.set(wholeIndex, right.get(rightIndex));
//                 rightIndex++;
//             }
//             wholeIndex++;
//         }
//  
//         ArrayList<String> rest;
//         int restIndex;
//         if (leftIndex >= left.size()) {
//             // The left ArrayList has been use up...
//             rest = right;
//             restIndex = rightIndex;
//         } else {
//             // The right ArrayList has been used up...
//             rest = left;
//             restIndex = leftIndex;
//         }
//  
//         // Copy the rest of whichever ArrayList (left or right) was not used up.
//         for (int i=restIndex; i<rest.size(); i++) {
//             whole.set(wholeIndex, rest.get(i));
//             wholeIndex++;
//         }
//     }
//  
//     public void show() {
//         System.out.println("Sorted:");
//         for (int i=0; i< strList.size();i++) {
//             System.out.println(strList.get(i));
//         }
//     }
//  
//     public static void main(String[] args) {
//         ArrayList<String> input = new ArrayList<String>();
//         Scanner sc = new Scanner(System.in);
//  
//         System.out.println("Enter your text, type done for exit:");
//         String strin = sc.nextLine();
//  
//         while(!strin.equals("done")) {
//             input.add(strin);
//             strin = sc.nextLine();
//         }
//         System.out.println("************************");
//         MergeSort test = new MergeSort(input);
//         test.sort();
//         test.show();
//     }
// }

