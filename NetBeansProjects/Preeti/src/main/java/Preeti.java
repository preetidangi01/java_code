import java.awt.Color;
import java.awt.Frame;
public class Preeti {

    public static void main(String[] args) {
        Frame fr=new Frame();
        fr.setVisible(true);
//        fr.setSize(800,500);
//        fr.setLocation(200, 100);
        fr.setTitle("MY Frame");
        fr.setBackground(Color.LIGHT_GRAY);
        fr.setBounds(200, 100, 800, 500);
    }
}
