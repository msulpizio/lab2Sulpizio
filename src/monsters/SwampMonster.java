package monsters;

import java.util.Date;

/** Project: Lab 2 Monsters
 * Purpose Details: Concrete sealed child class representing a Swamp Monster.
 * Course:
 * Author:
 * Date Developed:
 * Last Date Changed:
 * Rev:
 */
public final class SwampMonster extends Monster {

    /** Swamp thickness level where it lives (higher = murkier). */
    private int swampMurkLevel;

    /**
     * Constructs a SwampMonster.
     *
     * @param id Unique monster id
     * @param name Monster name
     * @param level Monster level
     * @param health Monster health
     * @param createdDate Date created
     * @param swampMurkLevel murk level
     */
    public SwampMonster(String id, String name, int level, int health, Date createdDate, int swampMurkLevel) {
        super(id, name, level, health, createdDate);
        this.swampMurkLevel = swampMurkLevel;
    }

    /**
     * Gets swamp murk level.
     * @return swampMurkLevel
     */
    public int getSwampMurkLevel() {
        return swampMurkLevel;
    }

    /**
     * Sets swamp murk level.
     * @param swampMurkLevel swamp murk level
     */
    public void setSwampMurkLevel(int swampMurkLevel) {
        this.swampMurkLevel = swampMurkLevel;
    }

    /**
     * Prints the special power behavior for a Swamp Monster.
     */
    @Override
    public void specialPowers() {
        System.out.println("Swamp Monster " + getName() + " unleashes " + getSpecialPower() +
                " from the murky waters. (murkLevel=" + swampMurkLevel + ")");
    }
}