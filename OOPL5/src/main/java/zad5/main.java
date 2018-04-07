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
public class main {
    public static void main(String[] args) {
int wybor;
int y=0;

Scanner odczyt = new Scanner(System.in);
firma firma= new firma();

String[][] xx = firma.lista;
System.out.println("Wybierz działanie:");
System.out.println("1=Dodaj pracownika");
System.out.println("2=Wyświetl liste");

wybor = odczyt.nextInt();

switch(wybor){
   
   case(1):
       firma.nextWorker(y, xx);
       while(y<100){
           y++;
       }
       break;


case(2):
    firma.showWorkers(y, xx);
    break;
    

       
}




    }
}
