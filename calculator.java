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
        buttonArea.setBackground(Color.LIGHT_GRAY);

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

        JButton four = new JButton();
        four.setBounds(16,162,130,130);
        four.setVisible(true);
        four.setOpaque(true);
        four.setBackground(Color.GRAY);
        buttonArea.add(four);
        
        JButton five = new JButton();
        five.setBounds(162,162,130,130);
        five.setVisible(true);
        five.setOpaque(true);
        five.setBackground(Color.GRAY);
        buttonArea.add(five);

        JButton six = new JButton();
        six.setBounds(308,162,130,130);
        six.setVisible(true);
        six.setOpaque(true);
        six.setBackground(Color.GRAY);
        buttonArea.add(six);

        JButton One = new JButton();
        One.setBounds(16,308,130,130);
        One.setVisible(true);
        One.setOpaque(true);
        One.setBackground(Color.GRAY);
        buttonArea.add(One);

        JButton Two = new JButton();
        Two.setBounds(162,308,130,130);
        Two.setVisible(true);
        Two.setOpaque(true);
        Two.setBackground(Color.GRAY);
        buttonArea.add(Two);

        JButton Three = new JButton();
        Three.setBounds(308,308,130,130);
        Three.setVisible(true);
        Three.setOpaque(true);
        Three.setBackground(Color.GRAY);
        buttonArea.add(Three);

        JButton Zero = new JButton();
        Zero.setBounds(16,454,130,130);
        Zero.setVisible(true);
        Zero.setOpaque(true);
        Zero.setBackground(Color.GRAY);
        buttonArea.add(Zero);

        JButton Plus = new JButton();
        Plus.setBounds(162,454,130,130);
        Plus.setVisible(true);
        Plus.setOpaque(true);
        Plus.setBackground(Color.GRAY);
        buttonArea.add(Plus);

        JButton Minus = new JButton();
        Minus.setBounds(308,454,130,130);
        Minus.setVisible(true);
        Minus.setOpaque(true);
        Minus.setBackground(Color.GRAY);
        buttonArea.add(Minus);

        JButton Equals = new JButton();
        Equals.setBounds(454,454,130,130);
        Equals.setVisible(true);
        Equals.setOpaque(true);
        Equals.setBackground(Color.GRAY);
        buttonArea.add(Equals);

        JButton Divide = new JButton();
        Divide.setBounds(454,308,130,130);
        Divide.setVisible(true);
        Divide.setOpaque(true);
        Divide.setBackground(Color.GRAY);
        buttonArea.add(Divide);

        JButton Multiply = new JButton();
        Multiply.setBounds(454,162,130,130);
        Multiply.setVisible(true);
        Multiply.setOpaque(true);
        Multiply.setBackground(Color.GRAY);
        buttonArea.add(Multiply);

        JButton SquareRoot = new JButton();
        SquareRoot.setBounds(454,16,130,130);
        SquareRoot.setVisible(true);
        SquareRoot.setOpaque(true);
        SquareRoot.setBackground(Color.GRAY);
        buttonArea.add(SquareRoot);
        

        ImageIcon logo = new ImageIcon("logo.png");
        this.setIconImage(logo.getImage()); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(616,888);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setLayout(null);
        this.add(textArea);
        this.add(buttonArea);
        

    }
}