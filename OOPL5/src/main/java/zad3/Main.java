package zad3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Jaka jest ilośc elementów stosu ? ");
        y = odczyt.nextInt();
        stos stos = new stos(y);
            System.out.println("1=Sumowanie el. stosu");
            System.out.println("2=Wyrzucenie el. stosu");
            System.out.println("3=Wypisz el.stosu");
            System.out.println("4=Rozmiar");
            
            x = odczyt.nextInt();
            switch (x) {
                case 1:
                    int E;
                    System.out.println("Sumowanie elementów stosu");
                    E = odczyt.nextInt();
                    stos.push(E);
                    System.out.println(stos.getMaximumStackSize());
                    break;
                case 2:
                    System.out.println("Wyrzucenie elementów z stosu");
                    stos.pop();
                    break;
                case 3:
                    stos.pokazstos();
                    break;
                case 4:
                    stos.wielkoscStosu();
                    break;
                default:
                    System.out.println("Podałes złą liczbe");
                    break;
            }

        }
    }
