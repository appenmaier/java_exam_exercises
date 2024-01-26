package exams2.phonestore;

import java.util.ArrayList;
import java.util.List;

/**
 * Datenlieferant
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class DataProvider {

  public static List<Phone> getPhones() {
    List<Phone> phones = new ArrayList<>();
    phones.add(new Phone("SamsungPhone 1", Brand.SAMSUNG, ConnectionType.USB_C, 2, 2000, 2.2, 699));
    phones.add(new Phone("SamsungPhone 2", Brand.SAMSUNG, ConnectionType.USB_C, 3, 2500, 2.4, 899));
    phones
        .add(new Phone("SamsungPhone 3", Brand.SAMSUNG, ConnectionType.USB_C, 4, 3000, 2.6, 1099));
    phones.add(
        new Phone("ApplePhone 1", Brand.APPLE, ConnectionType.THUNDERBOLT, 3, 3000, 2.0, 1299));
    phones.add(
        new Phone("ApplePhone 2", Brand.APPLE, ConnectionType.THUNDERBOLT, 5, 3000, 2.2, 1499));
    phones.add(
        new Phone("ApplePhone 3", Brand.APPLE, ConnectionType.THUNDERBOLT, 7, 3500, 2.4, 1699));
    phones
        .add(new Phone("HuaweiPhone 1", Brand.HUAWEI, ConnectionType.USB_MICRO, 3, 2500, 2.7, 900));
    phones.add(new Phone("HuaweiPhone 2", Brand.HUAWEI, ConnectionType.USB_C, 3, 2000, 2.4, 500));
    phones.add(
        new Phone("HuaweiPhone 3", Brand.HUAWEI, ConnectionType.USB_MICRO, 3, 3000, 2.8, 1100));
    phones.add(new Phone("HuaweiPhone 4", Brand.HUAWEI, ConnectionType.USB_C, 3, 2500, 2.2, 1300));
    phones
        .add(new Phone("HuaweiPhone 5", Brand.HUAWEI, ConnectionType.USB_MICRO, 3, 3000, 2.9, 600));
    return phones;
  }

}
