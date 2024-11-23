package scenarios;

import characters.Character;

public class Battle implements Scenario{

    @Override
    public void execute(Character character) {
        character.getAttack();
        character.setAttack(29);

        System.out.println("The Battle has started with" + character.getName());
        System.out.println("The fighter recieved damage");
        System.out.println("The Battle has ended by the winner");

    }


    }
