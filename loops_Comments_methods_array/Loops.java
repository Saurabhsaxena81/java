/**
 * Loops
 *   code that runs multiple time based on the condition 
 *   repeat a code multiple times
 *  for(cond'n;cond'n;cond'n){//body} loop
 */

/**
 * Loops
 */
public class Loops {

    public static void main(String[] args) {
       /**  while (condition) {
            //body of while loop 
            // it is used when we don't know the number of repetetions

        }
        
        */
        int num =100;
        while(num>=1){
            System.out.println(num);
            num-=1;
        }
       /**  for (int i = 0; i < args.length; i++) {
            
        }
        for (String string : args) {
            
        }
        */
        for(int i=0;i<10;i++){
            for(int j=i;j>=0;j--){
            System.out.print(i);}
            System.out.println();
        }
    }
}