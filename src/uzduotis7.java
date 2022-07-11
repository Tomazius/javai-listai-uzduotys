import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class uzduotis7 {
    public static void main(String[] args) {

        int x = 2583;


        ArrayList<Integer> skaitmenai = skaitmenys(x);
        System.out.println(sutvarkyti(skaitmenai));
    }
    public static ArrayList<Integer> skaitmenys(int x){
        ArrayList<Integer> skaitmenai = new ArrayList<>();
        while (x > 0){
            skaitmenai.add(x % 10);
            x = x / 10;
            System.out.println(skaitmenai);

        }
        return skaitmenai;
    }
    public static ArrayList<Integer> sutvarkyti(ArrayList<Integer> skaitmenai){
        Collections.reverse(skaitmenai);
        return skaitmenai;
    }


    /**public static String skaitmenys(int x){
        String pakaitalas = Integer.toString(x);
        return pakaitalas;
    }

    public static int[] pakeistiIintList(String skaiciaiTekstu){
        ArrayList<Integer> sarasas = new ArrayList<>();
        for (int i = 0; i < skaiciaiTekstu.length(); i++) {
            skaiciaiTekstu.get(1);
        }
    }*/
}
