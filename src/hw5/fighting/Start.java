package hw5.fighting;

public class Start {
    Fight fight = new Fight();

    public void start(Fighter fighter1, Fighter fighter2) {
        System.out.println("_____FIGHT IS STARTING_____");
        System.out.println("");
        while (fighter1.hp > 0 || fighter2.hp > 0) {
            System.out.println(fighter1.name + " IS MAKING DAMAGE");
            fight.makeDamage(fighter1, fighter2);
            System.out.println("");
            if (fighter2.hp <= 0) {
                break;
            }
            System.out.println(fighter2.name + " IS MAKING DAMAGE");
            fight.makeDamage(fighter2, fighter1);
            System.out.println("");
            if (fighter1.hp <= 0) {
                break;
            }
        }
        if (fighter1.hp > 0) {
            System.out.println(fighter1.name + " IS WINNER");
        } else if (fighter2.hp > 0) {
            System.out.println(fighter2.name + " IS WINNER");
        }
    }
}
