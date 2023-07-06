public class MaxNumberFinder {

/*  The correct number is probably given with the following, but that will not always be the case.
    The issue lies with the for loop. "i" should be initially set to "0" not to 1 as an array is going
    to start with index zero.  Being that the largest is not in that position, it may run fine for this
    instance, but if "20" were located in numbers[0], it would not be correct.*/
    public static void main(String[] args) {

        int[] numbers = {10, 5, 20, 8, 15};

        int max = 0;

        // corrected initiating i = 0
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number is: " + max);
    }

}
