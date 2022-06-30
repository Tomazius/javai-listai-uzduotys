import java.util.ArrayList;
import java.util.List;

public class uzduotis3 {
    public static void main(String[] args) {
        ArrayList<Integer> listas = new ArrayList<>();

        listas.add(3);
        listas.add(-5);
        listas.add(12);
        listas.add(-17);
        listas.add(6);
        listas.add(28);
        listas.add(2);
        listas.add(10);
        listas.add(-9);

        System.out.println("neigSuma(listas) = " + neigSuma(listas));
        System.out.println("teigSuma(listas) = " + teigSuma(listas));
    }
    public static int neigSuma(List<Integer> listas){
        int suma = 0;
        for (int i = 0; i < listas.size(); i++) {
            if(listas.get(i) < 0){
                suma += listas.get(i);
            }
        }
        return suma;
    }
    public static int teigSuma(List<Integer> listas){
        int sumaT = 0;
        for (int i = 0; i < listas.size(); i++) {
            if(listas.get(i) > 0){
                sumaT += listas.get(i);
            }
        }
        return sumaT;
    }
}
