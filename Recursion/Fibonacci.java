public class Fibonacci
{
  public static void main( String[] args )
  {
    int numPrinted = 10;
    int[] series = new int[numPrinted];
    
    // Create first 2 series elements
    series[0] = 0;
    series[1] = 1;
    
    // Create series
    for ( int i = 2; i < numPrinted; i++ )
    {
      series[i] = series[i-1] + series[i-2];
    }
    
    // Print series
    System.out.println( "Fibonacci Series of " + numPrinted + " numbers!" );
    for ( int i = 0; i < numPrinted; i++ )
    {
      System.out.print( series[i] + " " );
    }
  }
}