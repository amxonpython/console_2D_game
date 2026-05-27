import world.*;
import player.*;

import java.util.Scanner;

public class Main {
    public static String action;
    public static void main(String[] args){
        boolean working = true;
        Scanner scanner = new Scanner(System.in);
        parameters_player.standard_settings();

        while (working){
            if (parameters_player.HP <= 0){
                System.out.println("вы умерли");
                working = false;
            }

            int tick = world.tick;

            world.world();
            System.out.println("здоровье: " + parameters_player.HP);
            System.out.println("тик: " + tick);
            action = scanner.nextLine();
            player.movement(action);

        }
    }
}