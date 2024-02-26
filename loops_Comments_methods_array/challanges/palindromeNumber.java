// package challanges;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input number ");
        int num = input.nextInt();
        if(isPalindrome(num)){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
        
    }
    public static boolean isPalindrome(int num){
        int num1=0,remainder=0,copyNum=0;
        copyNum = num;
        while(num>0){
            remainder = num%10;
            num1=num1*10+remainder;
            System.out.println(num1);
            num/=10;

        }
        if(num1==copyNum){
            return true;
        }
        else{
            return false;
        }
    }
}
