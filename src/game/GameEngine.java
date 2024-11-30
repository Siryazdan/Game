package game;

import scenarios.Battle;
import scenarios.Puzzle;
import scenarios.Scenario;
import characters.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameEngine {
    private Character player;
    private List<Scenario> scenarios = new ArrayList<>();
    private int currentScenarioIndex = 0;
    private Scanner scanner = new Scanner(System.in);

    public GameEngine() {
        this.player = new Character("The Dragon", 150, 40);
        scenarios.add(new Battle(5, 50));
        scenarios.add(new Puzzle("The answer of life, the universe and everything?", "42"));

    }

    public void startGame() {
        System.out.println("Welcome to the game!");

        boolean gameRunning = true;
        int currentScenarioIndex = 0;

        while (gameRunning && currentScenarioIndex < scenarios.size()) {
            Scenario currentScenario = scenarios.get(currentScenarioIndex);
            currentScenario.execute(player);

            if (player.getHealth() <= 0) {
                System.out.println("You are dead!");
                break;
            }
            System.out.println("Do you wish to continue? (yes/no");
            String input = scanner.nextLine();
            if ("no".equalsIgnoreCase(input)) {
                gameRunning = false;
            } else {
                currentScenarioIndex++;
            }
            if (currentScenarioIndex == scenarios.size()) {
                System.out.println("Congratulations!");
                gameRunning = false;
            }
            scanner.close();
        }


    }


}




