package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int number = 0;
        String nine = "" + 9;
        if (lengthOfLastNumber == 0 || lengthOfLastNumber < 0) {
            System.out.println("0");
        } else {
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                number  = number + Integer.parseInt(nine);
                nine = nine + 9;
            }
            System.out.println(number);
        }
    }
}
