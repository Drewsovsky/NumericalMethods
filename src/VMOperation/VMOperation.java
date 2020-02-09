/*
a)	добуток вектора і скаляра;
        b)	сума двох векторів;
c)	скалярний добуток векторів;
        d)	модуль вектора
e)	транспонування матриці;
f)	добуток матриці і скаляра;
g)	добуток матриці і вектора;
h)	сума двох матриць;
i)	добуток двох матриць;
 */

package VMOperation;

public class VMOperation {

    public static Vector sumOfVectors(Vector firstVector, Vector secondVector) {

        Vector vector = new Vector();

        double sumPointX = firstVector.getPointX() + secondVector.getPointX();
        double sumPointY = firstVector.getPointY() + secondVector.getPointY();

        if (firstVector.hasCoordinateZ() && secondVector.hasCoordinateZ()) {
            double sumPointZ = firstVector.getPointZ() + secondVector.getPointZ();
            vector.setPointXYZ(sumPointX, sumPointY, sumPointZ);

        } else {
            vector.setPointXY(sumPointX, sumPointY);
        }


        return vector;
    }

    public static Vector sumOfVectors(double pointX1, double pointY1, double pointX2, double pointY2) {

        Vector vector = new Vector();

        double sumPointX = pointX1 + pointX2;
        double sumPointY = pointY1 + pointY2;

        vector.setPointXY(sumPointX, sumPointY);

        return vector;
    }

    public static Vector sumOfVectors(double pointX1, double pointY1, double pointX2, double pointY2, double pointZ1, double pointZ2) {

        Vector vector = new Vector();

        double sumPointX = pointX1 + pointX2;
        double sumPointY = pointY1 + pointY2;
        double sumPointZ = pointZ1 + pointZ2;

        vector.setPointXYZ(sumPointX, sumPointY, sumPointZ);

        return vector;
    }

    public static double vectorModule(Vector mVector) {

        double result;

        if (mVector.hasCoordinateZ()) {
            result = Math.sqrt(mVector.getPointX() * mVector.getPointX() + mVector.getPointY() * mVector.getPointY() + mVector.getPointZ() * mVector.getPointZ());
        } else {
            result = Math.sqrt(mVector.getPointX() * mVector.getPointX() + mVector.getPointY() * mVector.getPointY());
        }

        return result;
    }

}
