package kata6;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException{
        String nameFile = "C:\\Users\\Salvador\\Documents\\0-Salvador\\ULPGC\\TERCERO\\Netbeans\\Practica 4 IS2\\emailsfilev1.txt";
        ArrayList<Person> mailArray = MailListReader.read(nameFile);
          
        HistogramBuilder <Person> builder = new HistogramBuilder<>(mailArray);
        
        Histogram<String> domains = builder.build(new Attribute<Person, String>() {

            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];
            }
        });
        
        Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {

            @Override
            public Character get(Person item) {
                return item.getMail().charAt(0);
            }
        });
                
        new HistogramDisplay(domains,"DOMINIOS").execute();
        new HistogramDisplay(letters,"LETTERS").execute();
        
        //Histogram<String> histograma = MailHistogramBuilder.buil(mailArray);
        //new HistogramDisplay(histograma).execute();

        
    }
    
}
