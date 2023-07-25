public class NumberRecursions {
    public int recursiveCounter(int n) {
        //simply count n times
        if (n == 0)
            return 0;
        return 1 + recursiveCounter(n-1);
    }
    public int recursiveAdder(int n) {
        //simply count n times
        if (n == 0)
            return 0;
        return n + recursiveAdder(n-1);
    }
    public String decimaltoBinary(int n) {
        if (n == 0)
            return "";
        return decimaltoBinary(n/2) + n%2;
    }
    //extremely neat and clean but requires some thinking

}