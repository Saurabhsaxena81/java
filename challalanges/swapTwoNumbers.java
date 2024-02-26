import java.io.*;
public class swapTwoNumbers {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        System.out.printf("Before swapping the value of a= %d and b= %d is",a,b);
        int temp;
        temp=a;
        a=b;
        b= temp;
        System.out.printf("\nAfter swapping the value of a= %d and b= %d \n ",a,b);
        System.out.print("Swapping Done!");

    }
}
