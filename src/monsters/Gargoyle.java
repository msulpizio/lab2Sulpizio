package monsters;

/**

 * Project: Lab 2
 * Purpose Details: Monsters
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/27/26
 * Last Date Changed: 2/8/26
 * Rev:

 */

public final class Gargoyle extends Monster {

    /** Flight stamina for how long the gargoyle can fly for */
    private int flightStamina;

    /**
     * Constructs a monsters.Gargoyle.
     *
     * @param name Monster name
     * @param level Monster level
     * @param health Monster health
     * @param flightStamina flight stamina
     */
    public Gargoyle(String name, int level, int health, int flightStamina) {
        super(name, level, health);
        this.flightStamina = flightStamina;
    }

    /**
     * Gets flight stamina.
     * @return flightStamina
     */
    public int getFlightStamina() {
        return flightStamina;
    }

    /**
     * Sets flight stamina.
     * @param flightStamina flightStamina
     */
    public void setFlightStamina(int flightStamina) {
        this.flightStamina = flightStamina;
    }

    /**
     * Prints the special power behavior for a Gargoyle.
     */
    @Override
    public void specialPowers() {
        System.out.println("Gargoyle " + getName() + " uses " + getSpecialPower() +
                " while flying through the air. (Flight Stamina = " + flightStamina + ")");
    }
}