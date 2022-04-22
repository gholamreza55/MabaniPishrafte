import calculator.Calculator;

import javax.swing.*;

public class CalculatorUI {

    private static JTextField jTextField;
    private static String adaAval;

    public static void main(String... args) {

        JFrame mashinHesab = new JFrame("Mashin hesab");  //1

        jTextField = new JTextField();  //5
        jTextField.setBounds(0, 0, 150, 50);  //6
        jTextField.setEditable(false);  //8

        JButton cancel = new JButton("C");
        cancel.setBounds(150, 0, 50, 50);
        cancel.addActionListener(e -> jTextField.setText(""));

        JButton one = getButton("1", 0, 50);
        JButton two = getButton("2", 50, 50);
        JButton three = getButton("3", 100, 50);
        JButton four = getButton("4", 0, 100);
        JButton five = getButton("5", 50, 100);
        JButton sex = getButton("6", 100, 100);
        JButton seven = getButton("7", 0, 150);
        JButton eight = getButton("8", 50, 150);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, 50, 50);
        plus.addActionListener(e -> {
            adaAval = jTextField.getText();
            jTextField.setText("");
        });


        JButton minus = new JButton("-");
        minus.setBounds(150, 100, 50, 50);

        JButton multply = new JButton("*");
        multply.setBounds(150, 150, 50, 50);

        JButton point = getButton(".", 0, 200);
        JButton zero = getButton("0", 50, 200);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, 50, 50);
        equal.addActionListener(e ->
        {
            Calculator calculator = new Calculator();
            String addResult = calculator.add(adaAval, jTextField.getText());
            jTextField.setText(addResult);
        });
        JButton nine = getButton("9", 100, 150);
        JButton division = new JButton("/");
        division.setBounds(150, 200, 50, 50);
        mashinHesab.add(division);
        mashinHesab.add(cancel);
        mashinHesab.add(one);
        mashinHesab.add(two);
        mashinHesab.add(three);
        mashinHesab.add(four);
        mashinHesab.add(five);
        mashinHesab.add(sex);
        mashinHesab.add(seven);
        mashinHesab.add(eight);
        mashinHesab.add(nine);
        mashinHesab.add(point);
        mashinHesab.add(zero);
        mashinHesab.add(equal);
        mashinHesab.add(multply);
        mashinHesab.add(minus);
        mashinHesab.add(plus);

        mashinHesab.add(jTextField);  //7
        mashinHesab.setSize(400, 400);  //2
        mashinHesab.setLayout(null); //3
        mashinHesab.setVisible(true);  //4

    }
    private static JButton getButton(String label, int xPosition, int yPosition) {
        JButton button = new JButton(label);
        button.setBounds(xPosition, yPosition, 50, 50);
        button.addActionListener(e -> jTextField.setText(jTextField.getText() + button.getText()));
        return button;
    }


}
//
//                JButton eight = new JButton("8");
//                eight.setBounds(50, 150, 50, 50);
//                eight.addActionListener(e -> result.setText(result.getText() + eight.getText()));
//                mashinHesab.add(eight);      ba (Alt+Ctrl+M)  tabdil be khate paeiny shod


              //  JButton one = getButton("1", 0, 50, result);
              //  mashinHesab.add(one);