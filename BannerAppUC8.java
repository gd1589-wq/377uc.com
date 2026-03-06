import java.util.*;

public class BannerAppUC8 {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        loadPatterns();

        String word = "OOPS";

        printBanner(word);
    }

    // Load character patterns into Map
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

    // Function to render banner
    public static void printBanner(String text) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (char ch : text.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }
}