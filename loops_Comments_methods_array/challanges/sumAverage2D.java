class sumAverage2D {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum and average of the 2d array");
        int [][] numArr = ArrayUtility.input2DArray();
        System.out.println("The sum of the element of the 2D array is :"+(sum2D(numArr)));
        System.out.println("Average of the elements: "+average2D(numArr));

    }
    public static float sum2D(int[][] numArr){

        int sum =0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                sum += numArr[i][j];
                
            }
            
        }

        return sum;
    }
    public static double average2D(int [][] numArr){
        double avg;
        int numOfElement = numArr.length * numArr[1].length;
        avg = sum2D(numArr)/numOfElement;
        return avg;
    }
}
