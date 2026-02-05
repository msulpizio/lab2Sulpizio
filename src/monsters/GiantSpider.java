package monsters;

import java.util.Date;

/** Project: Lab 2 Monsters
 * Purpose Details: Concrete sealed child class representing a Giant Spider.
 * Course:
 * Author:
 * Date Developed:
 * Last Date Changed:
 * Rev:
 */
public final class GiantSpider extends Monster {

    /** Number of webs currently available to shoot. */
    private int webCount;

    /**
     * Constructs a GiantSpider.
     *
     * @param id Unique monster id
     * @param name Monster name
     * @param level Monster level
     * @param health Monster health
     * @param createdDate Date created
     * @param webCount webs available
     */
    public GiantSpider(String id, String name, int level, int health, Date createdDate, int webCount) {
        super(id, name, level, health, createdDate);
        this.webCount = webCount;
    }

    /**
     * Gets web count.
     * @return webCount
     */
    public int getWebCount() {
        return webCount;
    }

    /**
     * Sets web count.
     * @param webCount web count
     */
    public void setWebCount(int webCount) {
        this.webCount = webCount;
    }

    /**
     * Prints the special power behavior for a Giant Spider.
     */
    @Override
    public void specialPowers() {
        System.out.println("Giant Spider " + getName() + " activates " + getSpecialPower() +
                " and fires sticky silk. (webCount=" + webCount + ")");
    }
}