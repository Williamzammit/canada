// 03/05/2024
// WJZ Unit Four Assignment
// 100% (Level 4+++)

// Generates seventeen shapes to construct an image of the canadian flag, 
// using the exact values in the official construction sheet.


package u4a;

public final class CircleValues {
    private static final double radi1 = 13;
    private static final double radi2 = 19;
    public static final double[] circleXPoints = {
        findXFromCentreAL(-27.929), findXFromCentre(-191.921), 
        findXFromCentre(-335.172), findXFromCentre(-248.934), 
        findXFromCentre(-121.862), findXFromCentre(-78.043), 
        findXFromCentre(78.043), findXFromCentre(121.862), 
        findXFromCentre(248.934), findXFromCentre(335.172), 
        findXFromCentre(191.921), findXFromCentreAL(27.929)};
    public static final double[] circleYPoints = {
        findYFromCentreAL(-232.423), findYFromCentre(-175.553), 
        findYFromCentre(18.517), findYFromCentre(126.683), 
        findYFromCentre(89.111), findYFromCentre(275.467), 
        findYFromCentre(275.467), findYFromCentre(89.111), 
        findYFromCentre(126.683), findYFromCentre(18.517), 
        findYFromCentre(-175.553), findYFromCentreAL(-232.423), 
    };
    public static final double[] circleRadius = {
        radi2/2, radi1/2, radi1/2, radi1/2, radi1/2, radi1/2, 
        radi1/2, radi1/2, radi1/2, radi1/2, radi1/2, radi2/2};


    public static double findXFromCentre(double value){
        return  480 + ((value-radi1)/2);
    }
    public static double findXFromCentreAL(double value){
        return 480 + ((value-radi2)/2);
    }
    public static double findYFromCentre(double value){
        return 240 - ((value+radi1)/2);
    }
    public static double findYFromCentreAL(double value){
        return 240 - ((value+radi2)/2);
    }
}
