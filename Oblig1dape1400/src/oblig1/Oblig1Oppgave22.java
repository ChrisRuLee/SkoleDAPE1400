package oblig1;

import javax.swing.*;

public class Oblig1Oppgave22 {
    public static void main (String [] args) {
        Vare vare1 = new Vare("",0,0);
        vare1.setPris(52);
        String vare1Navn = JOptionPane.showInputDialog("les inn navn på vare 1");
        String vare1Antall = JOptionPane.showInputDialog("les inn antall av vare 1");
        String vare1Pris = JOptionPane.showInputDialog("les inn pris for vare 1");
        String vare2Navn = JOptionPane.showInputDialog("les inn navn på vare 2");
        String vare2Antall = JOptionPane.showInputDialog("les inn antall av vare 2");
        String vare2Pris = JOptionPane.showInputDialog("les inn pris for vare 2");

        try {
            int v1a = Integer.parseInt(vare1Antall);
            int v2a = Integer.parseInt(vare2Antall);
            double v1p = Double.parseDouble(vare1Pris);
            double v2p = Double.parseDouble(vare2Pris);

            Vare vare1 = new Vare(vare1Navn, v1a, v1p);
            Vare vare2 = new Vare(vare2Navn, v2a, v2p);

            double totalpris = vare1.totalpris()+vare2.totalpris();

            System.out.println("Totalprisen ble: "+totalpris+" kr");
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Sørg for at antall er et heltall og at pris er et desimaltall");
            return;
        }


        }

}


