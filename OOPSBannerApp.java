import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {

    // HashMap to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Method to load patterns
    public static void loadPatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // Method to print banner
    public static void printBanner(String word) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        loadPatterns();

        printBanner("OOPS");
    }
}
