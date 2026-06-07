import player.parameters_player;
import world.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        world.simulation_of_the_world();
        if (parameters_player.HP <= 0) {
            System.out.println("вы умерли");
        }
    }
}
