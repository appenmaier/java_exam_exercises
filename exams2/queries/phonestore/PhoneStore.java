package exams2.queries.phonestore;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Smartphone-Shop
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record PhoneStore(List<Phone> phones) {

   public List<Phone> query1() {
      return phones.stream()
            .filter(p -> p.numberOfCameras() == 3)
            .filter(p -> p.brand().equals(Brand.HUAWEI))
            .sorted((p1, p2) -> Double.valueOf(p2.cpuPowerInGhz()).compareTo(p1.cpuPowerInGhz()))
            .limit(3)
            .sorted((p1, p2) -> Double.valueOf(p2.priceInEuro()).compareTo(p1.priceInEuro()))
            .toList();
   }

   public OptionalDouble query2() {
      return phones.stream()
            .filter(p -> p.batteryCapacityInMah() >= 2500)
            .mapToInt(p -> p.numberOfCameras())
            .average();
   }

   public List<Phone> query3(double maxPriceInEuro) {
      return phones.stream()
            .filter(p -> p.priceInEuro() <= maxPriceInEuro)
            .filter(p -> p.connectionType().isModern())
            .filter(p -> p.cpuPowerInGhz() < 2.4)
            .sorted((p1, p2) -> Double.valueOf(p1.priceInEuro()).compareTo(p2.priceInEuro()))
            .toList();
   }

   public Map<Phone, String> query4() {
      return phones.stream()
            .collect(Collectors.toMap(p -> p, p -> p.brand() + p.connectionType().description()));
   }

   public Map<ConnectionType, List<Phone>> query5() {
      return phones.stream().collect(Collectors.groupingBy(p -> p.connectionType()));
   }

}
