import java.util.ArrayList;
import java.util.List;

public class uzduotis8{
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai = new ArrayList<>();

        skaiciai.add(109);
        skaiciai.add(205);
        skaiciai.add(304);
        skaiciai.add(804);
        skaiciai.add(104);
        skaiciai.add(205);

        System.out.println(skaiciai);
        System.out.println("maxIeskojimas(skaiciai) = " + maxIeskojimas(skaiciai));
        System.out.println("iIeskojimas(skaiciai) = " + iIeskojimas(skaiciai));
    }
    public static int maxIeskojimas(ArrayList<Integer> skaiciai){
        int laikinasMax = skaiciai.get(0);
        for (Integer skaicius: skaiciai) {
            if(skaicius > laikinasMax){
                laikinasMax = skaicius;
            }
        }
        return laikinasMax;
    }
    public static int iIeskojimas(ArrayList<Integer> skaiciai){
        int max = maxIeskojimas(skaiciai);
        for (int i = 0; i < skaiciai.size(); i++) {
            if (max == skaiciai.get(i)) {
                return i;
            }
        }
        return -1;
    }
}
