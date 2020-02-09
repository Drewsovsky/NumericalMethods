package VMOperation;

public class Vector {

    private double pointX, pointY;
    private Object pointZ;

    public Vector() {

    }

    public Vector(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public Vector(double pointX, double pointY, double pointZ) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
    }

    public boolean hasCoordinateZ() {
        return pointZ != null;
    }

    public void setPointXY(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public void setPointXYZ(double pointX, double pointY, double pointZ) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double getPointZ() {
//        double result = Double.valueOf(this.pointZ.toString());

//        Double d = null;
//        if (pointZ instanceof Double || pointZ instanceof Integer) {
//            d = (Double) pointZ;
//        }
//
//        return d;
        return (Double) this.pointZ;
    }

    public void setPointZ(double pointZ) {
        this.pointZ = pointZ;
    }

    @Override
    public String toString() {
        if (this.hasCoordinateZ()) {
            return "Point [ x ] : " + pointX +
                    "\nPoint [ y ] : " + pointY +
                    "\nPoint [ z ] : " + pointZ;
        } else {
            return "Point [ x ] : " + pointX +
                    "\nPoint [ y ] : " + pointY;
        }

    }

}
