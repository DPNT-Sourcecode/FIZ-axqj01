package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {

        String worldname = "World";

        if(friendName == null){
            friendName = worldname;
        }

        return String.format("Hello, %s!", friendName);
    }
}
