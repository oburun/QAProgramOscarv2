import java.util.ArrayList;

public class OscarList {
    static ArrayList<Oscar> oscarList = new ArrayList<Oscar>();

    public static void add(Oscar o){
        oscarList.add(o);
    }

    public static Oscar getOscar(int index){
        return oscarList.get(index);
    }
}
