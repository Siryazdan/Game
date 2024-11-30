package scenarios;

import characters.Character;

import java.util.Scanner;

public class Puzzle implements Scenario {

    private final Scanner scanner;
    private String question;
    private String answer;

    public Puzzle(Scanner scanner, String question, String answer) {
        this.scanner = new Scanner(System.in);
        this.question = question;
        this.answer = answer;
    }

    @Override
    public void execute(Character character) {


        String playerAnswer = scanner.nextLine();

        if (playerAnswer.equalsIgnoreCase(answer)) {
            System.out.println("Correct! Now you can fight with the weapon");
        } else {
            System.out.println("Wrong! you need to choose better next time");
        }
        scanner.close();

    }
}
