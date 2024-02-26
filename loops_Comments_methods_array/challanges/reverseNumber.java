// package challanges;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input a number to reverse:");
        int num = input.nextInt();
        System.out.println(reverse(num));

    }
    public static int reverse(int num){
        int remainder=0,newNum=0;
        while(num>0){
            remainder = num%10;
            newNum=newNum*10+remainder;
            num/=10;

        }
        return newNum;
        
    }
    
}
