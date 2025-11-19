import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Was ist deine Eingabe? ");

        int eingabe = sc.nextInt();

/*        // TODO: Quadrat


        for (int zeile = 1; zeile <= eingabe; zeile++)
        {
            for (int spalte = 1; spalte <= eingabe; spalte++)
            {
                System.out.print("*");
                for (int space = 1; space == 1; space--)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

/*        // TODO: Quadrat mit Hohlraum

       for (int zeile = 1; zeile <= eingabe; zeile++)
        {
            for (int spalte = 1; spalte <= eingabe; spalte++)
            {
                if (zeile == 1 || zeile < eingabe || spalte == 1 || spalte == eingabe)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }

                for (int space = 1; space == 1; space++)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


/*
        // TODO: Pyramide


        for (int zeile = 1; zeile <= eingabe; zeile++)
        {
            for (int space = 1; space <= eingabe - zeile; space++)
            {
                System.out.print(" ");
            }
            for (int sterne = 1; sterne <= (2 * zeile - 1); sterne++)
            {
                System.out.print("*");
            }
            System.out.println();
       }
*/


/*       // TODO: Pyramide mit Hohlraum!
        for (int zeile = 1; zeile <= eingabe; zeile++)
        {
            for (int space = 1; space <= eingabe - zeile; space++)
            {
                System.out.print(" ");
            }
            for (int sterne = 1; sterne <= (2 * zeile - 1); sterne++)
            {
                if (zeile == eingabe || sterne == 1 || sterne == (2 * zeile - 1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
    }
}




