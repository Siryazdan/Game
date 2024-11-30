package scenarios;

import characters.Character;

public class Battle implements Scenario {
    private int enemyStrength;
    private int enemyHealth;

    public Battle(int enemyStrength, int enemyHealth) {
        this.enemyStrength = enemyStrength;
        this.enemyHealth = enemyHealth;
    }

    @Override
    public void execute(Character character) {

        while (enemyHealth > 0 && character.getHealth() > 0){
            System.out.println("Character attacks enemy");
        }
       enemyHealth -= character.getHealth();
       if (enemyHealth> 0){
           System.out.println("enermy attacks player");
           character.setHealth(character.getHealth());


        }else {
           System.out.println("Enemy dies...");
       }


    }
}
