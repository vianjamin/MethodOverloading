public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(23879));
    } //method takes time in seconds, convert seconds to hours with remaining seconds and minutes in a string

    public static String getDurationString(int seconds) {//first method should call second method to return its results
        if (seconds < 0) {
            return "Invalid value";
        } else {
            int minutes = (seconds / 60);
            int secondsRemaining = (seconds - (minutes * 60));
            return getDurationString(minutes, secondsRemaining);
        }
        //3800 / 60 = 63 minutes / 60 = 1  (1 h 3 min 20 sec

    }//both methods return a string in the format XXh YYm ZZs

    public static String getDurationString(int minutes, int secondsRemaining) {

        int hours = (minutes / 60);
        int minutesRemaining = (minutes - (hours * 60));
        if (minutesRemaining > 59 || minutesRemaining < 0) {
            return "Error";
        }
        return hours + " H " + minutesRemaining + " M " + secondsRemaining + " S ";

    }

}
