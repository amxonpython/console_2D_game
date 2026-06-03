package NPS.zombie;
import objects.data.data;
import player.*;
import world.*;

public class zombie {

    public int Attack_power = 1;

    public void attack(){
        parameters_player.damag(Attack_power);
    }

    public void Spawn(boolean NPC, int coordinate_y, int coordinate_x, int number){
        if (!data.Was_there_a_tick_in_the_past_z[number]){
            data.coordinate_x_z[number] = coordinate_x;
            data.coordinate_y_z[number] = coordinate_y;
            data.Was_there_a_tick_in_the_past_z[number] = true;
        }

        coordinate_x = data.coordinate_x_z[number];
        coordinate_y = data.coordinate_y_z[number];

        if (NPC){
            matrix.setka[data.coordinate_y_z[number]][data.coordinate_x_z[number]] = "&";

            if (coordinate_x == player.coordinate_x && coordinate_y == player.coordinate_y){
                attack();
            }else {
                if (coordinate_x > player.coordinate_x && coordinate_x - 1 >= 0) {
                    coordinate_x--;
                }
                if (coordinate_x < player.coordinate_x && coordinate_x + 1 <= world.size){
                    coordinate_x++;
                }

                if (coordinate_y > player.coordinate_y && coordinate_y - 1 >= 0){
                    coordinate_y--;
                }
                if (coordinate_y < player.coordinate_y && coordinate_y + 1 <= world.size) {
                    coordinate_y++;
                }
            }
        }
        data.coordinate_x_z[number] = coordinate_x;
        data.coordinate_y_z[number] = coordinate_y;
        data.Was_there_a_tick_in_the_past_z[number] = true;

    }
}
