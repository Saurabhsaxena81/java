import java.util.Scanner;

/**
 * DeletionFromArray
 */
class DeletionFromArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array deletion\n");
        int[] numArr = ArrayUtility.inputArray();  // to get input array from the user 
        System.out.println("Input the number you want to delete from the array");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        ArrayUtility.displayArray(newArr);  // to display array 

    }
    public static int[] deleteNumber(int[] numArr,int numToDelete){
        int occ =findNumberOfOccurance.noOfOccurences(numArr, numToDelete);
        if(occ==0) return numArr;
        int newSize = numArr.length -occ;
        int[] newArr = new int[newSize];
        int j=0;
        for(int i=0;i<numArr.length;i++){
            if(numArr[i]!= numToDelete){
                newArr[j]=numArr[i];
                j++;
            }

        }
        return newArr;
    }
}