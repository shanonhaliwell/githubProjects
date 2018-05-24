import java.io.*;
import java.util.*;

public class sortingArray {

	
    public static void main(String[] args) {
    int[] yourArray = {20, 10, 30, 60, 55};
    System.out.println(Arrays.toString(yourArray));
    for  (int i = 0; i < yourArray.length; i++) {
	for (int j = 0; j < yourArray.length - 1; j++) {
            // swap
            if (yourArray[i] < yourArray[j]) {   // if element at i is smaller than element at j
                int temp = yourArray[i];         // store the number at element i in temp
                yourArray[i] = yourArray[j];     // set the number at element j to element i
                yourArray[j] = temp;             // set the number at temp to element j     
            }
        }
    }
    System.out.print("This is a sorting array: ");
    for (int i = 0; i <  yourArray.length; i++)
        System.out.print(yourArray[i] + " ");
    // for (int i : yourArray) 
        // System.out.print(i + " ");
    System.out.println();
    }
}


// public class sortingArray1 {
//     
//     public static void main(String[] args) {
//     int[] yourArray = {20, 10, 30, 60, 55};
//     System.out.println(Arrays.toString(yourArray));
//     for  (int i = 0; i < yourArray.length; i++) {
//         for (int j = yourArray.length - 1; j >= i; j--){
//             // swap
//             if (yourArray[i] < yourArray[j]) {   // if element at i is smaller than element at j
//                 int temp = yourArray[i];         // store the number at element i in temp
//                 yourArray[i] = yourArray[j];     // set the number at element j to element i
//                 yourArray[j] = temp;             // set the number at temp to element j     
//             }
//         }
//     }
//     System.out.print("This is a sorting array: ");
//     for (int i = 0; i <  yourArray.length; i++)
//         System.out.print(yourArray[i] + " ");
//     // for (int i : yourArray) 
//         // System.out.print(i + " ");
//     System.out.println();
//     }
// }



// public class sortingArray2 {
//     
//     public static void main(String[] args) {
//     int[] yourArray = {20, 10, 30, 60, 55};
//     System.out.println(Arrays.toString(yourArray));
//     for  (int i = 1; i < yourArray.length; i++) {
//         for (int j = yourArray.length - 1; j >= i; j--){
//             // swap
//             if (yourArray[j] < yourArray[j-1]) {   // if element at (j-1) is greater than element a j
//                 int temp = yourArray[j];           // store the number at element j in temp
//                 yourArray[j] = yourArray[j-1];     // set the number at element (j-1) to element j 
//                 yourArray[j-1] = temp;             // set the number at temp to element (j-1)     
//             }
//         }
//     }
//     System.out.print("This is a sorting array: ");
//     for (int i = 0; i <  yourArray.length; i++)
//         System.out.print(yourArray[i] + " ");
//     // for (int i : yourArray) 
//         // System.out.print(i + " ");
//     System.out.println();
//     }
// }

