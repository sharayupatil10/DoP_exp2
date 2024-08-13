public class Calculator {
    
    // Method to calculate the sum of two integers
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Define two numbers to be added
        int num1 = 10;
        int num2 = 20;

        // Call the add method with parameters and store the result
        int result = calculator.add(num1, num2);

        // Print the result to the console
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
