package oblig1;


    //Nedenfor ser du en skisse av hovedprogrammet som du skal bruke til å teste ut klassen Sirkel. Oppgaven er også her å erstatte skallkoden med java-kode.

    public class Oblig1Oppgave1 {
        public static void main(String[] args) {
            //  Sett en variabel lik en verdi for radius
            double radius = 23.5;

            System.out.println("Arealet av en sirkel med radius "+radius+" er: "+String.format("%.2f", Sirkel.areal(radius)));
            System.out.println("Omkretsen av en sirkel med radius "+radius+" er: "+String.format("%.2f", Sirkel.omkrets(radius)));
            System.out.println("Diameteren av en sirkel med radius "+radius+" er: "+String.format("%.2f", Sirkel.diameter(radius)));


    /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
       System.out (gitt radius lik 23.5)

       Arealet av sirkelen med radius 23.5 er 1734,94
       Omkretsen av sirkelen med radius 23.5 er 147,65
       Diameteren til sirkelen er med radius 23.5 er 47,00

       Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
    */
        }
    }
