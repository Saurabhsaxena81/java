// package challanges;

import java.util.Scanner;

/**
 * sumAndAverageOfArray
 */
class sumAndAverageOfArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average of the array");
        int[] numArray = ArrayUtility.inputArray();
        float sum =sum(numArray);
        double avg= average(numArray);
        System.out.println(sum);
        System.out.println(avg);
        // long sum=0;
        // for(int i=0;i<numArray.length;i++){
        //     sum+=numArray[i];
        // }
        // System.out.printf("Sum of the element of the array is %d %d",sum,numArray.length);
        // System.out.println("\nAverage of the element is "+(float)(sum/numArray.length));


    }
    public static float sum(int[] numArray){
        float sum=0;
        for(int i=0;i<numArray.length;i++){
            sum+=numArray[i];
            // i++;
        }
        return sum;
    }
    public static double average(int[] numArray){
        float sum=sum(numArray);
        // return (int)(sum/numArray.length);
    
    return (sum/numArray.length);
    }
}
