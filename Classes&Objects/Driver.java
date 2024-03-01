class Driver {
    /**
     * we use main method as static because of this jvm do not have tocreate objects to execute program
     * 
     */
    String name;
    int age;

    String dateOfLicence;
    static int minAgeForDriving = 18;

    public boolean isAllowedToDrive(){
        return this.age>= minAgeForDriving;
    }
    public static void main(String[] args) {
    //     Car myCar = new Car();

    // // classname objectname  = keyword constructor;
    //     myCar.addFuel(6);
    //     myCar.drive(); 
    //     myCar.drive(); 
    //     myCar.addFuel(3);
    //     myCar.drive(); 
    //     myCar.drive(); 
        // dot (.) operator is used to access the class elements 
      
    //    System.out.println( myCar.getCurrentFuelLevel());
       Car swift = new Car("Red");
    //    Car swift = new Car();
    Car thar = new Car();
    //    swift.addFuel(6);
    //    Car startedCar=swift.start();
    //    startedCar.drive();
    swift.start().drive();
    thar.start().drive();
    System.out.println(swift.color);
    System.out.println(swift.maxSpeed);
    
    }
}
