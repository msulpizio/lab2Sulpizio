package monsters;

import java.util.Date;

/** Project: Lab 2 Monsters
 * Purpose Details: Creates monster objects, sets special powers, and prints characteristics.
 * Course:
 * Author:
 * Date Developed:
 * Last Date Changed:
 * Rev:
 */
public class Main {

    /**
     * Program entry point.
     * @param args command-line args
     */
    public static void main(String[] args) {

        // 2 Swamp Monsters
        Monster swamp1 = new SwampMonster("SM-001", "Mireclaw", 5, 120, new Date(), 8);
        Monster swamp2 = new SwampMonster("SM-002", "Bogmaw", 7, 150, new Date(), 10);

        // 2 Giant Spiders
        Monster spider1 = new GiantSpider("GS-001", "Silkfang", 4, 90, new Date(), 12);
        Monster spider2 = new GiantSpider("GS-002", "Webreaper", 6, 110, new Date(), 20);

        // 1 monsters.Gargoyle
        Monster gargoyle1 = new Gargoyle("GA-001", "Nightstone", 8, 180, new Date(), true);

        // Set special powers using setters (all 5)
        swamp1.setSpecialPower(MonsterPower.REGENERATION);
        swamp2.setSpecialPower(MonsterPower.ACID_SPIT);

        spider1.setSpecialPower(MonsterPower.WEB_TRAP);
        spider2.setSpecialPower(MonsterPower.POISON_BITE);

        gargoyle1.setSpecialPower(MonsterPower.STONE_GAZE);

        // Print full characteristics of all 5 monsters using getter methods
        System.out.println("=== MONSTER CHARACTERISTICS ===");
        printMonsterDetails(swamp1);
        printMonsterDetails(swamp2);
        printMonsterDetails(spider1);
        printMonsterDetails(spider2);
        printMonsterDetails(gargoyle1);

        // Print special powers using getter + polymorphism (specialPowers implemented in each concrete class)
        System.out.println("\n=== MONSTER SPECIAL POWERS (Getter + Polymorphism) ===");
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
        System.out.println("------------------------------------");
        System.out.println("Type: " + monster.getClass().getSimpleName());
        System.out.println("ID: " + monster.getId());
        System.out.println("Name: " + monster.getName());
        System.out.println("Level: " + monster.getLevel());
        System.out.println("Health: " + monster.getHealth());
        System.out.println("Created Date: " + monster.getCreatedDate());
        System.out.println("Special Power: " + monster.getSpecialPower());

        // Print child-specific fields (still using getters)
        if (monster instanceof SwampMonster sm) {
            System.out.println("Swamp Murk Level: " + sm.getSwampMurkLevel());
        } else if (monster instanceof GiantSpider gs) {
            System.out.println("Web Count: " + gs.getWebCount());
        } else if (monster instanceof Gargoyle g) {
            System.out.println("Can Fly: " + g.isCanFly());
        }
    }

    /**
     * Prints monster power using getter.
     * @param monster monster object
     */
    private static void printPower(Monster monster) {
        System.out.println(monster.getName() + " special power is: " + monster.getSpecialPower());
    }
}