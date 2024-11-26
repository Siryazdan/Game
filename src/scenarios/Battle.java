package scenarios;

import characters.Character;

public class Battle implements Scenario {
    private int enemyStrength;

    public Battle(int enemyStrength) {
        this.enemyStrength = enemyStrength;
    }

    @Override
    public void execute(Character character) {
        int characterStrength = character.getStrength();
        System.out.println("The battle begins!");

        if (characterStrength >= enemyStrength) {
            System.out.println("You are victorious! You defeated the enemy.");

        } else {

            System.out.println("You have been defeated! The enemy was too strong.");


        }


    }
}
