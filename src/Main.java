import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int playerLives = 4;
    static Player winner;

    public static void main(String[] args) {
        int playerCount;
        boolean gameFinished = false;
        LinkedList<Player> players = new LinkedList<>();
        //1-ask P count
        playerCount = Integer.parseInt(getUserInput("Wie viele Spieler spielen mit?"));
        //2-ask P info & word
        for (int i = 1; i <= playerCount; i++) {
            System.out.println("create player " + i);
            players.add(createPLayer(i));
        }
        //3- play
        while (!gameFinished) {

            gameFinished = playerTurn(players);
        }
        //4- declare winner

    }

    public static Boolean playerTurn(LinkedList<Player> players) {
        Player questionedPlayer = players.pop();
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("questionee : " + questionedPlayer);


        return false;
    }

    private LinkedList<Player> questionPlayer(Player questionee, LinkedList<Player> players) {
        return players;
    }

    public static Player createPLayer(int id) {
        String name = getUserInput("Was ist der name für Spieler " + id + "?");
        String word = getUserInput("Bitte wähle ein Wort für " + name);
        int lives = Main.playerLives;

        return new Player(name, word, lives);
    }

    public static String getUserInput(String question) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String result;
        System.out.println(question);
        result = scanner.next();
        return result;
    }
}
