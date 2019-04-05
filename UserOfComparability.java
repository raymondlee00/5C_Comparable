/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");

        System.out.println( System.lineSeparator()
                          + "Date comparisons");

      	Date d0 = new Date(2002, 1, 1);
      	reportRelationship( "Dates", d0
                          , new Date( 2002, 1, 1), "0");

      	reportRelationship( "Dates", d0
                          , new Date( 2002, 1, 2), "1");

      	reportRelationship( "Dates", d0
                          , new Date( -2002, 1, 2), "-1");

      	reportRelationship( "Dates", d0
                          , new Date( 1000000000, 1, 2), "1");

      	// IncomparableDog dinner = new IncomparableDog();
      	// reportRelationship( "Dates", dinner
        //                   , new IncomparableDog(), "cannot compare");


    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship
      ( String description
      , Point a
      , Point b
      , String expect
      ) {
        System.out.println( description);

        // check
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning:
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */

          + " ...expecting " + expect
          + System.lineSeparator());
     }

  	private static void reportRelationship
      ( String description
      , Date a
      , Date b
      , String expect
      ) {
        System.out.println( description);

        // check
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning:
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */

          + " ...expecting " + expect
          + System.lineSeparator());
     }

  	// private static void reportRelationship
    //   ( String description
    //   , IncomparableDog a
    //   , IncomparableDog b
    //   , String expect
    //   ) {
    //     System.out.println( description);
    //
    //     // check
    //     System.out.println(
    //         a + " compareTo " + b + ": "
    //       + a.compareTo( b)
    //         /* eventually expecting a compiler warning:
    //           warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
    //          where T is a type-variable:
    //             T extends Object declared in interface Comparable
    //          */
    //
    //       + " ...expecting " + expect
    //       + System.lineSeparator());
    //  }
}
