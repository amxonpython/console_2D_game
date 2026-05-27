package player;

public class parameters_player {
    String name;
    public static int HP;
    public static int hunger;
    public static int full_hunger;
    public static int full_HP;
    public static int speed;

    public static void standard_settings(){
        parameters_player.HP = 9;
        parameters_player.hunger = 9;
        parameters_player.full_hunger = 9;
        parameters_player.full_HP = 9;
        parameters_player.speed = 1;
    }
    public static void damag(int args){
        HP = (HP - args);
    }
}