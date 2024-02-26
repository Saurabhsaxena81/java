import java.util.Scanner;

class arraySearching {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] arr={1,2,3,4,5,6,5,7,7,8,9,0};
    System.out.println("Welcome to array seaching ");
    int num = input.nextInt();
    if(isFound(arr,num)){
        System.out.println("Your number is found in the array");
    }
    else{
        System.out.println("Your number is not found in the array");
    }


   }
   public static boolean isFound(int[] arr,int num){
        int i=0;
        while(i<arr.length){
            if(arr[i]==num){
                return true;
            }
            i++;
        }
        return false;

   } 
}
