import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.ImageIcon;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener {
    JButton addCourse;
    JButton studentInfo;

    MyFrame(){


        ImageIcon image = new ImageIcon("src/bths.png");
        Border border = BorderFactory.createLineBorder(Color.blue,3);
        addCourse = new JButton();
        addCourse.setBounds(100, 400, 200, 50);
        addCourse.addActionListener(this);
        addCourse.setText("Add course");
        addCourse.setFocusable(false);
        studentInfo = new JButton();
        studentInfo.setBounds(500, 400, 200, 50);
        studentInfo.addActionListener(this);
        studentInfo.setText("View student info");
        studentInfo.setFocusable(false);





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
        label.add(addCourse);
        label.add(studentInfo);




        this.setTitle("Transcript");
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setSize(800,1600);
        this.setResizable(false);
        this.setVisible(true);
        this.add(label);



        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255,255,255));
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addCourse){
            System.out.print("poo");
        }
        if(e.getSource()==studentInfo){
            System.out.print("pee");
        }
    }


}