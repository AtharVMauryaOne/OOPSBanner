public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = generateO();
        String[] p = generateP();
        String[] s = generateS();

        // Loop-based rendering
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + p[i] + "  " + s[i]);
        }
    }

    // Static helper method for O
    public static String[] generateO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static helper method for P
    public static String[] generateP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static helper method for S
    public static String[] generateS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}
