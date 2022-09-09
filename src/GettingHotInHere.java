import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int fahrenheit = scanner.nextInt();
        double celsius = (fahrenheit - 32) * (5.0/9);
        System.out.printf("%d°F", fahrenheit);        
        System.out.printf("%n%f°C", celsius);
        System.out.printf("%n%.0f°C", celsius);
        System.out.printf("%nIf it were 2°C warmer it would be: %f°C",celsius+2);

       
    }
}
