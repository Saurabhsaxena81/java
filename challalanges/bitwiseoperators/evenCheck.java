// package challalanges.bitwiseoperators;

/**
 * important question for the interview
 */
import java.util.Scanner;
public class evenCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number to check whether it is even or odd");
        int num=input.nextInt();
        if((num & 1) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
