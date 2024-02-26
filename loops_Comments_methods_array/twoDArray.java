import java.util.Scanner;

/**
 * twoDArray
 */
public class twoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input nubers in the array ");
        int [][] arr= new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
           arr[i][j] = input.nextInt();
            }
            System.out.println(); 
        }
        int[][] newArr = {{1,2,3},{1,2,2,2,2}};
        for(int k=0;k<newArr.length;k++){
            for(int l=0;l<newArr[k].length;l++){
                System.out.print(newArr[k][l]+" ");
            }
            System.out.println();

        }
        // int [][] arr= new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
    
}
