// SearchTest.java

public class SearchTest
{
  public static void main( String[] args )
  {
    int[] intArray = { 5, 6, 8, 2, 3 };
    System.out.println( linearSearch(intArray, 2) );
    
    int[] intArray2 = { 2, 6, 78, 234, 456, 767 };
    System.out.println( binarySearch(intArray2, 767 ) );
    
  }
  
  public static int linearSearch( int[] array, int key )
  {
    int size = array.length;
    
    for ( int i = 0; i < size; i++ )
    {
      if ( array[i] == key )
      {
        return i;
      }
    }
    // 0
    // 1
    return -1;
  }
  
  public static int binarySearch( int[] array, int key )
  {
    int low = 0;
    int high = array.length - 1;
    
    while ( low <= high ) // more elements to search
    {
      int middle = low + (high - low) / 2;
      
      if ( key < array[middle] )
      {
        high = middle - 1;
      }
      else if ( key > array[middle] )
      {
        low = middle + 1;
      }
      else 
      {
        return middle;
      } 
    }
    return -1;  
  }
}
