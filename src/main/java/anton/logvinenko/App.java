package anton.logvinenko;

import anton.logvinenko.sorting.SelectionSort;
import anton.logvinenko.sorting.SortAlgorithm;
import com.sun.tools.javac.util.ArrayUtils;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.String.format;
import static java.util.Arrays.asList;

/**
 * Hello world!
 */
public class App {

	private static void print(int[] array) {
		for (int a : array) {
			System.out.println(format("%s ", a));
		}
	}

	private static void validate(int[] array) {
		int last = MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < last) {
				throw new RuntimeException(format("Array is not sorted at index %s", i));
			}
			last = array[i];
		}
	}

	public static void main(String[] args) {
		SortAlgorithm selectionSort = new SelectionSort();

		int[] ints = new int[]{1, 100, -1000, 500, 499, 489, 490, 10, 6};

		selectionSort.sort(ints);
		print(ints);
		validate(ints);
	}
}
