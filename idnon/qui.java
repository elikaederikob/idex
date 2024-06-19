import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<String[]> readCSV(String filePath) {
        List<String[]> profiles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] profile = line.split(",");
                profiles.add(profile);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions appropriately: log error, notify user, etc.
        }
        return profiles;
    }

    public static void main(String[] args) {
        List<String[]> profiles = readCSV("daily.csv");
        // Further processing on profiles if needed
    }
}

