/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class firma {

    private String wiek;
    public String[][] lista = new String[100][4];
    Scanner odczyt = new Scanner(System.in);

    
    
    String[][] nextWorker(int x, String[][] lista) {
        while(x<100){
            pracownik pracownik = new pracownik(); 
            System.out.println("pracownika numer= " + (x+1));                    
            System.out.print("Imię: ");
            pracownik.imie = odczyt.next();
            lista[x][0]=pracownik.imie;
            System.out.print("Nazwisko: ");
            pracownik.nazwisko=odczyt.next();
            lista[x][1]=pracownik.nazwisko;
            System.out.print("Wiek: ");
            pracownik.wiek=odczyt.nextInt();
            wiek=Integer.toString(pracownik.wiek);
            lista[x][2]=wiek;
            System.out.print("Stanowisko: ");
            pracownik.stanowisko=odczyt.next();
            lista[x][3]=pracownik.stanowisko;
            x++;
        }
        System.out.println("Wypełniono wszystkich pracowników");
        
        return lista;
    }

    
    
    void showWorkers(int x, String[][] lista) {
        if(x>0){
            for (int y = 0; y < x; y++) {
                System.out.println("nr. " + (y+1));                    
                System.out.println("Imię " + lista[y][0]);
                System.out.println("Nazwisko " + lista[y][1]);
                System.out.println("Wiek " + lista[y][2]);
                System.out.println("Stanowisko " + lista[y][3]);
                
            }
        }
        else{
            System.out.println("Koniec pracowników");
        }
    }
}