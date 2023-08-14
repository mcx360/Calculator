import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


import javax.swing.border.Border;
public class calculatorGui extends JFrame{

    calculatorGui(){

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
        inputBox.setEditable(false);  
        inputBox.setBackground(new Color(255, 245, 238));
        inputBox.setCaretColor(new Color(255, 245, 238));    

        JLabel buttonArea = new JLabel();
        buttonArea.setBounds(0,250,600,600);
        buttonArea.setVisible(true);
        buttonArea.setOpaque(true);
        buttonArea.setBackground(new Color(0,85,130));
        

        JButton seven = new JButton("7");
        seven.setFocusPainted(false);
        seven.setBounds(16,16,130,130);
        seven.setVisible(true);
        seven.setOpaque(true);
        seven.setBackground(new Color(248,248,255));
        seven.setFont(numberPadFont);
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("7");
                }
                else{
                    inputBox.setText(inputBox.getText()+"7");
                }
            }
        });
        buttonArea.add(seven);

        JButton eight = new JButton("8");
        eight.setFocusPainted(false);
        eight.setBounds(162,16,130,130);
        eight.setVisible(true);
        eight.setOpaque(true);
        eight.setBackground(new Color(248,248,255));
        eight.setFont(numberPadFont);
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("8");
                }
                else{
                    inputBox.setText(inputBox.getText()+"8");
                }
            }
        });
        buttonArea.add(eight);

        JButton nine = new JButton("9");
        nine.setFocusPainted(false);
        nine.setBounds(308,16,130,130);
        nine.setVisible(true);
        nine.setOpaque(true);
        nine.setBackground(new Color(248,248,255));
        nine.setFont(numberPadFont);
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("9");
                }
                else{
                    inputBox.setText(inputBox.getText()+"9");
                }
            }
        });
        buttonArea.add(nine);

        JButton four = new JButton("4");
        four.setFocusPainted(false);
        four.setBounds(16,162,130,130);
        four.setVisible(true);
        four.setOpaque(true);
        four.setBackground(new Color(248,248,255));
        four.setFont(numberPadFont);
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("4");
                }
                else{
                    inputBox.setText(inputBox.getText()+"4");
                }
            }
        });
        buttonArea.add(four);
        
        JButton five = new JButton("5");
        five.setFocusPainted(false);
        five.setBounds(162,162,130,130);
        five.setVisible(true);
        five.setOpaque(true);
        five.setBackground(new Color(248,248,255));
        five.setFont(numberPadFont);
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("5");
                }
                else{
                    inputBox.setText(inputBox.getText()+"5");
                }
            }
        });
        buttonArea.add(five);

        JButton six = new JButton("6");
        six.setFocusPainted(false);
        six.setBounds(308,162,130,130);
        six.setVisible(true);
        six.setOpaque(true);
        six.setBackground(new Color(248,248,255));
        six.setFont(numberPadFont);
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("6");
                }
                else{
                    inputBox.setText(inputBox.getText()+"6");
                }
            }
        });
        buttonArea.add(six);

        JButton One = new JButton("1");
        One.setFocusPainted(false);
        One.setBounds(16,308,130,130);
        One.setVisible(true);
        One.setOpaque(true);
        One.setBackground(new Color(248,248,255));
        One.setFont(numberPadFont);
        One.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("1");
                }
                else{
                    inputBox.setText(inputBox.getText()+"1");
                }
            }
        });
        buttonArea.add(One);
        
        JButton Two = new JButton("2");
        Two.setFocusPainted(false);
        Two.setBounds(162,308,130,130);
        Two.setVisible(true);
        Two.setOpaque(true);
        Two.setBackground(new Color(248,248,255));
        Two.setFont(numberPadFont);
        Two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //inputBox.setText("7");
                if(inputBox.getText()==null){
                    inputBox.setText("2");
                }
                else{
                    inputBox.setText(inputBox.getText()+"2");
                }
            }
        });
        buttonArea.add(Two);

        JButton Three = new JButton("3");
        Three.setFocusPainted(false);
        Three.setBounds(308,308,130,130);
        Three.setVisible(true);
        Three.setOpaque(true);
        Three.setBackground(new Color(248,248,255));
        Three.setFont(numberPadFont);
        Three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("3");
                }
                else{
                    inputBox.setText(inputBox.getText()+"3");
                }
            }
        });
        buttonArea.add(Three);

        JButton Zero = new JButton("0");
        Zero.setFocusPainted(false);
        Zero.setBounds(16,454,130,130);
        Zero.setVisible(true);
        Zero.setOpaque(true);
        Zero.setBackground(new Color(248,248,255));
        Zero.setFont(numberPadFont);
        Zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("0");
                }
                else{
                    inputBox.setText(inputBox.getText()+"0");
                }
            }
        });
        buttonArea.add(Zero);

        JButton Plus = new JButton("+");
        Plus.setFocusPainted(false);
        Plus.setBounds(162,454,130,130);
        Plus.setVisible(true);
        Plus.setOpaque(true);
        Plus.setBackground(new Color(230,230,250));
        Plus.setFont(numberPadFont);
        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("+");
                }
                else{
                    inputBox.setText(inputBox.getText()+"+");
                }
            }
        });
        buttonArea.add(Plus);

        JButton Minus = new JButton("-");
        Minus.setFocusPainted(false);
        Minus.setBounds(308,454,130,130);
        Minus.setVisible(true);
        Minus.setOpaque(true);
        Minus.setBackground(new Color(230,230,250));
        Minus.setFont(numberPadFont);
        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("-");
                }
                else{
                    inputBox.setText(inputBox.getText()+"-");
                }
            }
        });
        buttonArea.add(Minus);

        JButton Equals = new JButton("=");
        Equals.setFocusPainted(false);
        Equals.setBounds(454,454,130,130);
        Equals.setVisible(true);
        Equals.setOpaque(true);
        Equals.setBackground(new Color(230,230,250));
        Equals.setFont(numberPadFont);
        Equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String userInput = inputBox.getText();  
                calculator expression = new calculator();
                Double result = expression.eval(userInput);
                String answer = Double.toString(result);
                inputBox.setText(answer);       
            }
        });
        buttonArea.add(Equals);

        JButton Divide = new JButton("/");
        Divide.setFocusPainted(false);
        Divide.setBounds(454,308,130,130);
        Divide.setVisible(true);
        Divide.setOpaque(true);
        Divide.setBackground(new Color(230,230,250));
        Divide.setFont(numberPadFont);
        Divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("/");
                }
                else{
                    inputBox.setText(inputBox.getText()+"/");
                }
            }
        });
        buttonArea.add(Divide);

        JButton Multiply = new JButton("*");
        Multiply.setFocusPainted(false);
        Multiply.setBounds(454,162,130,130);
        Multiply.setVisible(true);
        Multiply.setOpaque(true);
        Multiply.setBackground(new Color(230,230,250));
        Multiply.setFont(numberPadFont);
        Multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(inputBox.getText()==null){
                    inputBox.setText("*");
                }
                else{
                    inputBox.setText(inputBox.getText()+"*");
                
                }
            }
        });
        buttonArea.add(Multiply);

        JButton Clear = new JButton("C");
        Clear.setFocusPainted(false);
        Clear.setBounds(454,16,130,130);
        Clear.setVisible(true);
        Clear.setOpaque(true);
        Clear.setBackground(new Color(230,230,250));
        Clear.setFont(numberPadFont);
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                inputBox.setText(null);
            }
        });
        buttonArea.add(Clear);
        

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