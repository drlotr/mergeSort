

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortTestCases {

	@Test
	public void testMergeSort() {
		int[] test1 = {-2, 0, 5, 3, 10};
		assertTrue(MergeSorter.mergeSort(test1, 0, 4) == {-2, 0, 3, 5, 10});
		
		int[] test2 = {-1, -3, -12, -5, -3};
		assertTrue(MergeSorter.mergeSort(test2, 0, 4) = -12, -5, -3, -3, -1);
	}
	//assertTrue tests if it is true that it returns 10
	//ArrayHelpers refers to the class, .maxElement calls the method
	//test1 is the test case, and 10 is what it should return.
}
