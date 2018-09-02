package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    private static final String THE_NUMBER_IS_INVALID = "The number: %s is invalid.";
    private static final String FIZZ = "fizz ";
    private static final String BUZZ = "buzz ";
    private static final int DIVIDER_3 = 3;
    private static final int DIVIDER_5 = 5;


    public String fizzBuzz(Integer num){

        isValidInput(num);

        StringBuilder result = new StringBuilder();

        result.append(fizzBuzzResolver(num, DIVIDER_3, FIZZ));
        result.append(fizzBuzzResolver(num, DIVIDER_5, BUZZ));

        return result.length() == 0 ? String.valueOf(num) : result.toString().trim();

    }

    private static String fizzBuzzResolver(int num, int divider, String chunk){
        return reminderIsEmpty(num, divider) || hasNumber(num, divider) ? chunk : "";
    }

    private static boolean hasNumber(int num, int targetNum) {
        for(int i = num; i > 0 ; i /= 10){
            if (i % 10 == targetNum) {
                return true;
            }
        }
        return false;
    }

    private static boolean reminderIsEmpty(int num, int divider){
        return num % divider == 0;
    }

    private void isValidInput(final Integer num) {
        if(num < 1 || num > 9999){
            throw new IllegalArgumentException(String.format(THE_NUMBER_IS_INVALID, num));
        }
    }

}
