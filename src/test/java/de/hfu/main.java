package de.hfu;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        String chain;
        Scanner scan = new Scanner(System.in);

        System.out.print("Zeichenkette eingeben: ");
        chain = scan.next();

        chain = chain.toUpperCase();

        System.out.println(chain);
    }
}
