public class MinutesYearsDays {
    public static void main(String[] args) {
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays(int minutes) {
        int days = (minutes / 1440);
        int years = 0;
        if (days >= 365) {
            years = (days / 365);
            int daysremaining = (days % 365);
            System.out.println(minutes + " min = " + years + " y and " + daysremaining + " d");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}
