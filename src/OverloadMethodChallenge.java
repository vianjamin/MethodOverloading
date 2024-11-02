public class OverloadMethodChallenge {

    public static void main(String[] args) { //1 inch = 2.54 cm  |  1 foot = 12 inches
        System.out.println(convertToCentimeters(5) + " cm.");
        System.out.println(convertToCentimeters(6, 0) + " cm.");

    }

    public static double convertToCentimeters(int heightInInches) {
        //convert inches to centimeters and return centimeters as a double
        return (heightInInches * 2.54d);

    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        // convert feet and inches to just inches
        // call first method to get number of centimeters
        return convertToCentimeters((heightInFeet * 12) + remainingHeightInInches);


    }
}
