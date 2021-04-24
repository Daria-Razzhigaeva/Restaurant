package takeout.utils;

import static takeout.utils.PrintUtils.CommonPrintMethods.*;

public class PrintUtils {

    private final static String LINE = "_____________________________";
    private final static String TITLE_LINE = "______________________Take Out Menu_________________________";
    private final static String MAIN_DISHES_TITLE = "Our Best Main Dishes:";
    private final static String SIDES_TITLE = "Our Healthy Sides:";
    private final static String DRINKS_TITLE = "Drinks:";

    public final static class CommonPrintMethods {
        public static void print(String text) {
            System.out.print(text);
        }

        public final static void println() {
            System.out.println();
        }

        public static void printLine() {
            println();
            print(LINE);
        }
    }

    public static class PrintTitles {

        public static void printMenuTitle() {
            println();
            println();
            print(TITLE_LINE);
            println();
            println();
        }

        public static void printMainDishesTitle() {
            print(MAIN_DISHES_TITLE);
            println();
            println();
        }

        public static void printSidesTitle() {
            print(SIDES_TITLE);
            println();
            println();
        }

        public static void printDrinksTitle() {
            print(DRINKS_TITLE);
            println();
            println();
        }

        public static void printPrice(double price) {
            if (price < 10) {
                print("$ " + price);
            } else {
                print("$" + price);
            }
        }
    }

    public static class printSpaces{

        private static int maxLength = 0;

        private static int maxLengthName(String[] names) {
            for (int i = 0; i < names.length; i ++) {
                if (names[i].length() > maxLength) {
                    maxLength = names[i].length();
                }
            }
            return maxLength;
        }

        public static int spacesAfterName(String[] names, String[] names1, String[] names2, String name) {
            maxLength = maxLengthName(names);
            int maxLength1 = maxLengthName(names1);
            int maxLength2 = maxLengthName(names2);

            if (maxLength < maxLength1) {
                maxLength = maxLength1;
            } else if (maxLength < maxLength2) {
                maxLength = maxLength2;
            }

            int count = maxLength - name.length();
            return count;
        }

        public static void printSpacesAfterName(int spacesCount) {
            for (int i = 0; i <= spacesCount; i++) {
                print(" ");
            }
        }
    }
}
