package exams2.phonestore;

/**
 * Smartphone
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Phone(String description, Brand brand, ConnectionType connectionType,
    int numberOfCameras, int batteryCapacityInMAh, double cpuPowerInGHz, double priceInEuro) {

}
