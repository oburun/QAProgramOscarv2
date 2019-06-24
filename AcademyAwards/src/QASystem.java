import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class QASystem {



    public static void main(String[] args)
    {
        Locale trlocale = new Locale("tr-TR");

        //load oscar objects
        String data[] = new String[4];
        File file = new File("awards.txt");
        try {
            Scanner sc = new Scanner(new FileInputStream(file));
            while (sc.hasNextLine()){
                StringTokenizer token = new StringTokenizer(sc.nextLine(),"?");
                int i = 0;
                while (token.hasMoreTokens()){
                    data[i] = token.nextToken();
                    i++;
                }
                Oscar o = new Oscar(data[0],data[1],data[2],data[3]);
                OscarList.add(o);
            }
        }catch (FileNotFoundException e){
            System.out.println("veritabanına bir şeyler olmuş !");
        }

        //load pattern objects
        File fileRegex = new File("regex.txt");
        int i=0;
        try {
            Scanner sc = new Scanner(new FileInputStream(fileRegex));
            while (sc.hasNextLine()){
                PatternList.add(Pattern.compile(sc.nextLine()));
                i++;
            }
        }catch (FileNotFoundException e){
            System.out.println("veritabanına bir şeyler olmuş !");
        }
        //enter question sentence and create question object
        Question q;
        System.out.println("Oscar Sorgulama Sistemi'ne hoşgeldiniz.");
        q=new Question(ask());
    }


    public static String ask()
    {
        System.out.println("Sorunuzu yazın:");

        Scanner read = new Scanner(System.in);
        String sentence = read.nextLine();

        return sentence;
    }

}
