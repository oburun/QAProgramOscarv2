import java.util.ArrayList;

public class Answer {

    public Answer(ArrayList<Oscar> oscars){
        display(oscars);
    }

    private void display(ArrayList<Oscar> oscars){
        for (Oscar o : oscars){
            System.out.println(o.toString());
        }
    }

}
