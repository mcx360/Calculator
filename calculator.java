import javax.swing.*;
import java.awt.*;

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
        Font numberPadFont = new Font("Arial",Font.PLAIN,60);
        inputBox.setFont(numberPadFont);
        inputBox.setHorizontalAlignment(JLabel.CENTER);
        
        

        JLabel buttonArea = new JLabel();
        buttonArea.setBounds(0,250,600,600);
        buttonArea.setVisible(true);
        buttonArea.setOpaque(true);
        buttonArea.setBackground(new Color(0,85,130));

        JButton seven = new JButton("7");
        seven.setBounds(16,16,130,130);
        seven.setVisible(true);
        seven.setOpaque(true);
        seven.setBackground(new Color(248,248,255));
        seven.setFont(numberPadFont);
        buttonArea.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(162,16,130,130);
        eight.setVisible(true);
        eight.setOpaque(true);
        eight.setBackground(new Color(248,248,255));
        eight.setFont(numberPadFont);
        buttonArea.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(308,16,130,130);
        nine.setVisible(true);
        nine.setOpaque(true);
        nine.setBackground(new Color(248,248,255));
        nine.setFont(numberPadFont);
        buttonArea.add(nine);

        JButton four = new JButton("4");
        four.setBounds(16,162,130,130);
        four.setVisible(true);
        four.setOpaque(true);
        four.setBackground(new Color(248,248,255));
        four.setFont(numberPadFont);
        buttonArea.add(four);
        
        JButton five = new JButton("5");
        five.setBounds(162,162,130,130);
        five.setVisible(true);
        five.setOpaque(true);
        five.setBackground(new Color(248,248,255));
        five.setFont(numberPadFont);
        buttonArea.add(five);

        JButton six = new JButton("6");
        six.setBounds(308,162,130,130);
        six.setVisible(true);
        six.setOpaque(true);
        six.setBackground(new Color(248,248,255));
        six.setFont(numberPadFont);
        buttonArea.add(six);

        JButton One = new JButton("1");
        One.setBounds(16,308,130,130);
        One.setVisible(true);
        One.setOpaque(true);
        One.setBackground(new Color(248,248,255));
        One.setFont(numberPadFont);
        buttonArea.add(One);
        
        JButton Two = new JButton("2");
        Two.setBounds(162,308,130,130);
        Two.setVisible(true);
        Two.setOpaque(true);
        Two.setBackground(new Color(248,248,255));
        Two.setFont(numberPadFont);
        buttonArea.add(Two);

        JButton Three = new JButton("3");
        Three.setBounds(308,308,130,130);
        Three.setVisible(true);
        Three.setOpaque(true);
        Three.setBackground(new Color(248,248,255));
        Three.setFont(numberPadFont);
        buttonArea.add(Three);

        JButton Zero = new JButton("0");
        Zero.setBounds(16,454,130,130);
        Zero.setVisible(true);
        Zero.setOpaque(true);
        Zero.setBackground(new Color(248,248,255));
        Zero.setFont(numberPadFont);
        buttonArea.add(Zero);

        JButton Plus = new JButton("+");
        Plus.setBounds(162,454,130,130);
        Plus.setVisible(true);
        Plus.setOpaque(true);
        Plus.setBackground(new Color(230,230,250));
        Plus.setFont(numberPadFont);
        buttonArea.add(Plus);

        JButton Minus = new JButton("-");
        Minus.setBounds(308,454,130,130);
        Minus.setVisible(true);
        Minus.setOpaque(true);
        Minus.setBackground(new Color(230,230,250));
        Minus.setFont(numberPadFont);
        buttonArea.add(Minus);

        JButton Equals = new JButton("=");
        Equals.setBounds(454,454,130,130);
        Equals.setVisible(true);
        Equals.setOpaque(true);
        Equals.setBackground(new Color(230,230,250));
        Equals.setFont(numberPadFont);
        buttonArea.add(Equals);

        JButton Divide = new JButton("/");
        Divide.setBounds(454,308,130,130);
        Divide.setVisible(true);
        Divide.setOpaque(true);
        Divide.setBackground(new Color(230,230,250));
        Divide.setFont(numberPadFont);
        buttonArea.add(Divide);

        JButton Multiply = new JButton("*");
        Multiply.setBounds(454,162,130,130);
        Multiply.setVisible(true);
        Multiply.setOpaque(true);
        Multiply.setBackground(new Color(230,230,250));
        Multiply.setFont(numberPadFont);
        buttonArea.add(Multiply);

        JButton SquareRoot = new JButton("\u221A");
        SquareRoot.setBounds(454,16,130,130);
        SquareRoot.setVisible(true);
        SquareRoot.setOpaque(true);
        SquareRoot.setBackground(new Color(230,230,250));
        SquareRoot.setFont(numberPadFont);
        buttonArea.add(SquareRoot);
        

        ImageIcon logo = new ImageIcon("LogoBlue.jpg");
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