package exams1.classdiagrams.parkinggarage;

import java.util.Objects;

/**
 * Parkplatz
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ParkingSpot {

  private final double height;
  private final boolean isForBusesOnly;
  private final double length;
  private Vehicle vehicle;

  public ParkingSpot(double length, double height, boolean isForBusesOnly) {
    this.length = length;
    this.height = height;
    this.isForBusesOnly = isForBusesOnly;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ParkingSpot other = (ParkingSpot) obj;
    return height == other.height && isForBusesOnly == other.isForBusesOnly
        && length == other.length && Objects.equals(vehicle, other.vehicle);
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, isForBusesOnly, length, vehicle);
  }

  public double height() {
    return height;
  }

  public boolean isForBusesOnly() {
    return isForBusesOnly;
  }

  public double length() {
    return length;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  @Override
  public String toString() {
    return "ParkingSpot [height=" + height + ", isForBusesOnly=" + isForBusesOnly + ", length="
        + length + ", vehicle=" + vehicle + "]";
  }

}
