package Game;

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
       this.player = new Character();

    }

}

