package naztech.io.ArrayOperationsLogicalTask;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FrequencyCountTest {

	@Test
	public void testArrFrequencyCount() {
		assertThat(new int[] {0,1,2,1,1,0,1},is(FrequencyCount.arrFrequencyCount(new int[] { 3, 1, 2, 6, 4, 2 }, 6) ));
	}

}
