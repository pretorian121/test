package Cars;

/**
 * Created by Pretorian on 11/6/2016.
 */
public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "blue";
        car2.color = "red";

        car1.numberOfDoors = 4;
        car2.numberOfDoors = 4;

        System.out.println("I've painted the cars!!!");
        System.out.println("Color of car1 is " + car1.color);
        System.out.println("Color of car2 is " + car2.color);
        System.out.println("Car1 have got a " + car1.numberOfDoors + " doors");
        System.out.println("Car2 have got a " + car2.numberOfDoors + " doors");
    }
}
