/**
 * sumOfDiagonal
 * for this matrix should be square 
 */

class sumOfDiagonal {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum ");
        int[][] numArr= ArrayUtility.input2DArray();
        ArrayUtility.display2DArray(numArr);
        long sum = sumofDiagonals(numArr);
        System.out.println(sum);


    }    
    public static long sumofDiagonals(int [][] numArr){
        long sum =0;
       long leftSum = sumofLeftDiagonal(numArr);
       long rightSum = sumofRigthDiagonal(numArr);
       sum = leftSum+rightSum;
       if(numArr.length%2 != 0){
        int index = numArr.length /2;
        sum -= numArr[index][index];
       }
       return sum;
    }
    
    public static long sumofLeftDiagonal(int [][] numArr){
        long leftSum =00;
        for(int i=0;i<numArr.length;i++){
           
                    leftSum+=numArr[i][i];
        }
        return leftSum;
    }
    
    public static long sumofRigthDiagonal(int [][] numArr){
        long rightSum =0;
        for(int i=0;i<numArr.length;i++){
           int col = numArr.length-1-i;
           rightSum += numArr[i][col];
        }
        return rightSum;
    }
}
