// package challanges;

import java.util.Scanner;

/**
 * sumOfOddNums
 */
public class sumOfOddNums {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Please input a number to print table");
        int num= input.nextInt();
        System.out.println("Sum of all odd numbers is "+sumOfOdds(num));

    }
    
    public static int sumOfOdds(int num ){
        int sum=0;
        for(int i=1;i<=num;i++){
            if((i & 1)==1){  // 
                // System.out.println(i);
                sum+=i;
            } 
        }
        return sum;
    }
}
