package LambdaExample;//Present anonymous function
// functional interface = contains only 1 abstract method but can have multiple default and static methods.

interface Calculator{
    //void switchOn();
    //void sum(int input);
    int substract(int i1, int i2);
}

public class CalculatorImpl {

    public static void main(String[] args) {
        //LambdaExample.Calculator calculator = () -> System.out.println("Switch On");
        //calculator.switchOn();

        //LambdaExample.Calculator calculator = (input) -> System.out.println(input +1);
        //calculator.sum(2);

        Calculator calculator = (i1, i2) -> {
            if (i1>i2){
                throw new RuntimeException("message");
            } else {
                return i2-i1;
            }
        };
        calculator.substract(1,4);
    }
}
