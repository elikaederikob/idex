public class TruncateExample {

    public static void main(String[] args) {
        String originalString = "This is a long string that needs to be truncated at the end of the line.";
        int maxLength = 30; // Maximum length of the truncated string
        
        String truncatedString = truncateString(originalString, maxLength);
        
        System.out.println("Original String: " + originalString);
        System.out.println("Truncated String: " + truncatedString);
    }

    public static String truncateString(String str, int maxLength) {
        if (str.length() <= maxLength) {
            return str; // No truncation needed if string is already within limit
        } else {
            return str.substring(0, maxLength); // Truncate string to maxLength characters
        }
    }
}
