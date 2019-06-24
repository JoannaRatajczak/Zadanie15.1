import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Methods {

    static Map<String, Country> addNewMap (File file) throws FileNotFoundException {
        Map<String, Country> countryMap = new HashMap<>();

        Scanner in = new Scanner(file);
        if (file.exists()) {
            while (in.hasNextLine()) {
                String countryString = in.nextLine();
                String[] split = countryString.split(";");
                Country country = new Country(split[0], split[1], Long.valueOf((split[2])));

                countryMap.put(country.getID(), country);
            }
        }
        in.close();

        return countryMap;
    }

}
