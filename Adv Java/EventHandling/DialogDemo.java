
package EventHandling;

import javax.swing.JDialog;

public class DialogDemo {

    JDialog obj;

    public DialogDemo()
    {
        obj = new JDialog();
        obj.setTitle("JDialog Demo");
        obj.setVisible(true);
        obj.setSize(300, 150);
    }

    public static void main(String[] args) {
        DialogDemo dobj = new DialogDemo();
    }
}