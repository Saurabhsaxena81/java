// package challanges;

import java.util.Scanner;

/**
 * GCD  ->greatest common divisor  (greatest number which divides both number )
 */
public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number :");
        int num1= input.nextInt();
        
        System.out.println("Please enter Second number :");
        int num2= input.nextInt();
        System.out.println("GCD is: "+gCD(num1,num2));
    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    public static  int gCD(int num1,int num2){
        int gcd=1,i=2;
        int small = least(num1, num2);
        while(i<=small)
        
        {
            if(num1 % i == 0 && num2 %i ==0){
                gcd = i;

            }
            i++;
        }
        return gcd;
    }

    
}
