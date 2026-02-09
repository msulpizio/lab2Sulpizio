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

public final class GiantSpider extends Monster {

    /** Number of webs currently available to shoot. */
    private int webCount;

    /**
     * Constructs a GiantSpider.
     *
     * @param name Monster name
     * @param level Monster level
     * @param health Monster health
     * @param webCount webs available
     */
    public GiantSpider(String name, int level, int health, int webCount) {
        super(name, level, health);
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
        System.out.println("Giant Spider " + getName() + " uses " + getSpecialPower() +
                " and shoots its webs. (Web Count = " + webCount + ")");
    }
}