package Pacman;

import javax.swing.*;
import java.awt.*;

public class Pacman extends JFrame {

    Pacman(){
        initUi();
    }

    private void initUi() {
        add(new Board());
        setTitle("Pacman");
        setSize(380,420);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->{ // it is used for more complex games
            //it doesn't allow system to execute future events before executing previous ones
            Pacman ex = new Pacman();
            ex.setVisible(true);
        });
    }
}
