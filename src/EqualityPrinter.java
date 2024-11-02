public class EqualityPrinter {

    public static void main(String[] args) {

        printEqual(2,1,2);

    }
    public static void printEqual(int one, int two, int three) {

        if (one == two && one == three) {

            System.out.println("All numbers are equal");

        } else if (one == two || two == three || one == three) {

            System.out.println("Neither all are equal or different");

        } else if (one < 0 || two < 0 || three < 0 ) {

            System.out.println("Invalid value");

        } else {

             System.out.println("All numbers are different");

        }
    }

}
