import java.util.ArrayList;
import java.util.List;

public class uzduotis4 {
    public static void main(String[] args) {

        ArrayList<String> zodziuListas = new ArrayList<>();

        zodziuListas.add("Kebabas");
        zodziuListas.add("Pica");
        zodziuListas.add("Kiauliena");
        zodziuListas.add("Šašlykas");
        zodziuListas.add("Paella");
        zodziuListas.add("Čili");
        zodziuListas.add("JamesBond");
        zodziuListas.add("RūkymasKenkiaSveikatai");

        int x = 8;

        System.out.println("zodzioIlgis() = " + zodziuIlgiaiListas(zodziuListas));

        ArrayList<Integer> zodziuIlgiai = zodziuIlgiaiListas(zodziuListas);


        System.out.println("rastiSkaicius(x, zodziuIlgiai) = " + rastiSkaicius(x, zodziuIlgiai));

    }

    public static ArrayList<Integer> zodziuIlgiaiListas(ArrayList<String> zodziuListas){
        ArrayList<Integer> zodziuIlgiaiSKC = new ArrayList<>();
        for (int i = 0; i < zodziuListas.size(); i++) {
            zodziuIlgiaiSKC.add(zodziuListas.get(i).length());
        }
        return zodziuIlgiaiSKC;
    }
    public static int rastiSkaicius(int x, ArrayList<Integer>zodziuIlgiaiListe){
        int kiekdaugiau = 0;
        for (int i = 0; i < zodziuIlgiaiListe.size(); i++) {
            if(x < zodziuIlgiaiListe.get(i)){
            kiekdaugiau++;
            }
        }
        return kiekdaugiau;
    }
}
