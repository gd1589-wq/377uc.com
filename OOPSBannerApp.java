public class OOPSBannerApp {

    public static void main(String[] args) {

        // Double-line OOPS banner
        String[] banner = {

                "   ******      ******     ********      ******  ",
                "  **    **    **    **    **      **   **       ",
                " **      **  **      **   **      **  **        ",
                " **      **  **      **   **      **    **      ",
                " **      **  **      **   ********       ***    ",
                " **      **  **      **   **                **  ",
                " **      **  **      **   **                 ** ",
                "  **    **    **    **    **                **  ",
                "   ******      ******     **           ******   "

        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}