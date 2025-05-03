public class ClockAngle {
    public static void main(String[] args) {
        System.out.println(clockAngle(2,20));
    }

    static double clockAngle(double hr, double min){
        double h = 0.5 * (60 * hr + min);
        double m = 6 * min;
        double angle = Math.abs(h - m);
        if (angle > 180){
            return 360 - angle;
        }
        return angle;
    }
}
