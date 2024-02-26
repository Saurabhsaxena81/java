// package challanges;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter your number to gget sum of its digits:");
        int num = input.nextInt();
       System.out.println( sumOfDigit(num));
    }
    public static int sumOfDigit(int num){
        int sum=0,remainder;
        while(num>0){
            remainder = num%10;
            sum+=remainder;
            num/=10;
        }
        return sum;

    }
}
