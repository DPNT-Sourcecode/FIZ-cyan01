package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

       String fizz = "", buzz = "", deluxe = "";
       Integer num = number;
       Integer num2 = number;
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
       if(num2 > 10){
           int c = num2 % 10;
           while(num2 > 0){
               if(c == num2 % 10){
                   num2 = num2 / 10;
               }
           }
       }
       if(num2 == 0){
           deluxe = "deluxe";
       }

       if(fizz.equals("fizz")) {
           if (buzz.equals("buzz")) {
               if(deluxe.equals("deluxe"))
                     return "fizz buzz deluxe";
               return "fizz buzz";
           }
           return "fizz";
       }
       if(buzz.equals("buzz"))
           return "buzz";


       return num.toString();

    }

}
