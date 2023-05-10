import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("src/bths.png");
        Border border = BorderFactory.createLineBorder(Color.blue,3);


        JLabel label = new JLabel();
        label.setText("Brooklyn Technical High School Transcript: ");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xFF000000, true));
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setIconTextGap(-25);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(50,50,400,400);

        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500,500);
        //myFrame.setLayout(null);
        myFrame.setVisible(true);
        myFrame.add(label);
        //myFrame.pack();
    }
}
