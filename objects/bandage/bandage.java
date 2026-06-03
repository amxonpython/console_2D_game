package objects.bandage;

import java.util.Scanner;

import player.*;
import world.*;
import objects.data.data;

public class bandage {
    public int id = 0;
    public String name = "бинт";
    public int restoration = 5;

    //по идее эта строчка должна указывать то сколько максимум этого предмета может содержаться в 1 слоте
    int the_maximum_is_contained_in_the_slot = inventory.total_slots;

    //это код отвечает за сам функционал объекта при его использовании
    public void functional (){
        int restoration = 5;

        if (parameters_player.HP + restoration <= parameters_player.full_HP){
            parameters_player.HP = (parameters_player.HP + restoration);
        }
    }

    public static void functional_public_class (){
        int restoration = 5;

        if (parameters_player.HP + restoration <= parameters_player.full_HP){
            parameters_player.HP = (parameters_player.HP + restoration);
        }else {
            parameters_player.HP = parameters_player.full_HP;
        }
    }

    public void create(int coordinate_y, int coordinate_x, int number){
        Scanner scanner = new Scanner(System.in);
        boolean the_object_s_existence = data.the_object_s_existence_b[number];

        if (data.the_object_s_existence_b[number]){
            matrix.setka[coordinate_y][coordinate_x] = "+";

            if (world.tick == 0){
                data.coordinate_x_b[number] = coordinate_x;
                data.coordinate_Y_b[number] = coordinate_y;
                data.Was_there_a_tick_in_the_past_b[number] = true;
                data.the_object_s_existence_b[number] = true;
            }
            if (the_object_s_existence){
                if (coordinate_x == player.coordinate_x && coordinate_y == player.coordinate_y){
                    System.out.println("нажмите y поднять или Enter что-бы не трогать");
                    String port = scanner.nextLine();
                    if (port.equals("y")){
                        for (int i = 0; i < inventory.total_slots; i++){
                            if (!inventory.slot_occupancy[i]){
                                inventory.Take_an_item(0);
                                data.the_object_s_existence_b[number] = false;
                                matrix.setka[coordinate_y][coordinate_x] = "@";
                                break;
                            }
                            if (inventory.slot_occupancy[i] && i + 1 == inventory.total_slots){
                                System.out.println("инвентарь занят");
                            }
                        }
                    }
                }
                if (world.tick > 0){
                    coordinate_x = data.coordinate_x_b[number];
                    coordinate_y = data.coordinate_Y_b[number];
                    the_object_s_existence = data.the_object_s_existence_b[number];
                }
            }
        }
    }
}
