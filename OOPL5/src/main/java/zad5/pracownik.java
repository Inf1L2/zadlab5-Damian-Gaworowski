package zad5;

/**
 *
 * @author student
 */
public class pracownik {
    
    public static String imie;    
    public static String nazwisko;  
    public static int wiek;
    public static String stanowisko;

    public pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
        
    }

    public pracownik() {
        
    }

    public void pokazDane(){
     System.out.println("--------------Student--------------");   
     System.out.println("Imie: "+this.imie);   
     System.out.println("Nazwisko: "+this.nazwisko);
     System.out.println("wiek: "+this.wiek);
     System.out.println("stanowisko: "+this.stanowisko);
     
    }
}

