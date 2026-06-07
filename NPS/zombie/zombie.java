package NPS.zombie;
import player.*;
import world.*;

public class zombie {
    public int coordinate_x_pub = 0;
    public int coordinate_y_pub = 0;

    public int Attack_power = 1;

    public void attack(){
        parameters_player.damag(Attack_power);
    }

    public void Spawn(int coordinate_y, int coordinate_x){
        matrix.setka[coordinate_y][coordinate_x] = "&";
        coordinate_y_pub = coordinate_y;
        coordinate_x_pub = coordinate_x;
    }
    public void NPS(){
        matrix.setka[coordinate_y_pub][coordinate_x_pub] = "&";

        if (coordinate_x_pub == player.coordinate_x && coordinate_y_pub == player.coordinate_y){
            attack();
        }else {
            if (coordinate_x_pub > player.coordinate_x && coordinate_x_pub - 1 >= 0) {
                coordinate_x_pub--;
            }
            if (coordinate_x_pub < player.coordinate_x && coordinate_x_pub + 1 <= world.size){
                coordinate_x_pub++;
            }

            if (coordinate_y_pub > player.coordinate_y && coordinate_y_pub - 1 >= 0){
                coordinate_y_pub--;
            }
            if (coordinate_y_pub < player.coordinate_y && coordinate_y_pub + 1 <= world.size) {
                coordinate_y_pub++;
            }
        }
    }
}
