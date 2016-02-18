public class RecursionTest
{
  public static void main( String[] args )
  {
    test(3);
    test2(3);
  }
  
  public static void test( int n )
  {
    if ( n > 0 ) // base case
    {
      System.out.println(n);
      test( n - 1 ); // n - 1 = non-base case
    }
  }
  // test 3
  // print 3
  // test 2
  // print 2
  // test 1
  // print 1
  // test 0
  
  public static void test2( int n )
  {
    if ( n > 0 ) // base case
    {
      for ( int i = 1; i <= n; i++ )
      {
        System.out.print("*");  // print out n *s on a line
      }
      System.out.println(); // next row starts on new line
      test2( n - 1 ); // n-1 = non-base case
    }
  }
    
}
