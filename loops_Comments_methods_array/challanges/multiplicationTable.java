// package challanges;

import java.util.Scanner;

/**
 * multiplicationTable
 */
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number to print table");
        int num ;
        num= input.nextInt();
        table(num);
    }
    public static void table(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num +" * "+i+" = "+(num*i));
        }
    }

    
}
