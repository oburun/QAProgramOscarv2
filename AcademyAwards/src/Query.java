import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Query {
    Answer answer;
    Locale trlocale = new Locale("tr-TR");
    ArrayList<Oscar> oscars = new ArrayList<Oscar>();

    public Query(int regex_no, ArrayList<String> keywords)
    {
        find(regex_no, keywords);
    }

    //find in oscarList and create answer
    private void find(int regex_no, ArrayList<String> keywords){
        if (regex_no<6){
            for (Oscar o : OscarList.oscarList){
                if (o.getYear().equalsIgnoreCase(keywords.get(1))){
                    if(o.getCategory().toLowerCase(trlocale).equalsIgnoreCase(keywords.get(2))){
                        oscars.add(o);
                        answer = new Answer(oscars);
                    }
                }
            }
        }else if(regex_no<10){
            for (Oscar o : OscarList.oscarList){
                if (o.getMovie().equalsIgnoreCase(keywords.get(1))){
                    oscars.add(o);
                    answer = new Answer(oscars);
                }
            }
        }else{
            for (Oscar o : OscarList.oscarList){
                if (o.getArtist().equalsIgnoreCase(keywords.get(1))){
                    oscars.add(o);
                    answer = new Answer(oscars);
                }
            }
        }
    }


}
