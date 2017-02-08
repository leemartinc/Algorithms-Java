import java.util.Arrays;

/**
 * Insertion sort iterates through the list by consuming one input
 * element at each repetition, and growing a sorted output list.
 * On a repetition, insertion sort removes one element from the input data,
 * finds the location it belongs within the sorted list, and inserts it there.
 * It repeats until no input elements remain.
 */
public class InsertionSort {

    public static void main (String[] args){

        int list [] = new int[5];
        list[0]=145;
        list[1]=67;
        list[2]=1;
        list[3]=54;
        list[4]=6;

        System.out.println("unsorted array is " + Arrays.toString(list));

        InsertionSort(list);

        System.out.println("sorted array is " + Arrays.toString(list));

    }

    public static int[] InsertionSort(int[] input){

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }

}
