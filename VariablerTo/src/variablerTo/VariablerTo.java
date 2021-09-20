package variablerTo;
//oppgaver til variabler 2

import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class VariablerTo {
    public static void main(String [] args){
        //Oppgave 1
        //String number = JOptionPane.showInputDialog("Input your age: ");
        //int alder = Integer.parseInt(number);
        //showMessageDialog(null, "Your age is: "+alder);

        //Oppgave 2
        //String number1 = JOptionPane.showInputDialog("Input number one: ");
        //String number2 = JOptionPane.showInputDialog("Input number two: ");
        //String number3 = JOptionPane.showInputDialog("Input number three: ");
        //double numberOne = Double.parseDouble(number1);
        //double numberTwo = Double.parseDouble(number2);
        //double numberThree = Double.parseDouble(number3);

            //double sum = numberOne+numberTwo+numberThree;

                //System.out.println(sum);

        //Oppgave 3
            //System.out.println(sum/3);
        //og
            //showMessageDialog(null, sum/3);

        //Oppgave 4
        String number1 = JOptionPane.showInputDialog("Input first number: ");
        String number2 = JOptionPane.showInputDialog("Input second number: ");
        String number3 = JOptionPane.showInputDialog("Input third number: ");
        double numberOne;
        double numberTwo;
        double numberThree;
        try {
            numberOne = Double.parseDouble(number1);
            numberTwo = Double.parseDouble(number2);
            numberThree = Double.parseDouble(number3);
        }
        catch (Exception e){
            numberOne = 0.0;
            numberTwo = 0.0;
            numberThree = 0.0;
        }
        double sum = numberOne+numberTwo+numberThree;

            //showMessageDialog(null, sum/3);
        //og
            System.out.println(sum/3);
    }
}