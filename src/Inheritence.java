// superclass
 class Vehicle{
protected String brand = "BMW";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
 }


//    subclass
class Car extends Vehicle {
    public String model = "M4";
    public static void main(String [] args) {
        Car object = new Car();
        object.honk();

        System.out.println("Car brand = " + object.brand + ", model =  " + object.model);
    }
}