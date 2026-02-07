//calculator class IT25100864///
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer
    public int square(int a) {
        return a * a;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int expr1 = calc.square(
                        calc.add(
                            calc.multiply(3, 4),
                            calc.multiply(5, 7)
                        )
                    );

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int expr2 = calc.add(
                        calc.square(calc.add(4, 7)),
                        calc.square(calc.add(8, 3))
                    );

        System.out.println("Result of Expression 1: " + expr1);
        System.out.println("Result of Expression 2: " + expr2);
    }
}
