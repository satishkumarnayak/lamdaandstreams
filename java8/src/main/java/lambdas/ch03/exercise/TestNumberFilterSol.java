package lambdas.ch03.exercise;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestNumberFilterSol {

	@Test
	public void test() {

		List<Integer> list = Arrays.asList(1, 2, 43, 5, -234, 23, 6, 7, 19);
		printList(list, (number) -> number % 2 == 0);
		printList(list, (number) -> number % 2 != 0);
		printList(list, number -> number > 0);
		printList(list, (Integer number) -> number < 0);
	}

	public void printList(List<Integer> list, NumberFilterSol filter) {

		for (Integer number : list) {
			if (filter.filterNumber(number)) {
				System.out.println(number);
			}

		}
		System.out.println("=================");
	}
}