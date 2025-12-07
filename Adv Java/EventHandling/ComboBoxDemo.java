
package EventHandling;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComboBoxDemo extends JFrame {

    JPanel jp;
    JComboBox city;

    public ComboBoxDemo() {
        jp = new JPanel();
        city = new JComboBox();
        city.addItem("California");
        city.addItem("Florida");
        city.addItem("Montanan");
        city.addItem("New York");
        city.addItem("Oklahoma");
        jp.add(city);
        setTitle("JComboBox Demo");
        setVisible(true);
        setSize(300, 200);
        add(jp);
    }

    public static void main(String[] args) {
        ComboBoxDemo cobj = new ComboBoxDemo();
    }

}
