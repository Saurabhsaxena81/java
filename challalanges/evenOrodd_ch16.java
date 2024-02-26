// package challalanges;
import java.util.Scanner;

public class evenOrodd_ch16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your number ");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("Your number is even");
        }
        else{
            System.out.println("your given number is odd");
        }
    }
}
