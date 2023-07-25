public class ShapeRecursions {
    
    public void recursiveStairCase(int n) {
        if (n == 0) 
            return;
        recursiveStairCase(n-1);
        System.out.println(" # ".repeat(n)); //interesting
        /*
         * this is interesting, we use a base case and a recursion case to create a simple recursion where n+1 subroutines were called.
         * during each subroutine, sysout(" # ".repeat(n)) is frozen as it has to call the next subroutine first. In the last(no.n+1)
         *  subroutine, it immediately terminates as n == 0. Then, subroutine no.n prints 1 "#" and terminates. subroutine n-1 prints 2 "#"s
         * and terminates...
         */
    }    
    public void reversedStaircase(int n, int m) { 
        //m here is to keep the total number of rows wconstantly available during each subroutine as we need it to do some math.
        if (n == 0)
            return;
        reversedStaircase(n-1, m);
        System.out.println("   ".repeat(m-n)+" # ".repeat(n));
    }

    public void pyramid(int n, int m) {
        if (n == 0)
            return;
        pyramid(n-1, m);
        System.out.println("   ".repeat(m-n)+" # ".repeat(2*n-1));
    }
    
}
