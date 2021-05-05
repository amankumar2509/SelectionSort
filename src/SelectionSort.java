/*   Created by IntelliJ IDEA.
 *   Author: Aman Kumar (amankumar_2509)
 *   Date: 05-05-2021
 *   Time: 23:47
 *   File: SelectionSort.java
 */


public class SelectionSort {
    public void selectionSort(int[] array){
        int n= array.length;
        for (int i = 0; i <n-1 ; i++) {
            int minimumValue=i;
            for (int j = i+1; j <n ; j++) {
                if(array[j]<array[minimumValue]){
                    minimumValue=j;
                }

            }
            int temp = array[i];
            array[i] = array[minimumValue];
            array[minimumValue] = temp;
        }

    }

}
