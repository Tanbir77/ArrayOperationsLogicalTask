package naztech.io.ArrayOperationsLogicalTask;
import java.util.stream.Stream;

public class LargestValuePairMult {

	private static int intArr[] = { 5, 6, 27, 40, 71, 2, 71 };
	private static int max1 = intArr[0], max2 = intArr[0];

	private static void accept(int i) {
		if (intArr[i] > max1) {
			max1 = intArr[i];

		} else if (intArr[i] > max2) {
			max2 = intArr[i];

		}
	}

	public static int maxValPairMultiplier() {

		Stream.iterate(0, element -> element + 1)
		.limit(intArr.length)
		.forEach(i -> accept(i));

		return max1 * max2;

	}
}
