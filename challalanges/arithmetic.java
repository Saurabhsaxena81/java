// package challalanges;
import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        
        Scanner userInput= new Scanner(System.in);
        System.out.println("Input first number ");
        int a = userInput.nextInt();
        System.out.println("Input the seconde number ");
        int b = userInput.nextInt();

        System.out.println("addition "+(a+b));
        System.out.println("subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Division "+(a/b));
        System.out.println("Modulus "+(a%b));

    }
}
