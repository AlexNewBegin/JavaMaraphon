package day7;

import java.util.Random;

/**
 * @author Aleksandr Labuta  28.12.2022
 */
public class Player {
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;
    private int stamina;

    public Player() {
        Random rnd = new Random();
        stamina = rnd.nextInt(11) + 90;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные. На поле еще " + (6 - countPlayers) + " мест.");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == 0) return;
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }
}
