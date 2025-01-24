package exams2.queries.phonestore;

/**
 * Verbindungstyp
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum ConnectionType {

   THUNDERBOLT("Thunderbolt", true), USB_C("USB C", true), USB_MICRO("USB Micro", false);

   private final String description;
   private final boolean isModern;

   ConnectionType(String description, boolean isModern) {
      this.description = description;
      this.isModern = isModern;
   }

   public String description() {
      return description;
   }

   public boolean isModern() {
      return isModern;
   }

}
