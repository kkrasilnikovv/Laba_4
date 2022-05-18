public class ThreeDimensionalCoordinate {
    private double X;
    private double Y;
    private double Z;


    public ThreeDimensionalCoordinate(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }

    @Override
    public String toString() {
        return "ThreeDimensionalCoordinate{" +
                "X=" + X +
                ", Y=" + Y +
                ", Z=" + Z +
                '}';
    }
}
