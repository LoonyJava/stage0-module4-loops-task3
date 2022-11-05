package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int[] array = new int[lastFibonacci];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < lastFibonacci; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < lastFibonacci; ++i) {
            System.out.println(array[i]);
        }
    }
}
