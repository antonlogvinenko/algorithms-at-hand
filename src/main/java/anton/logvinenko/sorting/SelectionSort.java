package anton.logvinenko.sorting;

public class SelectionSort implements SortAlgorithm {

	@Override
	public void sort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int minimal = a[i];
			int minimalIndex = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < minimal) {
					minimal = a[j];
					minimalIndex = j;
				}
			}

			a[minimalIndex] = a[i];
			a[i] = minimal;
		}
	}
}
