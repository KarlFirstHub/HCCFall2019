import java.util.*;    // for java built in apps
public class MainDriver {
	public static final void main (String [] args) {

	BubbleSort bubbleSort = new BubbleSort();
  
    System.out.println("unsorted data");
	bubbleSort.Print();
	bubbleSort.Sort();
    System.out.println("sorted data");
	bubbleSort.Print();


  } // main method

 } // class