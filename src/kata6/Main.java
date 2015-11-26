package kata6;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException{
        String nameFile = "C:\\Users\\Salvador\\Documents\\0-Salvador\\ULPGC\\TERCERO\\Netbeans\\Practica 4 IS2\\emailsfilev1.txt";
        ArrayList<String> mailArray = MailListReader.read(nameFile);
             
        Histogram<String> histograma = MailHistogramBuilder.buil(mailArray);
        new HistogramDisplay(histograma).execute();

    }
    
}
