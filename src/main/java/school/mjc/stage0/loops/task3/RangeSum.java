package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        if (firstBoarder == secondBoarder) {
            System.out.println(firstBoarder);
        } else {
            for (int count = firstBoarder; count <= secondBoarder; count++) {
                sum = sum + count;
            }
            System.out.println(sum);
        }
    }
}
