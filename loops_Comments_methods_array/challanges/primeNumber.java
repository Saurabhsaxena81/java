// package challanges;

import java.util.Scanner;

/**
 * primeNumber  -> no smallest number can divide it 
 */
public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a numer to check:");
        int num=input.nextInt();
        
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num){
        int i=2;
        while (i<num) {
            if((num % i ) == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
