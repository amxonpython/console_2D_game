package world;

import NPS.zombie.*;
import objects.bandage.bandage;
import player.*;

import java.util.Scanner;

public class world {

    public static int size = 10;
    public static int tick = 0;

    public static String action;

    public static void simulation_of_the_world() {

        boolean working = true;
        Scanner scanner = new Scanner(System.in);
        parameters_player.standard_settings();

        zombie z1 = new zombie();
        bandage b1 = new bandage();

        while (working) {
            matrix.filling();
            b1.create(7, 4);

            if (parameters_player.HP <= 0) {
                working = false;
                break;
            }

            z1.NPS();
            matrix.setka[player.coordinate_y][player.coordinate_x] = "@";

            matrix.show();

            System.out.println("здоровье: " + parameters_player.HP);
            System.out.println("тик: " + tick);
            action = scanner.nextLine();
            player.movement(action);

            if (action.equals("exit")) {
                working = false;
            }
            tick++;
        }
    }

    public static void error_The_border_of_the_world(){
        System.out.println("достигрута граница мира");
    }
}
