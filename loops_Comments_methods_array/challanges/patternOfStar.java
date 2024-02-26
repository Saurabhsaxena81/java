// package challanges;

import java.util.Scanner;

public class patternOfStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of rows");
        int num = input.nextInt();
        pattern1(num);
        pattern2(num);
        pattern3(num);
    }
    public static void pattern1(int num){
        int i,j;
        for(i=0;i<num;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int num){
        int i,j;
        System.out.println();
        for(i=num;i>0;i--){
            for(j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int num){
        int i,j;
        for(i=0;i<num;i++){
            for(int k=0;k<num-i;k++){
                System.out.print("  ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            // for(int k=num-i;k>0;k--){
            //     System.out.print("* ");
            // }
            System.out.println();
        }
    }
}
