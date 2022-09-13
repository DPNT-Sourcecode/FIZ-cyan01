package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

       String fizz = "", buzz = "";
       Integer num = number;
       if(number % 5 == 0 && number % 3 == 0) return "fizz buzz";
       if(number % 5 == 0)
           buzz = "buzz";
       if(number % 3 == 0)
           fizz = "fizz";
       while(number > 0){
           if(number % 10 == 3)
               fizz = "fizz";
           if(number % 10 == 5)
               buzz = "buzz";
           number = number/10;
       }
       if(fizz.equals("fizz")) {
           if (buzz.equals("buzz")) {
               return "fizz buzz";
           }
           return "fizz";
       }
       if(buzz.equals("buzz"))
           return "buzz";

       return num.toString();

    }

}


