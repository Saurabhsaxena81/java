import java.util.Scanner;

class Search2Darray {
    public static void main(String[] args) {
        System.out.println("Welcome to searching in 2D array ");
        Scanner input = new Scanner(System.in);
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("Enter the number you want to search ");
        int num = input.nextInt();
        System.out.println("your 2D array is:");
        ArrayUtility.display2DArray(numArr);
        if (searchNumber(numArr,num)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found ");
        }
    }
    public static boolean searchNumber(int[][] numArr, int num){
        for(int i=0;i<numArr.length;i++){
            for(int j=0;j<numArr[i].length;j++){
                if(numArr[i][j]== num){
                    return true;
                }
            }
        
        }
        return false;


    }
}
