import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
public class calculator extends JFrame{
    calculator(){

        JLabel textArea = new JLabel();
        textArea.setBounds(0,0,600,250);
        textArea.setVisible(true);
        textArea.setOpaque(true);
        textArea.setBackground(Color.white);
        textArea.setHorizontalAlignment(JLabel.CENTER);
        textArea.setVerticalAlignment(JLabel.CENTER);
        Border textAreaBorder = BorderFactory.createLineBorder(Color.BLACK,2);
        textArea.setBorder(textAreaBorder);
        JTextField inputBox = new JTextField();
        inputBox.setBounds(125, 50, 350, 150);
        textArea.add(inputBox);

        JLabel buttonArea = new JLabel();
        buttonArea.setBounds(0,250,600,600);
        buttonArea.setVisible(true);
        buttonArea.setOpaque(true);
        buttonArea.setBackground(Color.CYAN);

        JButton seven = new JButton();
        seven.setBounds(16,16,130,130);
        seven.setVisible(true);
        seven.setOpaque(true);
        seven.setBackground(Color.GRAY);
        buttonArea.add(seven);

        JButton eight = new JButton();
        eight.setBounds(162,16,130,130);
        eight.setVisible(true);
        eight.setOpaque(true);
        eight.setBackground(Color.GRAY);
        buttonArea.add(eight);

        JButton nine = new JButton();
        nine.setBounds(308,16,130,130);
        nine.setVisible(true);
        nine.setOpaque(true);
        nine.setBackground(Color.GRAY);
        buttonArea.add(nine);
        
        


    

        ImageIcon logo = new ImageIcon("logo.png");
        this.setIconImage(logo.getImage()); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,850);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setLayout(null);
        this.add(textArea);
        this.add(buttonArea);
        

    }
}