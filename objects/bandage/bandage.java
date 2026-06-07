package objects.bandage;

import java.util.Scanner;

import player.*;
import world.*;

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

    public boolean existence = true;

    public void create(int coordinate_y, int coordinate_x){
        if (existence){
            Scanner scanner = new Scanner(System.in);
            matrix.setka[coordinate_y][coordinate_x] = "+";
            if (coordinate_x == player.coordinate_x && coordinate_y == player.coordinate_y){
                System.out.println("нажмите y поднять или Enter что-бы не трогать");
                String port = scanner.nextLine();
                if (port.equals("y")){
                    for (int i = 0; i < inventory.total_slots; i++){
                        if (!inventory.slot_occupancy[i]){
                            inventory.Take_an_item(0);
                            matrix.setka[coordinate_y][coordinate_x] = "@";
                            existence = false;
                            break;
                        }
                        if (inventory.slot_occupancy[i] && i + 1 == inventory.total_slots){
                            System.out.println("инвентарь занят");
                        }
                    }
                }
            }
        }
    }
}
