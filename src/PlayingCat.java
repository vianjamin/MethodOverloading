public class PlayingCat {
    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 40));

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature <= 45 && temperature >=25) {
                return true;
            }
        } else if (temperature <= 35 && temperature >= 25) {
            return true;
        }
        return false;
        //temperature 25 to 35 cat is playing and during summer it is 25 to 45

    }
}
