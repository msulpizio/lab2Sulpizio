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

/**
 * Driver class for the Monsters Lab.
 */
public class Main {

    /**
     * Constructs the Main driver class.
     */
    public Main() {
    }

    /**
     * Program entry point.
     * @param args command-line args
     */
    public static void main(String[] args) {

        // 2 Swamp Monsters
        Monster swamp1 = new SwampMonster("Slimy", 5, 120, 8);
        Monster swamp2 = new SwampMonster("Gilly", 7, 150, 10);

        // 2 Giant Spiders
        Monster spider1 = new GiantSpider("Silky", 4, 90, 12);
        Monster spider2 = new GiantSpider("Fangs", 6, 110, 20);

        // 1 Gargoyle
        Monster gargoyle1 = new Gargoyle("Greg", 8, 180, 25);

        // Set special powers
        swamp1.setSpecialPower(MonsterPower.SLIME_SPLASH);
        swamp2.setSpecialPower(MonsterPower.ACID_SPIT);

        spider1.setSpecialPower(MonsterPower.WEB_TRAP);
        spider2.setSpecialPower(MonsterPower.POISON_BITE);

        gargoyle1.setSpecialPower(MonsterPower.WIND_THRUST);

        // Print full characteristics of all 5 monsters
        System.out.println("CHARACTERISTICS:");
        printMonsterDetails(swamp1);
        printMonsterDetails(swamp2);
        printMonsterDetails(spider1);
        printMonsterDetails(spider2);
        printMonsterDetails(gargoyle1);

        // Print special powers
        System.out.println("\nSPECIAL POWERS:");
        printPower(swamp1);
        swamp1.specialPowers();

        printPower(swamp2);
        swamp2.specialPowers();

        printPower(spider1);
        spider1.specialPowers();

        printPower(spider2);
        spider2.specialPowers();

        printPower(gargoyle1);
        gargoyle1.specialPowers();
    }

    /**
     * Prints a monster's full characteristics using getters.
     * @param monster monster object
     */
    private static void printMonsterDetails(Monster monster) {
        System.out.println("Type: " + monster.getClass().getSimpleName());
        System.out.println("Name: " + monster.getName());
        System.out.println("Level: " + monster.getLevel());
        System.out.println("Health: " + monster.getHealth());
        System.out.println("Special Power: " + monster.getSpecialPower());

        // Print child-specific fields
        if (monster instanceof SwampMonster sm) {
            System.out.println("Scale Armor Level: " + sm.getScaleArmorLevel());
        } else if (monster instanceof GiantSpider gs) {
            System.out.println("Web Count: " + gs.getWebCount());
        } else if (monster instanceof Gargoyle g) {
            System.out.println("Flight Stamina: " + g.getFlightStamina());
        }
    }

    /**
     * Prints monster power using getter.
     * @param monster monster object
     */
    private static void printPower(Monster monster) {
        System.out.println(monster.getName() + "'s special power: " + monster.getSpecialPower());
    }
}