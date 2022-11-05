package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        int input =  t;
        while (t != 0) {
            if (t % 10 != 0) {
                sum = sum + t % 10;
                t = t / 10;
            } else {
                t = t / 10;
            }
        }
        if (input > 0) {
            System.out.println(sum);
        } else {
            System.out.println(sum * (-1));
        }
    }
}
