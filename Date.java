/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

  	public int compareTo(Object otherObj) {
      	Date other = (Date) otherObj;
    	int result = Integer.compare(this.y, other.y);
      	if (result == 0) {
      		result = Integer.compare(this.m, other.m);
      	}
      	if (result == 0) {
      		result = Integer.compare(this.d, other.d);
      	}
      	return result * -1;
    }

}
