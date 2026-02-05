package monsters;

import java.util.Date;

/** Project: Lab 2 Monsters
 * Purpose Details: Concrete sealed child class representing a monsters.Gargoyle.
 * Course:
 * Author:
 * Date Developed:
 * Last Date Changed:
 * Rev:
 */
public final class Gargoyle extends Monster {

    /** Whether the gargoyle can fly. */
    private boolean canFly;

    /**
     * Constructs a monsters.Gargoyle.
     *
     * @param id Unique monster id
     * @param name Monster name
     * @param level Monster level
     * @param health Monster health
     * @param createdDate Date created
     * @param canFly true if gargoyle can fly
     */
    public Gargoyle(String id, String name, int level, int health, Date createdDate, boolean canFly) {
        super(id, name, level, health, createdDate);
        this.canFly = canFly;
    }

    /**
     * Gets whether the gargoyle can fly.
     * @return canFly
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * Sets whether the gargoyle can fly.
     * @param canFly canFly
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    /**
     * Prints the special power behavior for a monsters.Gargoyle.
     */
    @Override
    public void specialPowers() {
        System.out.println("monsters.Gargoyle " + getName() + " uses " + getSpecialPower() +
                " while perched on a rooftop. (canFly=" + canFly + ")");
    }
}