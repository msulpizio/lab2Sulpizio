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

public final class SwampMonster extends Monster {

    /** Armor durability of scales). */
    private int scaleArmorLevel;

    /**
     * Constructs a SwampMonster.
     *
     * @param name Monster name
     * @param level Monster level
     * @param health Monster health
     * @param scaleArmorLevel scale armor level
     */
    public SwampMonster(String name, int level, int health, int scaleArmorLevel) {
        super(name, level, health);
        this.scaleArmorLevel = scaleArmorLevel;
    }

    /**
     * Gets scale armor level.
     * @return scaleArmorLevel scale armor level
     */
    public int getScaleArmorLevel() {
        return scaleArmorLevel;
    }

    /**
     * Sets scale armor level.
     * @param scaleArmorLevel scale armor level
     */
    public void setScaleArmorLevel(int scaleArmorLevel) {
        this.scaleArmorLevel = scaleArmorLevel;
    }

    /**
     * Prints the special power behavior for a Swamp Monster.
     */
    @Override
    public void specialPowers() {
        System.out.println("Swamp Monster " + getName() + " uses " + getSpecialPower() +
                " from the swamp waters. (Armor Scale Level = " + scaleArmorLevel + ")");
    }
}