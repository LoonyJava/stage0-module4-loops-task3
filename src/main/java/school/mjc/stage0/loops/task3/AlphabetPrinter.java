package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();
        for (int i = 0; i < abcArray.length; i++) {
            System.out.println(abcArray[i]);
        }
    }
}
