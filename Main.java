import javax.swing.*;
import world.*;

public class Main {
    public static World world = new World();
    public static void main(String[] args) {

        world.simulation_of_the_world("start");

        JFrame frame = new JFrame("Моё окно");

        frame.setLayout(null);

        JButton buttonDown = new JButton("Down");
        JButton buttonUp = new JButton("up");
        JButton buttonReally = new JButton(">");
        JButton buttonLeft = new JButton("<");

        buttonDown.setBounds(300, 400, 100, 50);
        buttonUp.setBounds(300, 300, 100, 50);
        buttonLeft.setBounds(230, 350, 50, 50);
        buttonReally.setBounds(420, 350, 50, 50);

        buttonDown.addActionListener(e -> {
            //вниз
            world.limiter = true;
            signalManagement("Down");
        });

        buttonUp.addActionListener(e -> {
            //вверх
            world.limiter = true;
            signalManagement("up");
        });

        buttonLeft.addActionListener(e -> {
            //влево
            world.limiter = true;
            signalManagement("left");
        });

        buttonReally.addActionListener(e -> {
            //вправо
            world.limiter = true;
            signalManagement("Really");
        });

        frame.add(buttonReally);
        frame.add(buttonLeft);
        frame.add(buttonDown);
        frame.add(buttonUp);

        frame.setSize(800, 600); // ширина и высота
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void signalManagement(String action){
        boolean work = true;
        while (work){
            if (world.expectation){
                world.simulation_of_the_world(action);
                work = false;
            }
        }
    }
}
