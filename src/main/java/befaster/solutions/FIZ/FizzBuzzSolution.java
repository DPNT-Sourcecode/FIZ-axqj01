package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    private static final String THE_NUMBER_IS_INVALID = "The number: %s is invalid.";
    private static final String FIZZ = "fizz ";
    private static final String BUZZ = "buzz ";


    public String fizzBuzz(Integer num){

        isValidInput(num);

        StringBuilder result = new StringBuilder();

        if(reminderIsEmpty(num, 3)){
            result.append(FIZZ);
        }
        if(reminderIsEmpty(num, 5)){
            result.append(BUZZ);
        }

        return result.length() == 0 ? String.valueOf(num) : result.toString().trim();

    }

    private boolean reminderIsEmpty(int num, int divider){
        return num % divider == 0;
    }

    private void isValidInput(final Integer num) {
        if(num < 1 || num > 9999){
            throw new IllegalArgumentException(String.format(THE_NUMBER_IS_INVALID, num));
        }
    }

}
