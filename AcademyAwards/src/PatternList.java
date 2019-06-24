import java.util.ArrayList;
import java.util.regex.Pattern;

public class PatternList {
    static ArrayList<Pattern> patternList = new ArrayList<Pattern>();

    public static void add(Pattern p){
        patternList.add(p);

    }
    public  static Pattern getPattern(int index){
        return patternList.get(index);

    }

    public  static int getIndex(Pattern p){

        return patternList.indexOf(p);
    }
}
