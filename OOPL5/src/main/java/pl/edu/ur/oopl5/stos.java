
package pl.edu.ur.oopl5;

/**
 *
 * @author HP
 */
public class stos {
 
    // Zdefiniowanie tablicy i elementów odpowiedzialnych za wierzchołek.
    double[] tab;
    int ws;
 
    // Konstruktor, który zainicjuje wierzchołek i stos o odpowiedniej
    // wielkości.
    public stos(int MaxRozmiar) {
        tab = new double[MaxRozmiar];
        ws = 0;
    }
int getMaximumStackSize() {
        return ws;
}
void push(double E) throws ArrayIndexOutOfBoundsException {
        if (ws < tab.length) {
            tab[ws] = E;
            ws++;
 
        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepełnienie stosu");
        }
}

double pop() throws IndexOutOfBoundsException {
        if (ws <= 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty");
        }
 
        double temp = tab[ws - 1];
        ws--;
        return temp;
}
 
    public void pokazstos(){
        for (int i = 0; i<tab.length; i++)
            System.out.println(tab[i]);
    }
    public void wielkoscStosu(){
        System.out.println(ws);
}
}
