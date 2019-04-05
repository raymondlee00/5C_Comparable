/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer,
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
      	Point other = (Point) otherObj;
      	Double dist0 = Math.pow(Math.pow(this.xcor, 2) + Math.pow(this.ycor, 2), 0.5);
      	Double dist1 = Math.pow(Math.pow(other.xcor, 2) + Math.pow(other.ycor, 2), 0.5);
      	int result = Double.compare(dist0, dist1);
        return result; // temp: all Points are One
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
