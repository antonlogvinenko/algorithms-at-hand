package anton.logvinenko.sorting;

public class SelectionSort extends SortAlgorithm {

	@Override
	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int minimal = a[i];
			int minimalIndex = i;

			for (int j = i; j < a.length; j++) {
				if (a[j] < minimal) {
					minimal = a[j];
					minimalIndex = j;
				}
			}

			if (a[i - 1] > minimal) {
				swap(a, i - 1, minimalIndex);
			}
		}
	}
}
