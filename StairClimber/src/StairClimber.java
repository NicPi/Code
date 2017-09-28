public class StairClimber {

    public static void main(String[] args)
    {
        StairClimber stairClimber = new StairClimber();
        int steps = 5;
        stairClimber.climbStairs(steps);
    }

    public int climbStairs(int n) {

        if (n<2) return 1; //if there are less than 2 steps, there is only 1 way possible

        int x = 1;
        int y = 1;
        int z = 1;

        for (int i=2; i<=n; i++){
            //Fibonacci translated to code, f(n) = f(n-1) + f(n-2)
            z = y; // f(n-1) saved
            y = x + y; // f(n-1) + f(n-2)
            x = z; // value of c is saved for the next iteration
        }
        System.out.println("Number of distinct ways: "+y);
        return y;
    }
}
