import java.awt.geom.Rectangle2D;

public class Tricorn extends FractalGenerator {
    public static final int MAX_ITERATIONS = 1000;
    
    /**
     *
     * @param range
     */
    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -2;
        range.width = 4;
        range.height = 4;
    }
    
    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int numIterations(double a, double b) {
        double magSq;
        double re = a;
        double im = b;
        double nextRe;
        double nextIm;
        int i = 0;
        
        while (i < MAX_ITERATIONS) {
            i += 1;
            nextRe = a + re * re - im * im;
            nextIm = b + -2 * re * im;
            re = nextRe;
            im = nextIm;
            magSq = re * re + im * im;
            if (magSq > 4) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString() {
    	return "Tricorn";
    }
}