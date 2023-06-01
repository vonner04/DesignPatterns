public class Main {
  public static void main(String[] args) {
      int[] numbers = {5, 2, 9, 1, 7};
      
      // Create an instance of ListMax
      ListMax listMax = new ListMax();
      
      // Create an instance of MaxListAdapter, passing ListMax as the parameter
      MaxListAdapter adapter = new MaxListAdapter(listMax);
      
      // Call the getMax method through the adapter
      int max = adapter.getMax(numbers);
      
      System.out.println("Max number: " + max);
  }
}