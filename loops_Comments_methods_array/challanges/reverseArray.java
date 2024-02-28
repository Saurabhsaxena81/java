class reverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array reverse ");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Your reverse array is :");
        ArrayUtility.displayArray(numArr);


    }    
    public static void reverse(int[] numArr){
        for(int i=0;i<numArr.length/2;i++){
            int swap = numArr[i];
            numArr[i]=numArr[(numArr.length-1)-i];
            numArr[(numArr.length-1)-i]= swap;

        }

    }
}
