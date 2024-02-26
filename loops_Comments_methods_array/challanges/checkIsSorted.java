public class checkIsSorted {
    public static void main(String[] args) {
        System.out.println("Welcome to check array is sorted or not");
        int[] arr = ArrayUtility.inputArray();
        if(isSortedIncrease(arr)){
            System.out.println("Your given array is sorted in the increasing order ");
        }
        else if(isSortedDecrease(arr)){
            System.out.println("Your given array is sorted in the decreasing order ");
        }
        else {
            System.out.println("Your array is not sorted ");
        }
        
    }
    public static boolean isSortedIncrease(int[] numArray){
        int i;
        for(i=0;i<numArray.length-1;i++){
            if(numArray[i]>numArray[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedDecrease(int[] numArray){
        int i;
        for(i=0;i<numArray.length-1;i++){
            if(numArray[i]<numArray[i+1]){
                return false;
            }
        }
        return true;
    }
}
