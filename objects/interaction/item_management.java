package objects.interaction;
import objects.bandage.bandage;

public class item_management {
    public static void name_request(int id){
        switch (id){
            case 0:
                System.out.println("бинт");
                break;
        }
    }
    public static void interaction(int args){
        if (args == 0){
            bandage.functional_public_class();
        }
    }
}