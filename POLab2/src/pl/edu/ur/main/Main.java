package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //zadanie 3
        System.out.println("Zadanie 3");
        //wprowadzenie liczb podanych przez użytkownika 
        Scanner z = new Scanner(System.in);
        int[] tab = new int[10];
        int i;
        System.out.println("Podaj 10 wartości elementów tablicy");
        for (i = 0; i < tab.length; i++) {
            tab[i] = z.nextInt();
        }
        int v = 0;
        //pętla do-while
        do {
            System.out.println("Jeżeli chcesz wyświetlić: \n 1) Wszystkie elementy tablicy - wciśnij 1\n 2) Indeksy elementów - wciśnij 2\n 3) Indexsy od tyłu - wciśnij 3\n 4) Wartości parzystych indeksów - wciśnij 4\n 5) Wartości nieparzyste indeksów - wciśnij 5");
            Scanner odczyt = new Scanner(System.in);
            int k = odczyt.nextInt();
            if (k == 1) {
                System.out.println("Elementy tablicy ");
                for (int m : tab) {
                    System.out.print(m + " ");
                }
            } else if (k == 2) {
                System.out.println("Index");
                for (i = 0; tab.length > i; i++) {
                    System.out.print(i + " ");
                }
            } else if (k == 3) {
                System.out.println("Indexy od tyłu");
                for (i = tab.length - 1; i >= 0; i--) {
                    System.out.print(i + " ");
                }
            } else if (k == 4) {
                System.out.println("Elementy tablicy parzyste");
                for (i = 0; tab.length > i; i += 2) {
                    System.out.print(tab[i] + " ");
                }
            } else if (k == 5) {
                System.out.println("Elementy tablicy nieparzyste ");
                for (i = 1; tab.length > i; i += 2) {
                    System.out.print(tab[i] + " ");
                }
            } else {
                System.out.println("Błędna liczba");
            }
            System.out.println("\nJeżeli chcesz powtórzyć wybór - wciśnij 6");
            v = odczyt.nextInt();
        } while (v == 6);//koniec pętli do-while
        {
            System.out.println("Koniec działania programu");
        }
        //zadanie 4
        System.out.println("\nZadanie 4");
        //wprowadzenie liczb podanych przez użytkownika 
        Scanner x = new Scanner(System.in);
        int[] tabl = new int[10];
        int n;
        int suma = 0, iloczyn = 1;
        double srednia = 0;
        System.out.println("Podaj 10 liczb rzeczywistych");
        for (n = 0; n < tabl.length; n++) {
            tabl[n] = x.nextInt();
        }
        int minimum = tabl[0], max = tabl[0];
        for (n = 0; n < tabl.length; n++) {
            suma = suma + tabl[n];
            iloczyn = iloczyn * tabl[n];
            srednia = suma / 10;
            if (max < tabl[n]) { //jeżeli początkowe maksimum jest mniejsze niż porównywana liczna przypisuje tą liczbę do maksimum
                max = tabl[n];
            }
            if (minimum >= tabl[n]) {
                minimum = tabl[n];
            }
        }
        System.out.print("Suma wynosi: " + suma + " ");
        System.out.print("\nIloczyn wynosi: " + iloczyn + " ");
        System.out.print("\nŚrednia wartość wynosi: " + srednia + " ");
        System.out.print("\nMinimum wynosi: " + minimum + " ");
        System.out.print("\nMaksimum wynosi: " + max + " \n");

        //zadanie 6
        System.out.println("\nZadanie 6");
        int a = 1;
        Scanner liczba = new Scanner(System.in);
        while (true) {
            if (a > 0) {
                System.out.println("Podaj liczbę całkowitą");
                a = liczba.nextInt();
            } else {
                break;
            }
        }
        // Zadanie 7
        System.out.println("\nZadanie 7");
        System.out.println("Podaj długość tablicy:");
        Scanner t = new Scanner(System.in);
        int b = t.nextInt();
        int[] tablic = new int[b];//b - długość tablicy (tablic.length)
        int d, j, k;
        System.out.println("Podaj wartości tablicy:");
        for (d = 0; d < b; d++) {
            tablic[d] = t.nextInt();
        }
        System.out.println("Zawartosc tablicy: ");
        for (d = 0; d < b; d++) {
            System.out.print(tablic[d] + " ");
        }
        System.out.println();
        for (d = 0; d < b - 1; d++) {
            for (j = 0; j < b - 1; j++) {
                if (tablic[j] > tablic[j + 1]) {
                    k = tablic[j];
                    tablic[j] = tablic[j + 1];
                    tablic[j + 1] = k;
                }
            }
        }
        System.out.println();
        System.out.println("Posortowana tablica: ");
        for (d = 0; d < b; d++) {
            System.out.print(tablic[d] + " ");
        }
    }
}