package exams2.tank;

import java.util.ArrayList;
import java.util.List;

/**
 * Panzer
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Tanks {

  public static List<Tank> getTanks() {
    List<Tank> tanks = new ArrayList<Tank>();

    tanks.add(new Tank("Leopard", Type.BATTLE_TANK, Nation.GER, 830, 39, 6.91, 65));
    tanks.add(new Tank("103 S", Type.BATTLE_TANK, Nation.SWE, 570, 37, 5.5, 50));
    tanks.add(new Tank("K Sf M 107", Type.ARTILLERY_TANK, Nation.USA, 420, 28, 6.5, 50));
    tanks.add(new Tank("T 34/85", Type.WORLD_WAR_II_TANK, Nation.CHN, 500, 32, 6.07, 53));
    tanks.add(new Tank("AMX V.T.P. M 56 Typ A", Type.SHIELD_TANK, Nation.FRA, 250, 12, 5.54, 65));

    return tanks;
  }

}
