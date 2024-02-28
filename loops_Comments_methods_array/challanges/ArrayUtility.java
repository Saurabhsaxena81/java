

import java.util.Scanner;

class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of the element in the array");
        int n = input.nextInt();
        int[] arr1= new int[n];
        System.out.printf("Input %d element in the array\n",n);
        for(int i=0;i<n;i++){
            System.out.printf("Input element no. %d: ",i+1);
            arr1[i]= input.nextInt();
        }
        return arr1;
    }
    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of row in the array");
        int row = input.nextInt();
        System.out.println("Input the number of columns in the array");
        int col= input.nextInt();
        int[][] arr1= new int[row][col];
        // System.out.printf("Input %d element in the array\n",);
        int k=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.printf("Input element no. %d: ",k++);
            arr1[i][j]= input.nextInt();}
        }
        return arr1;
    }
    public static void displayArray(int [] numArr){
        int i;
        for(i=0;i<numArr.length;i++){
            System.out.print(numArr[i]+" ");
        }
    }
    public static void display2DArray(int[][] numArr ){
        int i;
        for(i=0;i<numArr.length;i++)
        {
            for(int j=0;j<numArr[i].length;j++)
            {
            System.out.print(numArr[i][j] +" ");
            }
            System.out.println();
        }
    
    }
}
