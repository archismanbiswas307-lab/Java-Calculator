import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Calculator extends JFrame implements ActionListener {
    String equation , output;
    JButton allclear,plus, minus , multiply, division , percentage,openbracket, closedbrackets, equals, backspace, one ,two , three , four, five , six , seven , eight , nine , zero , point ;
    JLabel inputfeild,outputfeild;
    Calculator(){
        equation = "";
        output = "";
        setLayout(null);
        setTitle("Calculator");
        int x = 10;
        int y = 150;

        inputfeild= new JLabel();
        inputfeild.setBounds(21,21,340,60);
        inputfeild.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(inputfeild);

        outputfeild = new JLabel();
        outputfeild.setBounds(21,91,340,60);
        outputfeild.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(outputfeild);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new LineBorder(Color.GRAY , 1));
        panel2.setBounds(20 , 90 , 321 , 40);
        add(panel2);

        JPanel panel1 = new JPanel();
        panel1.setBorder(new LineBorder(Color.GRAY , 1));
        panel1.setBounds(20 , 20 , 321 , 60);
        add(panel1);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.GRAY , 1));
        panel.setBounds(10 , 10 , 340 , 130);
        add(panel);

        allclear= new JButton("AC");
        allclear.setFont(new Font("System", Font.BOLD , 16));
        allclear.setBounds(x , y , 60 , 60);
        allclear.addActionListener(this);
        add(allclear);

        x += 70;

        openbracket= new JButton("(");
        openbracket.setFont(new Font("System", Font.BOLD , 16));
        openbracket.setBounds(x , y , 60 , 60);
        openbracket.addActionListener(this);
        add(openbracket);

        x += 70;

        closedbrackets= new JButton(")");
        closedbrackets.setFont(new Font("System", Font.BOLD , 16));
        closedbrackets.setBounds(x , y , 60 , 60);
        closedbrackets.addActionListener(this);
        add(closedbrackets);

        x += 70;

        percentage= new JButton("%");
        percentage.setFont(new Font("System", Font.BOLD , 16));
        percentage.setBounds(x , y , 60 , 60);
        percentage.addActionListener(this);
        add(percentage);

        x += 70;

        division= new JButton("÷");
        division.setFont(new Font("System", Font.BOLD , 16));
        division.setBounds(x , y , 60 , 60);
        division.addActionListener(this);
        add(division);

        x += 70;

        y += 70;

        //System.out.println(x);
        x = 10;

        seven= new JButton("7");
        seven.setFont(new Font("System", Font.BOLD , 16));
        seven.setBounds(x , y , 60 , 60);
        seven.addActionListener(this);
        add(seven);

        x += 93;

        eight= new JButton("8");
        eight.setFont(new Font("System", Font.BOLD , 16));
        eight.setBounds(x , y , 60 , 60);
        eight.addActionListener(this);
        add(eight);

        x += 93;

        nine= new JButton("9");
        nine.setFont(new Font("System", Font.BOLD , 16));
        nine.setBounds(x , y , 60 , 60);
        nine.addActionListener(this);
        add(nine);

        x += 93;

        multiply= new JButton("×");
        multiply.setFont(new Font("System", Font.BOLD , 16));
        multiply.setBounds(x , y , 60 , 60);
        multiply.addActionListener(this);
        add(multiply);

        x += 70;

        y += 70;

        x = 10;

        four= new JButton("4");
        four.setFont(new Font("System", Font.BOLD , 16));
        four.setBounds(x , y , 60 , 60);
        four.addActionListener(this);
        add(four);

        x += 93;

        five= new JButton("5");
        five.setFont(new Font("System", Font.BOLD , 16));
        five.setBounds(x , y , 60 , 60);
        five.addActionListener(this);
        add(five);

        x += 93;

        six= new JButton("6");
        six.setFont(new Font("System", Font.BOLD , 16));
        six.setBounds(x , y , 60 , 60);
        six.addActionListener(this);
        add(six);

        x += 93;

        minus= new JButton("-");
        minus.setFont(new Font("System", Font.BOLD , 16));
        minus.setBounds(x , y , 60 , 60);
        minus.addActionListener(this);
        add(minus);

        x += 70;

        y += 70;

        x = 10;

        one= new JButton("1");
        one.setFont(new Font("System", Font.BOLD , 16));
        one.setBounds(x , y , 60 , 60);
        one.addActionListener(this);
        add(one);

        x += 93;

        two= new JButton("2");
        two.setFont(new Font("System", Font.BOLD , 16));
        two.setBounds(x , y , 60 , 60);
        two.addActionListener(this);
        add(two);

        x += 93;

        three= new JButton("3");
        three.setFont(new Font("System", Font.BOLD , 16));
        three.setBounds(x , y , 60 , 60);
        three.addActionListener(this);
        add(three);

        x += 93;

        plus= new JButton("+");
        plus.setFont(new Font("System", Font.BOLD , 16));
        plus.setBounds(x , y , 60 , 60);
        plus.addActionListener(this);
        add(plus);

        x += 70;

        y += 70;

        x = 10;

        zero= new JButton("0");
        zero.setFont(new Font("System", Font.BOLD , 16));
        zero.setBounds(x , y , 60 , 60);
        zero.addActionListener(this);
        add(zero);

        x += 93;

        point= new JButton(".");
        point.setFont(new Font("System", Font.BOLD , 20));
        point.setBounds(x , y , 60 , 60);
        point.addActionListener(this);
        add(point);

        x += 93;

        backspace= new JButton("DEL");
        backspace.setFont(new Font("System", Font.BOLD , 12));
        backspace.setBounds(x , y , 60 , 60);
        backspace.addActionListener(this);
        add(backspace);

        x += 93;

        equals= new JButton("=");
        equals.setFont(new Font("System", Font.BOLD , 16));
        equals.setBounds(x , y , 60 , 60);
        equals.addActionListener(this);
        add(equals);

        x += 70;

        y += 70;


        setUndecorated(false);
        setSize(370,550);
        setLocation(200,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static  void main(String[] args){
        new Calculator();
    }

   public  double calculate(String s){
       s = s.replaceAll("×","*");
       s = s.replaceAll("÷","/");
       s = s.replaceAll("%","/100");

        if (s == null || s.length() == 0)
            return 0;
        s = s.trim().replaceAll("[ ]+", "");
        Stack<Double> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        int i = 0;

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i)) || (s.charAt(i) == '.' && i + 1 < s.length() && Character.isDigit(s.charAt(i + 1)))) {
                double num = 0;
                boolean hasDecimal = false;
                double decimalPlace = 1;
                while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.')) {
                    if (s.charAt(i) == '.') {
                        if (hasDecimal) break;
                        hasDecimal = true;
                    } else {
                        if (hasDecimal) {
                            decimalPlace *= 10;
                            num += Character.getNumericValue(s.charAt(i)) / decimalPlace;
                        } else {
                            num = num * 10 + Character.getNumericValue(s.charAt(i));
                        }
                    }
                    i++;
                }
                numStack.push(num);
            }
            else{
                char op = s.charAt(i);
                if(opStack.isEmpty()){
                    opStack.push(op);
                    i++;
                } else if (op == '+' || op == '-') {
                    char top = opStack.peek();
                    if(top == '('){
                        opStack.push(op);
                        i++;
                    }
                    else {
                        helper(numStack, opStack);
                    }
                }
                else if (op == '*' || op == '/') {
                    char top = opStack.peek();
                    if (top == '(') {
                        opStack.push(op);
                        i++;
                    } else if (top == '*' || top == '/') {
                        helper(numStack, opStack);
                    } else if (top == '+' || top == '-') {
                        opStack.push(op);
                        i++;
                    }
                } else if (op == '(') {
                    opStack.push(op);
                    i++;
                } else if (op == ')') {
                    while (opStack.peek() != '(') {
                        helper(numStack, opStack);
                    }
                    opStack.pop();
                    i++;
                }
            }
        }

       while (!opStack.isEmpty()) {
           helper(numStack, opStack);
       }

       return numStack.peek();
   }


    private void helper(Stack<Double> numStack , Stack<Character> opStack){
        double num2 = numStack.pop();
        double num1 = numStack.pop();

        char op = opStack.pop();

        double ans = 0;

        switch(op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    ans = Double.MAX_VALUE;
                }
                else {
                    ans = num1 / num2;
                }
                break;
        }

        numStack.push(ans);
   }

    public void actionPerformed(ActionEvent action) {
        if(action.getSource() == equals){
            double result = calculate(equation);
            if (result == Double.MAX_VALUE) {
                outputfeild.setText("MATH ERROR");
                inputfeild.setText("");
                equation = "";
            }

            else{

                if (result == (long) result) {
                    output = "" + (long) result;
                } else {
                    output = String.format("%.10g", result);
                }
                outputfeild.setText(output.replaceAll("\\.0+$",""));
                inputfeild.setText("");
                equation = "";
                if (action.getSource() == plus ||
                        action.getSource() == minus ||
                        action.getSource() == multiply ||
                        action.getSource() == division
                ) {
                    inputfeild.setText(output);
                }
            }
        }
        else{
            if (action.getSource() == allclear) {
                equation = "";
                outputfeild.setText("");
            } else if (action.getSource() == backspace) {
                if (!equation.isEmpty()) {
                    equation = equation.substring(0, equation.length() - 1);
                }
            } else if (
                    action.getSource() == one ||
                    action.getSource() == two ||
                    action.getSource() == three ||
                    action.getSource() == four ||
                    action.getSource() == five ||
                    action.getSource() == six ||
                    action.getSource() == seven ||
                    action.getSource() == eight ||
                    action.getSource() == nine ||
                    action.getSource() == zero
            ) {

                equation += ((JButton) (action.getSource())).getText();
                output = "";
            } else if (action.getSource() == percentage) {
                equation += "%";
                output = "";
            } else {
                equation +=  output.replaceAll("\\.0+$","")+ ((JButton) (action.getSource())).getText();
                output = "";
            }
            inputfeild.setText(equation);
        }
    }
}
