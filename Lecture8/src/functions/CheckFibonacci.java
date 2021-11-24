package functions;

public class CheckFibonacci {

	// A utility method that returns true if x is perfect square
    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
      
    // Returns true if n is a Fibonacci Number, else false
    static boolean checkMember(int n)
    {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||
               isPerfectSquare(5*n*n - 4);
    }
 
    // Driver method
    public static void main(String[] args)
    {
        System.out.println(checkMember(13));
    }
}
