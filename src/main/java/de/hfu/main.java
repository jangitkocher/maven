package de.hfu;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        String chain; /*String zum speichern der Eingabe*/
        Scanner scan = new Scanner(System.in); //Scanner zum Einlesen

        System.out.print("Zeichenkette eingeben: "); //Ausgabe
        chain = scan.next(); //Einlesen und übergeben

        chain = chain.toUpperCase(); //Kleine zu Großenbuchstaben

        System.out.println(chain); //Ausgabe Großbuchstaben
    }
}
