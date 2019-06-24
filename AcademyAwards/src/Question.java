import java.util.ArrayList;
import java.util.Scanner;

public class Question {

    PatternMatcher pm = new PatternMatcher();
    Query a;
    String sentence;

    public Question(String sentence){
        this.sentence=sentence;
        matchQuestion(sentence);
    }

    //get keywords from patterns and create query
    void matchQuestion(String sentence){

        pm.match(sentence);
        if(pm.get_validity()){
            a = new Query(pm.getRegex_control(), pm.get_keywords());
        }else{
            System.out.println("Geçersiz Cümle !");
        }
    }
}
