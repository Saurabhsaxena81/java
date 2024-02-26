// package challalanges;
import java.util.Scanner;
public class negativePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to number checker program");
        System.out.println("Input your number ");
        float num = input.nextFloat();
        if(num>0){
            System.out.println("Input number is positive");
        }
        else if(num<0){
            System.out.println("Your number is negative");
        }
        else{
            System.out.println("your input number is zero ");
        }
    }
}
