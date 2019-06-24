import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File ("C:/Users/rtaj/Desktop/countries.txt");
        Map<String, Country> countryMap = Methods.addNewMap(file);

        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        Set<String> keySet = countryMap.keySet();
        System.out.println("Kody: "+keySet);

        Scanner scan = new Scanner(System.in);
        String ID = scan.nextLine();
        System.out.println(countryMap.get(ID));
        // Chciałam w metodzie ale szczerze tutaj to jedna linijka
        // Tylko nie wiem czy mogłam sobie tak napisać country.toString();


    }
}
