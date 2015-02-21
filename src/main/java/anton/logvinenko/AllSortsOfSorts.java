package anton.logvinenko;

import anton.logvinenko.sorting.InsertionSort;
import anton.logvinenko.sorting.SelectionSort;
import anton.logvinenko.sorting.SortAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.String.format;
import static java.lang.System.currentTimeMillis;

/**
 * Hello world!
 */
public class AllSortsOfSorts {

	private static final List<Class<? extends SortAlgorithm>> sortsAlgorithms =
		new ArrayList<>();

	static {
		sortsAlgorithms.add(InsertionSort.class);
		sortsAlgorithms.add(SelectionSort.class);
	}

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
		Random rand = new Random(currentTimeMillis());
		int length = 1000;

		Stream<SortAlgorithm> ss = sortsAlgorithms.stream().map(x -> {
			try {
				return x.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		});

		ss.forEach(algorithm -> {
			for (int i = 0; i < 1000; i++) {
				int[] unsorted = rand.ints().limit(length).toArray();
				algorithm.sort(unsorted);
				validate(unsorted);
			}
		});
	}
}
