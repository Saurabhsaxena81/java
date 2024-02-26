package OperatorsInJava;
/**
 * <,>,<=,>=,==,!= are relational operators 
 * order of relational operators is less than arithmetic operators 
 */
import java.util.Scanner;

public class relationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome toDriving Licence Portal");
        System.out.println("Please enter your age:");
        int age= input.nextInt();
        if(age>=18){
            System.out.println("You are elligible to drive ");
        }        else{
            System.out.println("beta abhi tu cycle chala");
        }
    }
    
}
