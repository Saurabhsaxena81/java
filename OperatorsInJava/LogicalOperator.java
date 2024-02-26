// package OperatorsInJava;
import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to ticket discount calculator:");
        System.out.println("Input your age");
        int age=input.nextInt();
        System.out.println("Are you a female");
        boolean isFemale= input.nextBoolean();
        if(age<5){
            System.out.println("You got 75% discount ");
        }
        else if(isFemale){
            System.out.println("You got 50% discount");
        }
        else if(age>60 && !isFemale){
            System.out.println("You got 25% discount");
        }
        else{
            System.out.println("yoou got no discount");
        }
    }
}
