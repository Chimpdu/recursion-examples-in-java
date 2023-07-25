import java.lang.reflect.Array;
import java.util.Arrays;



public class DivideAndConquers {
    public int BinarySearch(int arr[],int length , int target) {     
        //the only reason to return -length*length is to make sure that if nothing is found, a negative number is returned.
        //it is designed in a way that the method returns a negative number when nothing is found.
        if (Array.getLength(arr) == 0)
                return -length*length;
            int midIndex = Array.getLength(arr)/2;

        if (arr[midIndex] == target )
            return midIndex;
        else if (arr[midIndex] < target )
            return midIndex + 1 + BinarySearch(Arrays.copyOfRange(arr, midIndex+1, Array.getLength(arr)),length ,target);  
        else
            return BinarySearch(Arrays.copyOfRange(arr, 0, midIndex),length ,target);
                
                
    }
    
}