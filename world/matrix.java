package world;

public class matrix {
   public static String[][] setka = new String[world.size][world.size];

    public static void filling(){
        for (int i = 0; i<world.size; i++){
            for (int j = 0; j<world.size; j++){
                setka[i][j] = "#";
            }
        }
    }

    public static void show(){
        for (int i = 0; i<world.size; i++){
            for (int j = 0; j<world.size; j++){
                System.out.print(setka[i][j]);
            }
            System.out.println();
        }
    }
}