package matrix4x4;

/**
 *
 * @author bj.brassard
 */
public class Matrix4x4 {

    private double[][] elements = new double[4][4];

    public Matrix4x4() {
        this.identity();
    } // Operator()

    public double get(int row, int column) {
        return this.elements[row][column];
    } // get( int, int )

    public void set(int row, int column, double value) {
        this.elements[row][column] = value;
    } // set( int, int, double )

    public final void identity() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    this.set(i, j, 1.0);
                } // if
                else {
                    this.set(i, j, 0.0);
                } // else
            } // for
        } // for
    } // identity()

    public static void main(String[] args) {

    }

}
