import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        StringRecursions SR = new StringRecursions();
        NumberRecursions NR = new NumberRecursions();
        ShapeRecursions ShapeR = new ShapeRecursions();
        DivideAndConquers DC = new DivideAndConquers(); 
        System.out.println(SR.reverseString("VR.fi"));
        System.out.println(SR.isPalindrome("hhiiiihh"));
        System.out.println(SR.isPalindrome("Notapalindrome"));
        System.out.println(NR.recursiveCounter(6));
        System.out.println(NR.recursiveAdder(10));
        ShapeR.recursiveStairCase(6);
        System.out.println();
        ShapeR.reversedStaircase(6, 6);
        System.out.println();
        ShapeR.pyramid(6, 6);
        System.out.println(NR.decimaltoBinary(145636));
        

        int arr[] = {2,6, 8, 24, 565 ,5656,56565,565665,5656565}; // make sure that the array is sorted.
        int target =546456565;
        int resultIndex = DC.BinarySearch(arr, Array.getLength(arr), target);
        if (resultIndex < 0)
            System.out.println("Number not found.");
        else 
            System.out.printf("\"%d\" is at index %d.\n", target, resultIndex);
    }
    
    
}

