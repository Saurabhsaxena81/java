

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of the element in the array");
        int n = input.nextInt();
        int[] arr1= new int[n];
        System.out.printf("Input %d element in the array",n);
        for(int i=0;i<n;i++){
            System.out.printf("Input element no. %d: ",i+1);
            arr1[i]= input.nextInt();
        }
        return arr1;
    }
}
