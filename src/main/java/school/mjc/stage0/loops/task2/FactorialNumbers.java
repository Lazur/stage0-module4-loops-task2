package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;

        while (i <= printToInclusive) {
            long factorial = calculateFactorial(i);
            System.out.println(factorial);
            i++;
        }
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long factorial = 1;
        int i = 2;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        return factorial;
    }
}

