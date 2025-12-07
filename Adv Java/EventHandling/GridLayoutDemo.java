
package EventHandling;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {

    JButton red, blue, green, black, white, cyan;

    public GridLayoutDemo() {
        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");
        black = new JButton("Black");
        white = new JButton("White");
        cyan = new JButton("Cyan");
        setVisible(true);
        setSize(300, 300);
        setTitle("GridLayout Demo");
        setLayout(new GridLayout(2, 3));
        add(red);
        add(blue);
        add(green);
        add(black);
        add(white);
        add(cyan);
    }

    public static void main(String[] args) {
        GridLayoutDemo obj = new GridLayoutDemo();
    }
}