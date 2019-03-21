import java.util.*;

//Brea Zeller
//CPW 245 Winter 2019
//Homework Assignment #9: Functional Programming
//Description: I have to write a method countNegatives 
//that uses stream operations to count how many numbers 
//in a given array of integers are negative. 
//For example, if the array is {5, -1, -3, 20, 47, -10, -8, -4, 0, -6, -6}, return 7.
//Then I have to include three more test cases to test the method.

public class countNegativesTester{
    public static void main( String[] args ) {
        
        int[] data1 = {5, -1, -3, 20, 47, -10, -8, -4, 0, -6, -6};
        System.out.println( countNegatives( data1 ) );
        
        int[] data2 = {-5, -1, -3, -20, -47, -10, -8, -4, -6, -6};
        System.out.println( countNegatives( data2 ) );
        
        int[] data3 = {5, 1, 3, 20, 47, 0, 6, 6};
        System.out.println( countNegatives( data3 ) );
        
        int[] data4 = {};
        System.out.println( countNegatives( data4 ) );
        
    }
   public static long countNegatives( int[] a ) {
       return Arrays.stream(a)
            .filter(n -> n < 0)
            .count();
    }
}