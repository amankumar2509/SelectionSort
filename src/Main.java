/*   Created by IntelliJ IDEA.
 *   Author: Aman Kumar (amankumar_2509)
 *   Date: 06-05-2021
 *   Time: 00:00
 *   File: Main.java
 */


public class Main {
    public static void main(String[] args) {
        int[] array={2,4,8,5,7,4};
        SelectionSort sort= new SelectionSort();
        sort.selectionSort(array);
        System.out.println("sorted array");
        for (int j : array) {
            System.out.println(j);

        }
    }
}
