package naztech.io.ArrayOperationsLogicalTask;

import java.util.stream.Stream;

public class FrequencyCount {

	
	public static int [] arrFrequencyCount(int intArray1 [] ,int maxVal ) {

		int [] intArray2=new int[maxVal+1];
		Stream.iterate(0, element -> element + 1)
		.limit(intArray1.length)
		.forEach(i -> intArray2[intArray1[i]]++);
		
		printArrayFrequency(intArray2);
		
		return intArray2;

	}
	public static boolean printArrayFrequency(int [] intArray2) {
		
		Stream.iterate(0, element -> element + 1)
		.limit(intArray2.length)
		.filter(i -> intArray2[i] > 0)
		.forEach(i -> System.out.println("Frequency of " + i + ": " + intArray2[i]));
		
		return true;
		
	}
}
