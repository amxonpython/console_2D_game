package player;

import java.util.Scanner;

import objects.data.*;

//указывать нужно id предмета
public class inventory {
    public static int standard_capacity = 16;

    public static int total_slots = 5;

    public static int[] slot = new int[total_slots];
    public static boolean[] slot_occupancy = new boolean[total_slots];

    //будет использоваться для быстрого доступа
    int hand;
    int left_hand;

    public static void interaction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("выберите ячейку с предметом для использования: ");
        int sloat_ID = scanner.nextByte();

        if (sloat_ID <= total_slots && sloat_ID >= 0 && slot_occupancy[sloat_ID]) {
            using_objects.using_an_object_by_ID(slot[sloat_ID]);
        }
    }

    public static void Take_an_item(int Item_ID) {
        for (int i = 0; i < total_slots; i++) {
            if (!slot_occupancy[i]) {
                slot[i] = Item_ID;
                slot_occupancy[i] = true;
                break;
            }
        }
    }
}