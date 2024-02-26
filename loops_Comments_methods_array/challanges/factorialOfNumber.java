// package challanges;

import java.util.Scanner;

/**
 * factorialOfNumber
 */
public class factorialOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input number to find the factorial of the number");
        int num = input.nextInt();
        System.out.printf("Factorial of  %d is %d",num,factorial(num));
    }
    
    public static  long  factorial(int num){
        long fact =1;
        for(int i=num;i>1;i--){
            fact*=i;
        }
        // if(num<2){
        //     return 1;
        // }
        // int i=2;
        // while (i<=num) {
        //     fact *= i;
        //     i++;
            
        // }
        
        return fact;
    }
}