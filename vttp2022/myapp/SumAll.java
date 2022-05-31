package vttp2022.myapp;

public class SumAll {
    public class SumAll{

        public static void main(String[]args){

            //Get access to all the numbers
            for (int i= 0; i < args.length; i++){
                System.out.printf("%s\n", args[i]);
                operand = Integer.parseInt(args[i]);
                result += operand;

            }
             System.out.printf("The result is %d\n", result);
        }
    }
    
}
