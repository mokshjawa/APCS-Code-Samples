public class RecursionTest1
{
  public static void test( int n )
  {
    if ( n > 0 )
    {
      System.out.println(n);
      test( n - 1 ); // recursion
    }
  }
  
  public static void main( String[] args )
  {
    test(3);
  }
}