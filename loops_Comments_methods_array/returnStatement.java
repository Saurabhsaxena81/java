/**
 * InnerreturnStatement
 */

import java.util.Scanner;

/**
 * eg.  ek glass pani lao  
 */


 
  
public class returnStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        // System.out.println("Pleaseenter the number ");
        int first = readNumber()+1;
        System.out.println(first);
        // System.out.println("Input second number ");
        int second = readNumber()+2;
        System.out.println(second);
    }
    public static int readNumber(){
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the number ");
        int first = input.nextInt();
        return first;
    
    } 
}
