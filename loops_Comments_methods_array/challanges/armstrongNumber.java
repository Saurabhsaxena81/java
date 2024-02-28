// package challanges;

import java.util.Scanner;

/**
 * armstrongNumber 1^3+5^3+3^3=153
 */
class armstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number to check whether it is armstrong or not :");
        int num = input.nextInt();
        // int num1= num;
        // int n=0;
        // while(num1>0){
        if( isArmstrong(num)) System.out.println("your number is armstrong");
        else{
            System.out.println("Number is not armstrong");
        }
        
    }
    public static boolean isArmstrong(int num){
        int n=0,finalNumber=0;
        int num1;
        num1= num;
        System.out.println(num1);
        n= countDigit(num);
        while(num>0){
            int remainder=0;
            remainder = num%10;
        //    System.out.println(powerOfNumber(remainder, n));
            finalNumber +=powerOfNumber(remainder, n);
            num/=10;
        }
        // System.out.println(finalNumber);
        // if(finalNumber==num1) return true;
        return finalNumber == num1;
    }
    public static int  countDigit(int num){
        int n=0;
        while(num>0){
            n++;
            num/=10;
        }
        return n;
    }
    public static int powerOfNumber(int num ,int pow){
        int result=1,i=0;
        while(i<pow){
            result *=num;
            i++;
        }
        return result;

    }
}
