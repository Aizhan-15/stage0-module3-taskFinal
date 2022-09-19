package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
    }

    // Driver program
    public static void main(String[] args) {
        int number = 687;
        System.out.println(number);
    }
}

