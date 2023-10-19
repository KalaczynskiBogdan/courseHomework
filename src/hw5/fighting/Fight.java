package hw5.fighting;

import java.util.Random;

public class Fight {
    Random random = new Random();

    public void makeDamage(Fighter fighter1, Fighter fighter2) {
        for (int i = 0; i < fighter1.stamina; i++) {
            System.out.println(fighter1.name + " has stamina " + fighter1.stamina + ", so he causing damage " +
                    fighter1.stamina + " times");
            int damage = random.nextInt(1, 100);
            int totalDamage = damage + fighter1.strength;
            System.out.println("Damage: " + damage + " + strength of a hero: " + fighter1.strength + ", total = " + totalDamage);
            fighter2.hp = fighter2.hp - (totalDamage);
            System.out.println(fighter2.name + "' health = " + fighter2.hp);
            if (fighter2.hp <= 0) {
                break;
            }
        }
    }
}
