import java.util.ArrayList;

public class uzduotis5 {
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

        int x = 12221;

        // System.out.println("arLyginis = " + arLyginis(x));
        // System.out.println("koDaugiau(listas) = " + koDaugiau(listas));
        patikrinimas(listas);
    }

    public static boolean arLyginis(int x){
        if(x % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int koDaugiau (ArrayList<Integer> listas){
        int sumaTRUE = 0;
        int sumaFALSE = 0;
        for (int i = 0; i < listas.size(); i++) {
            if(arLyginis(listas.get(i))){
                sumaTRUE++;
            }
            else {
                sumaFALSE++;
            }
                /** if(sumaTRUE > sumaFALSE){
                    return 1;
                }
                else if(sumaTRUE < sumaFALSE){
                    return -1;
                }
                else{
                    return 0;
                }*/
        }
        return sumaTRUE - sumaFALSE;
    }
    public static int patikrinimas(ArrayList<Integer> listas){
        if(koDaugiau(listas) > 0) {
            System.out.println("Lyginių skaičių daugiau nei nelyginių");
            return 1;
        }
        else if(koDaugiau(listas) < 0){
            System.out.println("Nelyginių skaičių daugiau nei lyginių");
            return -1;
        }
        else{
            System.out.println("Tiek lyginių, tiek nelyginių skaičių yra vienodas kiekis");
            return 0;
        }
    }

}
