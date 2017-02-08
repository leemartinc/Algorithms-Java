import java.util.Arrays;

/**
 *  The bubble sort repeatedly compares adjacent elements of an array.
 *  The first and second elements are compared and swapped if out of order.
 *  Then the second and third elements are compared and swapped if out of order.
 *  This sorting process continues until the last two elements of the array are
 *  compared and swapped if out of order.
 */
public class BubbleSort {

    public static void main (String[] args){

        int list [] = new int[5];
        list[0]=145;
        list[1]=67;
        list[2]=1;
        list[3]=54;
        list[4]=6;

        System.out.println("unsorted array is " + Arrays.toString(list));

        BubbleSort(list);

        System.out.println("sorted array is " + Arrays.toString(list));

    }

    public static void BubbleSort( int [ ] num )
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                if ( num[ j ] > num[j+1] )   // change to > for ascending sort
                {
                    temp = num[ j ];                //swap elements
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
    }
}
