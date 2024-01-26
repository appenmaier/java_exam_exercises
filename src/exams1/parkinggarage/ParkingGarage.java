package exams1.parkinggarage;

import java.util.Arrays;

/**
 * Tiefgarage
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ParkingGarage {

  private ParkingSpot[] parkingSpots;

  public ParkingGarage(ParkingSpot[] parkingSpots) {
    this.parkingSpots = parkingSpots;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ParkingGarage other = (ParkingGarage) obj;
    return Arrays.equals(parkingSpots, other.parkingSpots);
  }

  public int getNextFreeParkingSpotNumber() {
    for (int i = 0; i < parkingSpots.length; i++) {
      if (parkingSpots[i] == null) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(parkingSpots);
    return result;
  }

  public String parkIn(Vehicle vehicle, int number) {
    if (parkingSpots[number].getVehicle() != null) {
      return "Dieser Parkplatz ist bereits besetzt";
    }

    if (parkingSpots[number].isForBusesOnly() && vehicle instanceof Car) {
      return "Dieser Parkplatz ist nur fuer Busse";
    }

    if (parkingSpots[number].length() < vehicle.length()
        || parkingSpots[number].height() < vehicle.height()) {
      return "Dieser Parkplatz ist zu klein";
    }

    parkingSpots[number].setVehicle(vehicle);
    return "Fahrzeug erfolgreich eingeparkt";
  }

  public String parkOut(Vehicle vehicle) {
    for (int i = 0; i < parkingSpots.length; i++) {
      Vehicle tmp = parkingSpots[i].getVehicle();
      if (tmp != null && tmp == vehicle) {
        parkingSpots[i].setVehicle(null);
        return "Fahrzeug erfolgreich ausgeparkt";
      }
    }
    return "Fahrzeug konnte nicht gefunden werden";
  }

  @Override
  public String toString() {
    return "ParkingGarage [parkingSpots=" + Arrays.toString(parkingSpots) + "]";
  }

}
