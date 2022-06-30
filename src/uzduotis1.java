import java.util.ArrayList;
import java.util.List;

public class uzduotis1 {
    public static void main(String[] args) {

        ArrayList<Integer> listas = new ArrayList<>();

        listas.add(9);
        listas.add(12);
        listas.add(44);
        listas.add(7);
        listas.add(32);
        listas.add(16);
        listas.add(6);
        listas.add(1);

        int x = 15;

        System.out.println("listas = " + listas);
        System.out.println("rastiSkaicius(listas) = " + rastiSkaicius(x, listas));
    }
    public static int rastiSkaicius(int x, List<Integer> listas){
        int kiekdaugiau = 0;
        for (int i = 0; i < listas.size(); i++) {
            if(x < listas.get(i)){
                kiekdaugiau++;
            }
        }
        return kiekdaugiau;
    }
}
