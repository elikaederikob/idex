import java.time.ZoneId;

public class TimezoneMapping {
    public static void main(String[] args) {
        // Original timezone identifier
        String originalTimezone = "Etc/UCT";

        // Mapping 'Etc/UCT' to 'Etc/UTC'
        String mappedTimezone = mapTimezone(originalTimezone);

        System.out.println("Mapped Timezone: " + mappedTimezone);
    }

    public static String mapTimezone(String originalTimezone) {
        if (originalTimezone.equals("Etc/UCT")) {
            return "Etc/UTC";
        } else {
            return originalTimezone; // Return original timezone if not 'Etc/UCT'
        }
    }
}
