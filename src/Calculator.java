import java.util.List;

public class Calculator {

    public static int add(List<Integer> numbers){
        int total = 0;
        for (int number : numbers) {
            total+= number;
        }
        return total;
    }

    public static int subtract(List<Integer> numbers){
        int total = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            total-= numbers.get(i);
        }
        return total;
    }


    public static int modulus(int number1, int number2){
        return number1 % number2;
    }

    public static int multiply(List<Integer> numbers){
        int total = 1;
        for (int number : numbers) {
            total*= number;
        }
        return total;
    }


    public static double average(List<Integer> numbers){
        double total = (double) add(numbers);
        return total/numbers.size();
    }

    public static double squareRoot(int number) {
        return Math.sqrt(number);

    }

    public static boolean prime(int number) {
        for(int i = number-1; i > 1; i--){
            if (number % i == 0){
                return false;
            }
        }
        return true;

    }
}
