package oblig1;

import java.lang.Math.*;

import static java.lang.Math.*;


//Nedenfor ser du en skisse for klassen Sirkel. Oppgaven er å erstatte skallkoden med java-kode.

public class Sirkel {

    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double diameter (double r){
        return r*2;

    }
    // Statisk metode som beregner og returnerer sirkelens omkrets.
    // Omkrets = 2*pi*r
    public static double omkrets(double r){
        return 2*PI*r;
    }

    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI kan brukes for en konstant for PI
       Math.pow kan brukes for å opphøye et tall i en potens
     */
    public static double areal(double r){
        return PI*pow(r,2);
    }

}



