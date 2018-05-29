/*
 * Created on Aug 3, 2005
 * 
 * CS 2080
 * Ha Cao - Shanonhaliwell
 * BinarySearch.java
 * 
 * 
 */


import java.io.*;
import java.util.*;


public class BinarySearch {
    
    // --------------------------------------------------------------------
    // Returns a boolean value whether x is present in array arr[.....]
    // Returns index of x if it is present in arr[l..r], else return -1
    // Recursively uses binary search to find the "key" entry in the input array
    // Note: Assumes that the input array is in sorted order. 
    public static boolean binarySearch (int[] arr, int low, int high, int x) {

        System.out.println("Searching in the range: " + low + " " + high);
        int mid = low + (high - low) / 2;
        System.out.println("The middle index value: " + arr[mid]);
        boolean result = false;

        if (high >= low) {
            if (arr.length == 1) {
                if (x == arr[low])
                    result = true;
            }
            else
                mid = low + (high - low) / 2;
                if (arr[mid] == x) {
                    result = true;
                    // return true;
                }
                else if (x < arr[mid]) 
                    result = binarySearch(arr, low, mid-1 , x);
                    // return binarySearch(input, low, mid-1, key);
                else
                    result = binarySearch(arr, mid+1, high, x);
                    // return binarySeach(input, mid+1, high, key);
        }
        return result;
    }
    
    // ----------------------------------------------------------------------------
    // Starter method for exercising the binary search resursive method
    public static void main (String[] args) {
        
        int[] arr = {2, 4, 5, 12, 15, 19, 23, 36, 119, 210, 345, 515, 1004};
        System.out.println("Array entries: ");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("\n\nEnter a number to search for: ");
        //String s = scan.next();
        //int goal = Integer.parseInt(s);
        int key = scan.nextInt();
        System.out.println();

        boolean inArray = binarySearch(arr, 0, arr.length-1, key);
        
        System.out.println("\nWas the entry found: "+inArray);
    }
}


            
// public int binarySearch(int arr[], int l, int r, int x)
//     {
//         if (r>=l)
//         {
//             int mid = l + (r - l)/2;
//  
//             // If the element is present at the 
//             // middle itself
//             if (arr[mid] == x)
//                return mid;
//  
//             // If element is smaller than mid, then 
//             // it can only be present in left subarray
//             if (arr[mid] > x)
//                return binarySearch(arr, l, mid-1, x);
//  
//             // Else the element can only be present
//             // in right subarray
//             return binarySearch(arr, mid+1, r, x);
//         }
//  
//         // We reach here when element is not present
//         //  in array
//         return -1;
//     }
//  
//     // Driver method to test above
//     public static void main(String args[])
//     {
//         BinarySearch ob = new BinarySearch();
//         int arr[] = {2, 12, 15, 119, 210, 345, 515, 1004};
//         int n = arr.length;
//         int key = 119;
//         int result = ob.binarySearch(arr,0,n-1,key);
//         if (result == -1)
//             System.out.println("Element not present");
//         else
//             System.out.println("Element found at index " + result);
//     }
// }


// public class BinarySearch1 {
//     
//     //--------------------------------------------------------------------------------
//     // Starter method for exercising the binary search recursive method
//     public static void main(String[] args) {
//         int[] input = {2, 4, 5, 12, 19, 23, 36, 44, 77, 81, 101, 156};
//     
//         
//         System.out.println("Array entries: ");
//         for(int i=0; i<input.length; i++)
//             System.out.print(input[i]+" ");
//         
//         Scanner scan = new Scanner(System.in); 
//         System.out.print("\n\nEnter a number to search for: ");
//         //String s = scan.next();
//         //int goal = Integer.parseInt(s);
//         int goal = scan.nextInt();
//         System.out.println();
// 
//         boolean inArray = binarySearch(input, 0, input.length, goal);
//         
//         System.out.println("\nWas the entry found: "+inArray);
//     }
// 
//     
//     //--------------------------------------------------------------------------------
//     // recursively uses binary search to find the "goal" entry in the "input" array
//     // NOTE: Assumes that the input array is in sorted order.
//     public static boolean binarySearch(int[] input, int startIndex, int endIndex, int goal){
//         
//         System.out.println("Searching in the range: "+startIndex+" "+(endIndex-1));
//         
//         if(startIndex > endIndex)
//             return false;
//         
//         int middle = startIndex + (endIndex - startIndex)/2;
//         System.out.println(input[middle]);
//         
//         if(input[middle] == goal)
//             return true;
//         else if(input[middle] < goal)
//             return binarySearch(input, middle+1, endIndex, goal);
//         else
//             return binarySearch(input, startIndex, middle-1, goal);
//     }
// }

