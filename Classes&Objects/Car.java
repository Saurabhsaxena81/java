public class Car{
    /**
     * given below is instance varible and instance methods 
     * class -> it is calleda blue print 
     */
    static int noOfCarSold=0;


    int noOfWheels;
    String color;
    float currentFuelInLiters;
    float maxSpeed;
    int noOfSeats;
    
static{
    // it executes only once 
    noOfCarSold=0;
    
    System.out.println("I am in static block");

}
{
    noOfCarSold++;
    System.out.println("I am in init block");
    System.out.println(noOfCarSold);
}
    // constructor  
    Car(String color){
        this.color=color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
        noOfWheels=4;

    }

    //constructor chaining
    Car(){
        this("black");
        currentFuelInLiters=5;
    }
    // Car(){
    //     this.color="Black";
    //     maxSpeed = 150;
    //     currentFuelInLiters = 2;
    //     noOfSeats = 5;
    //     noOfWheels=4;

    // }
    {
        System.out.println("kuch bhi");
    }
    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel,can not start");
        }
        else if(currentFuelInLiters < 5){
            System.out.println("Car is in reservedmode ,please refuel");

        }
        else{
            System.out.println("Car is started .. bruuhhh....");
        }
        return this;

    }
    public void drive(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel");
        }
        else if(currentFuelInLiters<5){
            System.out.println("Car is in reserved mode ,please refuel");
            currentFuelInLiters--;
        }
        else{
        System.out.println("Car is driving");
        currentFuelInLiters--;
        }

    }
    // public void addFuel(float fuel){
    //     currentFuelInLiters += fuel;
    // }
    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;   // current fuel in liters add 
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}