import static java.lang.System.out;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        int counter;
        for (counter = 1; counter <= 100; counter++) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                out.println("FizzBuzz");
            } else if (counter % 5 == 0) {
                out.println("Buzz");
            } else if (counter % 3 == 0) {
                out.println("Fizz");
            } else {
                out.println(counter);
            }
        }
    }
}