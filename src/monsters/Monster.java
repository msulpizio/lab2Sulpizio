package monsters;

import java.util.Date;

/** Project: Lab 2 Monsters
 * Purpose Details: Abstract sealed parent class for all monsters.
 * Course:
 * Author:
 * Date Developed:
 * Last Date Changed:
 * Rev:
 */
public abstract sealed class Monster permits Gargoyle, SwampMonster, GiantSpider {

    /** Unique id for the monster. */
    private String id;

    /** Display name of the monster. */
    private String name;

    /** Monster level (difficulty). */
    private int level;

    /** Current health points. */
    private int health;

    /** Date this monster was created/born in the game. */
    private Date createdDate;

    /** The monster's special power (set using enum). */
    private MonsterPower specialPower;

    /**
     * Constructs a Monster and sets core characteristics.
     *
     * @param id Unique monster id
     * @param name Monster name
     * @param level Monster level
     * @param health Monster health
     * @param createdDate Date created
     */
    public Monster(String id, String name, int level, int health, Date createdDate) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.health = health;
        this.createdDate = createdDate;
    }

    /**
     * Gets the monster id.
     * @return monster id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the monster id.
     * @param id monster id
     */
    public void setId(String id) {
        this.id = id;
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
     * Gets the created date.
     * @return created date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the created date.
     * @param createdDate created date
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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