package Aritmetikk;
//Oppgaver til aritmetikk
import javax.swing.*;
import javax.swing.plaf.synth.SynthMenuBarUI;

import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Math.*;

import java.util.Scanner;

public class aritmetikk {
    public static void print(String s) {
        System.out.println(s);
    }
    public static void print(int i) {
        System.out.println(i);
    }
    public static void main(String [] args) {


        //Oppgave 1
        //String navn = JOptionPane.showInputDialog("Hva heter du? ");
        //String født = JOptionPane.showInputDialog("Hvilket år er du født? (åååå) ");
        //int år = 2018;
        //int årUt = Integer.parseInt(født);
        //int alder = år - årUt;
        //int pensjon = 67 +årUt;
        //if (pensjon < 2018) {
            //showMessageDialog(null, navn+" er født i "+årUt+" og er "+alder+" år gammel"+" og ble pensjonert io "+pensjon);
            //}
        //if (pensjon > 2018) {
            //showMessageDialog(null, navn + " er født i " + årUt + " og er " + alder + " år gammel" + " og pensjoneres i " + pensjon);
        //}



        //oppgave 2
//        for (int antall = 0; antall < 10; antall += 2) {
//            showMessageDialog(null, antall);
//        }
// Kan ikke dette automatiseres?
        //int antall = 0;
        //int antall = 2;
        //int antall = 4;
        //int antall = 6;
        //int antall = 8;
                //showMessageDialog(null, antall);



        //oppgave 3
//        arealet av et kvadrat
//        String sideL = JOptionPane.showInputDialog("Lengde side A (i cm): ");
//        String sideB = JOptionPane.showInputDialog("Lengde side B (i cm): ");
//        double side1 = Double.parseDouble(sideL);
//        double side2 = Double.parseDouble(sideB);
//        double areal = side1*side2;
//        showMessageDialog(null, "Arealet av kvadratet er: "+areal+" cm²");
//


//        oppgave4
//        omkretsen av en sirkel
//        String radius = JOptionPane.showInputDialog("Skriv inn lengden på radius (i cm): ");
//        double r = Double.parseDouble(radius);
//        double o = 2*r*PI;
        //showMessageDialog(null, "Omkretsen av sirkelen er: "+o+" cm²");



        //oppgave 5
        //farenheit til celcius
        //String farenheit = JOptionPane.showInputDialog("Skriv inn temperatur i farenheit: ");
        //double f = Double.parseDouble(farenheit);
        //double c = (f-32)/1.8;
        //showMessageDialog(null, "Temperatur i celcius: "+c);



        //oppgave 6
        // USD til NOK
        //String dollar = JOptionPane.showInputDialog("Tast inn antall Dollar: ");
        //double usd = Double.parseDouble(dollar);
        //double nok = 8.66*usd;
        //showMessageDialog(null, nok+" NOK");



        //oppgave 7
        //pizza per pers med rest
        //String pizza = JOptionPane.showInputDialog("Hvor mange pizza er bestilt?");
        //String biter = JOptionPane.showInputDialog("Hvor mange stykker pr pizza?");
        //String personer = JOptionPane.showInputDialog("Hvor mange skal spise?");
        //int pie = Integer.parseInt(pizza);
        //int slice = Integer.parseInt(biter);
        //int pers = Integer.parseInt(personer);
        //int tilHver = slice/pers;
        //int rest = slice%pers;
        //showMessageDialog(null,"Dersom man er "+pers+" personer og har "+pie+" pizzaer får hver person "+tilHver+" slices og "+rest+" blir til overs");



        //oppgave 8
        //Det blir skrevet ut -1
        //double tall1=1;
        //double tall2=2;
        //double resultat;
        //resultat = tall1 * 4 + (tall2 * 2 + tall1 ) / (tall2-tall1*3);
        //System.out.println(resultat);



        //oppgave 9
        //sett tall1 = 5
        //sett tall2 = 4
        //tall1 == tall2 : false
        //tall1 != tall2 : true
        //tall1 <= tall2 : false
        //tall1 >= tall2 : true
        //tall1 < tall2  : false
        //tall1 > tall2  : true


        //oppgave 10
        //String alder = JOptionPane.showInputDialog("Hvor gammel er du? ");
        //int gammel = Integer.parseInt(alder);
        //if (gammel < 18) {
        //showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        //}
        //if (gammel >= 18) {
        //showMessageDialog(null, "Du kan ta førerkortet for bil da du er gammel nok");
        //}

 /*       String tall = JOptionPane.showInputDialog("Skriv et tall mellom 0 og 1000");
        int tver = Integer.parseInt(tall);
        if (tver > 1000) {
            showMessageDialog(null, "Tallet er større en 1000. Avslutter.");
            return;
        } else if (tver < 0) {
            showMessageDialog(null, "Tallet er mindre enn 0. Avslutter.");
            return;
        }
        int sum = 0;
        for (int i = 0; i<=3; i++) {
            sum += tver%10;
            tver = tver/10;
        }
        showMessageDialog(null, sum);

        //oppgave 11
        //tverrsummen av et tall mellom 0 og 1000
        /*
        String tall = JOptionPane.showInputDialog("Skriv et tall mellom 0 og 1000");
        int tver = Integer.parseInt(tall);
        int tall1 = tver%10;
        int mellom1 = tver/10;
        int tall2 = mellom1%10;
        int mellom2 = mellom1/10;
        int tall3 = mellom2%10;
        int sum = tall1+tall2+tall3;
        showMessageDialog(null, sum);

        String tall = JOptionPane.showInputDialog("Skriv et tall mellom 0 og 1000");
        int i = Integer.parseInt(tall);

        do {
            System.out.println(i);
            i++;
        } while (i<=100);

*/
        Scanner input = new Scanner(System.in);
        print("skriv inn et tall:");
        int i = input.nextInt();
        print(i);

    }
}
