package world;

import NPS.zombie.*;
import objects.bandage.bandage;
import objects.data.data;
import player.*;

public class world {

    public static int size = 10;
    public static int tick = 0;

    public static void world(){
        if (tick == 0){
            data.arf();
        }
        zombie z1 = new zombie();
        bandage b1 = new bandage();

        matrix.filling();

        matrix.setka[player.coordinate_y][player.coordinate_x] = "@";
        b1.create(7, 4, 1);
        z1.Spawn(true, 0, 0, 1);
        matrix.show();
        tick++;
    }

    public static void error_The_border_of_the_world(){
        System.out.println("достигрута граница мира");
    }
}
