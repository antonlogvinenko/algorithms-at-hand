package anton.logvinenko.sorting;

/**
 * Array: [[0] [1 2 3 4 5]]
 *
 * Take the leftmost element E in the second partition,
 * find its place in the first partition.
 *
 * Shrink the second partition from the left side, repeat.
 */
public class InsertionSort extends SortAlgorithm {

	@Override
	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {

			for (int j = i; j > 0; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
				}
			}
		}
	}
}
