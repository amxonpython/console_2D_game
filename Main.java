import javax.swing.*;

import core.Management;
import world.*;

public class Main {
    public static World world1 = new World();

    public static void main(String[] args) {
        world1.simulation_of_the_world("start");

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
            world1.limiter = true;
            Management.request ("Down", world1.expectation);
        });

        buttonUp.addActionListener(e -> {
            //вверх
            world1.limiter = true;
            Management.request ("up", world1.expectation);
        });

        buttonLeft.addActionListener(e -> {
            //влево
            world1.limiter = true;
            Management.request("left", world1.expectation);
        });

        buttonReally.addActionListener(e -> {
            //вправо
            world1.limiter = true;
            Management.request("Really", world1.expectation);
        });

        frame.add(buttonReally);
        frame.add(buttonLeft);
        frame.add(buttonDown);
        frame.add(buttonUp);

        frame.setSize(800, 600); // ширина и высота
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
