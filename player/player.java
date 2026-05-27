package player;

import world.*;

public class player {

    public static int coordinate_x = 5;
    public static int coordinate_y = 5;

    public static void movement (String args){
        switch (args){
            case "a":
                if (coordinate_x - parameters_player.speed >= 0){
                    coordinate_x = (coordinate_x - parameters_player.speed);
                }else {
                    world.error_The_border_of_the_world();
                }
                break;

            case "d":
                if (coordinate_x + parameters_player.speed < world.size) {
                    coordinate_x = (coordinate_x + parameters_player.speed);
                }else {
                    world.error_The_border_of_the_world();
                }
                break;

            case "s":
                if (coordinate_y + parameters_player.speed < world.size){
                    coordinate_y = (coordinate_y + parameters_player.speed);
                }else {
                    world.error_The_border_of_the_world();
                }
                break;

            case "w":
                if (coordinate_y - parameters_player.speed >= 0){
                    coordinate_y = (coordinate_y - parameters_player.speed);
                }else {
                    world.error_The_border_of_the_world();
                }
                break;

            case "e", "E":
                inventory.interaction();
                break;

        }
    }
}