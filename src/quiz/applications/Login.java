package quiz.applications;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// inheritence to extend JFrame class
// JFrame class is in swing package so we have to import swing class
// and this swing class comes under javax package
// ActionListener comes under java awt event package
public class Login extends JFrame implements ActionListener{
    // login class constructor
    Login()
    {
        // color of frame
        getContentPane().setBackground(Color.WHITE); // color class is in java awt package
        // to make a custome layout first we set the default layout as none

        setLayout(null);

        // image 
        // classLoader is an abstract class which belongs to java.lang package
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));

        // to place the component above the frame 
        // we have to pass the object of component
        JLabel image = new JLabel(i1);

        image.setBounds(0,0, 600, 500);
        // JLabel inherits JComponent class which is in javax package
        add(image);

       // to enter the name
       JLabel name = new JLabel("Enter your name");
       name.setBounds(810, 150,300,20);
       name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
       name.setForeground(new Color(30, 144, 254));
       add(name);

       JTextField tfname = new JTextField();
       tfname.setBounds(735,200,300,25);
       tfname.setFont(new Font("Times New Roman", Font.BOLD, 18));
       add(tfname);
// rules button
       JButton rules = new JButton("Rules");
       rules.setBounds(735, 270, 120, 25);
       rules.setBackground(new Color(30,144,254));
       rules.setForeground(Color.WHITE);
       add(rules);

// back button
        JButton back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        add(back);


       // to write heading on frame
       JLabel heading = new JLabel("Simple Minds");
       heading.setBounds(750,60,300,45);
       heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40 ));
       heading.setForeground(new Color(30, 144,254));


       add(heading); // add function is used to add component on to the frame


        

         
        
        
        setVisible(true); // the default visibility of frame is false
        // the frame will show at the top left corner of the screen

        // to set dimension of frame we have to use setSize() method

        setSize(1200,500);

        // to set the position of frame

        setLocation(200,200);
        
    }
    public static void main(String[] args) {
        
        new Login(); // a new object named login, annonymous object
        // we want that as soon as i run the class a frame will show up
        // class ko run karte se hi main method call hota hai
        //class ka object banate se hi constructor call hota hai
        // only if we write the code part in constructor we will gonna see the code 
        // just after calling the class

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
