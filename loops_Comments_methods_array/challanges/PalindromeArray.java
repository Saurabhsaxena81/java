class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrom array checker");
        int[] numArr = ArrayUtility.inputArray();
        if(palindrom(numArr)){
            System.out.println("Your input array is palindrome");
        }
        else{
            System.out.println("Your array is not palindrome");
        }
    }
    public static boolean palindrom(int[] numArr){
        for(int i=0;i<numArr.length/2;i++){
            if(numArr[i]!=numArr[(numArr.length-1)-i]){
                return false;
            }

        }
        return true;
    }
}
