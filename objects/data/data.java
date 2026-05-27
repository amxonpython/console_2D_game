package objects.data;

import player.inventory;

import world.*;
import java.util.Arrays;

public class data {
    static public int[] coordinate_x_z = new int[world.size];
    static public int[] coordinate_y_z = new int[world.size];
    static public boolean[] Was_there_a_tick_in_the_past_z = new boolean[world.size];

    static public int[] coordinate_x_b = new int[world.size];
    static public int[] coordinate_Y_b = new int[world.size];
    static public boolean[] Was_there_a_tick_in_the_past_b = new boolean[world.size];
    static public boolean[] the_object_s_existence_b = new boolean[world.size];
    public static void arf(){
        Arrays.fill(Was_there_a_tick_in_the_past_z, false);
        Arrays.fill(coordinate_x_z, -1);
        Arrays.fill(coordinate_y_z, -1);

        Arrays.fill(Was_there_a_tick_in_the_past_b, false);
        Arrays.fill(the_object_s_existence_b, true);
        Arrays.fill(coordinate_x_b, -1);
        Arrays.fill(coordinate_Y_b, -1);

        Arrays.fill(inventory.slot_occupancy, false);
        Arrays.fill(inventory.slot, -1);
    }
}