import java.io.*;
import java.lang.reflect.Array;

public class Sort3 {
	public static void main(String[] args) throws IOException{

		FileReader file = new FileReader("invent.txt");
		BufferedReader data = new BufferedReader(file);
      
		String[] dataInsert = new String[10]; 
		String[] dataMerge = new String[10]; 
		String[] dataQuick = new String[10]; 

      
		for (int i = 0; i < dataInsert.length; i++){
			dataInsert[i] = data.readLine();
		}
		dataMerge = dataInsert;
		dataQuick = dataInsert;

      
		long startTime = System.nanoTime();
      InsertionSort.Sort(dataInsert, 10);
		long insertTime = System.nanoTime() - startTime;
		System.out.println("Insertion Sort: " + insertTime);

		MergeSort.Sort(dataMerge);
		long mergeTime = System.nanoTime() - insertTime;
		System.out.println("Merge Sort: " + mergeTime);

		QuickSort.Sort(dataQuick);
		long quickTime = System.nanoTime() - mergeTime;
		System.out.println("Quick Sort: " + quickTime);

	}
}