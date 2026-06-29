package exams2.queries.phonestore;

/**
 * Represents a charging and data connection type of a smartphone.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum ConnectionType {

   THUNDERBOLT("Thunderbolt", true), USB_C("USB C", true), USB_MICRO("USB Micro", false);

   private final String description;
   private final boolean isModern;

   /**
    * Creates a connection type enum constant with the given description and modernity flag.
    *
    * @param description the human-readable name of this connection type
    * @param isModern    whether this connection type is considered modern
    */
   ConnectionType(String description, boolean isModern) {
      this.description = description;
      this.isModern = isModern;
   }

   /** Returns the human-readable description of this connection type. */
   public String description() {
      return description;
   }

   /** Returns whether this connection type is considered modern. */
   public boolean isModern() {
      return isModern;
   }

}
