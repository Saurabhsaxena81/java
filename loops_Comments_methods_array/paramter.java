/**
 * paramter
 * 
 * function which takes is called parameter or arguments
 */
public class paramter {

    public static void main(String[] args) {
        int num = sum(12, 15);
        System.out.println("The sum is :"+num); 
        System.out.println(sum(5,9));  //without declaration of the number 
    }
    // in the following function -- int -- is the return type of the function

    

    public static int sum(int first ,int second){
        int sum = first+second;
        return sum;  //a function can return only one value at a time 
    }
}
