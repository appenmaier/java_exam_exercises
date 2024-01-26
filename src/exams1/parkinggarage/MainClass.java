package exams1.parkinggarage;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  public static void main(String[] args) {

    ParkingSpot[] parkingSpots = new ParkingSpot[3];
    parkingSpots[0] = new ParkingSpot(5, 2.5, false);
    parkingSpots[1] = new ParkingSpot(7, 3, true);
    parkingSpots[2] = new ParkingSpot(5, 1.8, false);

    ParkingGarage parkingGarage = new ParkingGarage(parkingSpots);

    Car car1 = new Car("Audi", "A4", 4.67, 1.44);
    Car car2 = new Car("Opel", "Zafira Life", 4.96, 1.94);

    System.out.println(parkingGarage.parkIn(car1, 0));
    System.out.println(parkingGarage.parkIn(car2, 0));
    System.out.println(parkingGarage.parkIn(car2, 1));
    System.out.println(parkingGarage.parkIn(car2, 2));
    System.out.println(parkingGarage.parkOut(car1));
    System.out.println(parkingGarage.parkIn(car2, 2));

  }

}
