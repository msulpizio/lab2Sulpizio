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

public abstract sealed class Monster permits Gargoyle, SwampMonster, GiantSpider {

    /** Display name of the monster. */
    private String name;

    /** Monster level (difficulty). */
    private int level;

    /** Current health points. */
    private int health;

    /** The monster's special power (set using enum). */
    private MonsterPower specialPower;

    /**
     * Constructs a Monster and sets core characteristics.
     *
     * @param name Monster name
     * @param level Monster level
     * @param health Monster health
     */
    public Monster(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    /**
     * Gets the monster name.
     * @return monster name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the monster name.
     * @param name monster name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the monster level.
     * @return monster level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the monster level.
     * @param level monster level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets the monster health.
     * @return monster health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the monster health.
     * @param health monster health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the monster special power.
     * @return special power enum
     */
    public MonsterPower getSpecialPower() {
        return specialPower;
    }

    /**
     * Sets the monster special power.
     * @param specialPower special power enum
     */
    public void setSpecialPower(MonsterPower specialPower) {
        this.specialPower = specialPower;
    }

    /**
     * Polymorphic behavior: each concrete monster prints how its special power works.
     */
    public abstract void specialPowers();
}