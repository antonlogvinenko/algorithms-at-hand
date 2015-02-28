package anton.logvinenko.sorting;

import static java.lang.Math.max;

/**
 * Just for lulz
 */
public class BubbleSortOptimized extends SortAlgorithm {

	@Override
	public void sort(int[] a) {
		boolean sorted = false;
		int p = 1;
		while (!sorted) {
			sorted = true;
			for (int i = max(p - 1, 0); i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
					if (sorted) {
						p = i;
					}
					sorted = false;
				}
			}
		}
	}
}
