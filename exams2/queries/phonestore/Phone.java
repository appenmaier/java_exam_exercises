package exams2.queries.phonestore;

/**
 * Smartphone
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Phone(String description, Brand brand, ConnectionType connectionType,
      int numberOfCameras, int batteryCapacityInMah, double cpuPowerInGhz, double priceInEuro) {

}
