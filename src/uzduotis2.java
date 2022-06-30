import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class uzduotis2 {
    public static void main(String[] args) {
        ArrayList<Double> listas = new ArrayList<>();

        listas.add(3.0);
        listas.add(5.0);
        listas.add(12.0);
        listas.add(7.0);
        listas.add(6.0);
        listas.add(8.0);
        listas.add(2.0);
        listas.add(0.0);
        listas.add(1.0);

        int n = 7;

        System.out.println("rastiKiekDidesniu(listas) = " + rastiKiekDidesniu(n, listas));
    }
    public static double rastiKiekDidesniu(int n, List<Double> listas){
        int kiekDidesniu = 0;
        for (int i = 0; i < listas.size(); i++) {
            if (listas.get(n) < listas.get(i)){
                kiekDidesniu++;
            }
        }
        return kiekDidesniu;

    }
}
