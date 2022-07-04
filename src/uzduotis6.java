import java.lang.reflect.Array;
import java.util.ArrayList;

public class uzduotis6 {
    public static void main(String[] args) {

        ArrayList<Boolean> loginiai = new ArrayList<>();

        loginiai.add(true);
        loginiai.add(true);
        loginiai.add(true);
        loginiai.add(false);
        loginiai.add(false);
        loginiai.add(true);
        loginiai.add(false);
        loginiai.add(false);
        loginiai.add(true);
        loginiai.add(false);
        loginiai.add(false);
        loginiai.add(false);
        loginiai.add(false);
        loginiai.add(true);
        loginiai.add(true);

        ArrayList<Integer> dvinariai = loginiuATS(loginiai);

        System.out.println(loginiai);
        System.out.println(loginiuATS(loginiai));
        System.out.println(binaryString(dvinariai));
    }
    public static ArrayList<Integer> loginiuATS(ArrayList<Boolean> loginiai){
        ArrayList<Integer> dvinariai = new ArrayList<>();
        for (int i = 0; i < loginiai.size(); i++) {
            if (loginiai.get(i).equals(true)) {
                dvinariai.add(1);
            }
            else{
                dvinariai.add(0);
            }
        }
        return dvinariai;
    }
    public static String binaryString(ArrayList<Integer>dvinariai){
        String binaryZodziu = new String();
        for (int i = 0; i < dvinariai.size(); i++) {
            binaryZodziu += dvinariai.get(i).toString();
        }
        return binaryZodziu;

    }
}
