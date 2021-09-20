package variabler;

import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Variabler {
    public static void main(String [] args){

        //oppgave1
        String forNavn = JOptionPane.showInputDialog("Skriv ditt fornavn:");
        String etterNavn = JOptionPane.showInputDialog("Skriv ditt etternavn:");
        //showMessageDialog (null,forNavn+" "+etterNavn);
        //Oppgave 2
        String alder = JOptionPane.showInputDialog("Skriv din alder:");
        //showMessageDialog (null,"Alderen til "+forNavn+" "+etterNavn+" er"+alder+" år");
        //Oppgave 3
        String adresse = JOptionPane.showInputDialog("Skriv din adresse:");
        String postNr = JOptionPane.showInputDialog("Post Nr:");
        String postSted = JOptionPane.showInputDialog("Poststed:");

        //Oppgave 3
        //showMessageDialog (null,forNavn+" "+etterNavn+" bor i "+adresse+", "+postNr+" "+postSted+". "+forNavn+" er "+alder+"år");

        //Oppgave 4
        //showMessageDialog (null, "Navn: "+forNavn+" "+etterNavn+"\n"+"Adresse: "+adresse+"\n"+"Postnummer: "+postNr+"\n"+"Poststed: "+postSted+"\n"+"Alder: "+alder);

        //Oppgave 5
        System.out.println("Navn: "+forNavn+" "+etterNavn+"\n"+"Adresse: "+adresse+"\n"+"Postnummer: "+postNr+"\n"+"Poststed: "+postSted+"\n"+"Alder: "+alder);
    }
}
