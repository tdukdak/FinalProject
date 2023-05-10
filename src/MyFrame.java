import javax.swing.*;
import java.awt.*;
import  javax.swing.ImageIcon;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("Transcript");
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("bths.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(150, 75, 0));
    }
}