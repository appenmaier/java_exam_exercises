package exams2.classdiagrams.roboterfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Unit tests for the RoboterFactory class.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class RoboterFactoryTest {

   @Mock
   Terminator t800;
   @Mock
   Terminator t1000;
   RoboterFactory<Terminator> factory;

   @BeforeEach
   void setup() {
      MockitoAnnotations.openMocks(this);

      factory = new RoboterFactory<>(new HashMap<>());
      factory.roboters().put("800-1", t800);
      factory.roboters().put("1000-1", t1000);
   }

   /** Verifies that retrieving a robot by serial number returns the correct robot or empty. */
   @Test
   void testGetRoboterBySerialNumber() {
      assertEquals(Optional.empty(), factory.getRoboterBySerialNumber("1000-0"));
      assertEquals(Optional.of(t1000), factory.getRoboterBySerialNumber("1000-1"));
   }

   /** Verifies that retrieving robots by fabrication year returns the correct result. */
   @Test
   void testGetRobotersByFabricationYear() {
      when(t800.getFabricationDate()).thenReturn(LocalDate.parse("2029-03-24"));
      when(t1000.getFabricationDate()).thenReturn(LocalDate.parse("2032-07-12"));
      assertEquals(t800, factory.getRobotersByFabricationYear(2029).getFirst());
   }

}
