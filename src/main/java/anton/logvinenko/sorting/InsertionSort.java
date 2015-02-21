package anton.logvinenko.sorting;

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
