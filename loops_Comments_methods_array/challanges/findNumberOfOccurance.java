import java.util.Scanner;

public class findNumberOfOccurance {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Input number you want to find occurence");
        Scanner input = new Scanner(System.in);
        // int count=0;
        int num =input.nextInt();
        System.out.println(noOfOccurences(arr,num ));


    }
    public static int noOfOccurences(int [] numArray,int num){
        int i=0,k=0;
        while (i<numArray.length) {
            if(numArray[i]== num){
                k++;
            }
            i++;
        }
        return k;
    }
}
