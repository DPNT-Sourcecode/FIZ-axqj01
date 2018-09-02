package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {

    public int compute(int x, int y) {
        if(isInvalid(x) || isInvalid(y)){
            throw new RuntimeException(String.format("Number is invalid: %s, %s. Please use the correct number from 0 to 100",
                    String.valueOf(x), String.valueOf(y)));
        }

        return x + y;
    }

    private static boolean isInvalid(int num) {
        return num < 0 || num > 100;
    }

}
