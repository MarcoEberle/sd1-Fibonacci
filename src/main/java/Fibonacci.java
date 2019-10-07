/**
 * This class accepts one argument. The argument is a number of the existing Fibonacci sequence.
 * The answer will be the next fibonacci number of your argument.
 * Example: If your argument is 21, the following number will be 34.
 * If your entered number is no fibonacci number, the next real fibonacci number will be calculated and outputted: fib4 = 5.
 * fib0 = 1, fib1 = 2, fib2 = 3, fib3 = 5, fib5 = 8, etc.
 */
public class Fibonacci {
    public static void main(String[] args) {

        final int inputConsole = Integer.parseInt(args[0]);
        int currentAns = 1;
        int nextAns = 1;
        int preAns = 1;
        /**
         * While the current answer (at beginning 1) is smaller/equal the entered console value our next answer
         * is current answer + pre answer (at beginning 1).
         * After that the pre answer is the current answer and the current answer will be the in the moment
         * calculated fibonacci number.
         * This goes around until one fibonacci number is higher than the entered value.
         */
        while(currentAns <= inputConsole){
            nextAns = currentAns + preAns;
            preAns = currentAns;
            currentAns = nextAns;
        }

        System.out.println(nextAns);
    }
}
