
package EventHandling;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFeildDemo extends JFrame {

    JPanel jp;
    JTextField firstname, secondname;

    public TextFeildDemo() {
        jp = new JPanel();
        firstname = new JTextField();
        firstname.setText("Peter");
        secondname = new JTextField();
        secondname.setText("Jones");
        jp.add(firstname);
        jp.add(secondname);
        setTitle("JTextField Demo");
        setVisible(true);
        setSize(300, 200);
        add(jp);
    }

    public static void main(String[] args) {
        TextFeildDemo tobj = new TextFeildDemo();
    }
}