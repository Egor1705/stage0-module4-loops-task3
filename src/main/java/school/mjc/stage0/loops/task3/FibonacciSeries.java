package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int array[]=new int[lastFibonacci];
        // The space used here is O(N)
        array[0]=0;
        array[1]=1;
        System.out.println(0);
        System.out.println(1);
        for(int i=2;i<lastFibonacci;i++) {
            array[i] = array[i - 1] + array[i - 2];

            System.out.println(array[i]);
        }
        }
    }

