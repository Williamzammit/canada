// 03/05/2024
// WJZ Unit Four Assignment
// 100% (Level 4+++)

// Generates seventeen shapes to construct an image of the canadian flag, 
// using the exact values in the official construction sheet.


package u4a;

public final class RectangleValues {
    public static final double[] rect1XPoints = {
        calcXPoint(-18), calcXPoint(-8.995), calcXPoint(-31.229), calcXPoint(-203),
        calcXPoint(-179.705), calcXPoint(-183.740), calcXPoint(-372), calcXPoint(-329.678),
        calcXPoint(-322.808), calcXPoint(-360), calcXPoint(-251.637), calcXPoint(-236.968),
        calcXPoint(-216), calcXPoint(-131.369), calcXPoint(-109.101), calcXPoint(-150),
        calcXPoint(-84.543), calcXPoint(-66.460), calcXPoint(0), calcXPoint(66.460),
        calcXPoint(84.543), calcXPoint(150), calcXPoint(109.101), calcXPoint(131.369),
        calcXPoint(216), calcXPoint(236.968), calcXPoint(251.637), calcXPoint(360),
        calcXPoint(322.808), calcXPoint(329.678), calcXPoint(372), calcXPoint(183.740),
        calcXPoint(179.705), calcXPoint(203), calcXPoint(31.229), calcXPoint(8.955),
        calcXPoint(18), //Start of Edge
        calcXPoint(18), calcXPoint(480), calcXPoint(480),
        calcXPoint(-480), calcXPoint(-480), calcXPoint(-18)
    };
    public static final double[] rect1YPoints = {
        calcYPoint(-406), calcYPoint(-233.418), calcYPoint(-213.712), calcYPoint(-244),
        calcYPoint(-179.999), calcYPoint(-165.450), calcYPoint(-13), calcYPoint(6.735),
        calcYPoint(22.534), calcYPoint(137), calcYPoint(113.967), calcYPoint(121.603),
        calcYPoint(171), calcYPoint(80.245), calcYPoint(91.591), calcYPoint(302),
        calcYPoint(264.208), calcYPoint(269.565), calcYPoint(400), calcYPoint(269.565),
        calcYPoint(264.208), calcYPoint(302), calcYPoint(91.591), calcYPoint(80.245),
        calcYPoint(171), calcYPoint(121.603), calcYPoint(113.967), calcYPoint(137),
        calcYPoint(22.534), calcYPoint(6.735), calcYPoint(-13), calcYPoint(-165.450),
        calcYPoint(-179.999), calcYPoint(-244), calcYPoint(-213.712), calcYPoint(-233.418),
        calcYPoint(-406), calcYPoint(-480), calcYPoint(-480), calcYPoint(480),
        calcYPoint(480), calcYPoint(-480), calcYPoint(-480)
    };

    public static final double[] rect2XPoints = {calcXPoint(-18), calcXPoint(18), calcXPoint(18), calcXPoint(-18)};
    public static final double[] rect2YPoints = {calcYPoint(-406), calcYPoint(-406), calcYPoint(-480), calcYPoint(-480)};

    public static double calcXPoint(double xPoint){
        return 480 + (xPoint/2);
    }

    public static double calcYPoint(double yPoint){
        return 240 - (yPoint/2);
    }
}
