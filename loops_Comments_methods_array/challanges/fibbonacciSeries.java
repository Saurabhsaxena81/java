// package challanges;
// important for some interviews and in colleges 
import java.util.Scanner;

/**
 * fibbonacciSeries
 */
public class fibbonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner input = new Scanner(System.in);
        System.out.println("plaease enter the number up to you want to print fibbonacci series");
        int num = input.nextInt();
        printFibbonacci(num);
     
    }
    public static void printFibbonacci(int num){
        int first =0,second=1;
        if(num<0) System.out.println("0");
        else if(num == 0) return;

        while(first+second <= num){
            int third= first+second;
            System.out.print(third + " ");
            first = second;
            second =third;


        }

    }
}
