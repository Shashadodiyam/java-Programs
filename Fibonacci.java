import java.util.Arrays;

public class Fibonacci {

    // Function to compute nth Fibonacci using memoization
    public static int fib(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];

        // Initialize dp array with -1
        Arrays.fill(dp, -1);

        // Compute and print the result
        System.out.println("Fibonacci number " + n + " is " + fib(n, dp));
    }
}


