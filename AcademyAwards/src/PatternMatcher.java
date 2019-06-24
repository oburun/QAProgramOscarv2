import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    private boolean validity = false;
    private ArrayList<String> keywords = new ArrayList<String>();
    int regex_control;


    //get pattern from PatternList's patternList and find keywords.
    public void match(String question_sentence){
        int i=0;
        while(!validity){
            for (Pattern p : PatternList.patternList ){
                Matcher m = p.matcher(question_sentence);
                if(m.find()){
                    validity=true;
                    for (int j = 0; j < m.groupCount() + 1 ; j++){
                        keywords.add(m.group(j));
                    }
                    regex_control=i;
                    if(validity){
                        break;
                    }
                }
                i++;
            }
        }
    }



    public ArrayList<String> get_keywords()
    {
        return this.keywords;
    }

    public boolean get_validity() {return validity;}

    public int getRegex_control() {return regex_control;}
}
