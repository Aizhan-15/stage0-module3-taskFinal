package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int number2 = 334;
        int rev = 0;
        while (number2 != 0) {
            int r = number2 % 10;
            rev = rev * 10 + r;
            number2 = number2 / 10;
        }
        System.out.println(rev);
    }
}
