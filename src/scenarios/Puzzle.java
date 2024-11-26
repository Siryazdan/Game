package scenarios;

import characters.Character;

import java.util.Scanner;

public class Puzzle implements Scenario {

    private String question;
    private String answer;

    public Puzzle(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public void execute(Character character) {
        Scanner scanner = new Scanner(System.in);

        String playerAnswer = scanner.nextLine();

        if (playerAnswer.equalsIgnoreCase(answer)) {
            System.out.println("Correct! Now you can fight with the weapon");
        } else {
            System.out.println("Wrong! you need to choose better next time");
        }
        scanner.close();

    }
}
