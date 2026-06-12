package world;

import NPS.zombie.*;
import objects.bandage.bandage;
import player.*;

import java.util.Objects;

public class World {

    public static int size = 10;
    public static int tick = 0;

    public boolean limiter = false;

    public void simulation_of_the_world(String pressed) {


        Thread threadWorld = new Thread(() ->{
            boolean working = true;
            parameters_player.standard_settings();

            zombie z1 = new zombie();
            bandage b1 = new bandage();

            while (working) {
                matrix.filling();
                sleep();

                b1.create(7, 4);

                if (parameters_player.HP <= 0) {
                    working = false;
                    System.out.println("вы умерли");
                    break;
                }
                matrix.setka[player.coordinate_y][player.coordinate_x] = "@";
                matrix.show();
                sleep();

                System.out.println("здоровье: " + parameters_player.HP);
                System.out.println("тик: " + tick);


                if (!Objects.equals(pressed, "start") && limiter){
                    z1.NPS();

                    player.movement(pressed);
                    limiter = false;
                    tick++;
                }
                if (pressed.equals("exit")) {
                    working = false;
                }

            }
        });
        threadWorld.start();
    }

    public static void error_The_border_of_the_world(){
        System.out.println("достигрута граница мира");
    }

    public static void sleep(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
