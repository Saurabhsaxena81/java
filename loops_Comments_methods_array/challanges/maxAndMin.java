public class maxAndMin {
    public static void main(String[] args) {
        System.out.println("Welcome to max and min number finding program");
        int [] arr = ArrayUtility.inputArray();
       
        int min=min(arr);
        int max = max(arr);
        System.out.println("Minimum element in the array is "+min);
        System.out.println("Maximum element in the array is "+max);

    }
    public static int min(int [] numArray){
      
        int i;
        if (numArray.length == 0) {
            return Integer.MIN_VALUE;

        } else {
            int minimun = numArray[0];
            for(i=1;i<numArray.length;i++){
                if(numArray[i]<minimun){
                    minimun=numArray[i];
                }
    
            }
            return minimun;
        }
        
    }
    public static int max(int [] numArray){
    
        int i;
        if (numArray.length ==0) {
            return Integer.MAX_VALUE;
            
        } else {
            int maximum = numArray[0];
            for(i=1;i<numArray.length;i++){
                if(numArray[i]>maximum){
                    maximum=numArray[i];
                }
    
            }
            return maximum;
            
        }
     
    }
}
