import java.util.ArrayList;
import java.util.Collections;

public class uzduotis9 {
    public static void main(String[] args) {

        ArrayList<Double> algos = new ArrayList<>();

        algos.add(1858.00);
        algos.add(2191.00);
        algos.add(1322.00);
        algos.add(2865.00);
        algos.add(3600.00);
        algos.add(1322.00);
        algos.add(1200.00);
        algos.add(970.00);
        algos.add(1750.00);
        algos.add(1420.00);

        System.out.println(algos);

        Collections.sort(algos);

        System.out.println(algos);

        System.out.println("medianosPaieska(algos) = " + medianosPaieska(algos));

    }
    public static double medianosPaieska(ArrayList<Double> algos){
        double mediana = 0;
        int vidurys = algos.size() / 2;
        if(algos.size() % 2 == 0){
            System.out.println("yay");
            return mediana = (algos.get(vidurys) + algos.get(vidurys-1)) / 2;
        }
        else{
            System.out.println("boo");
            return mediana = algos.get(vidurys);
        }
    }
}
