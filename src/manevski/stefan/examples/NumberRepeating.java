package manevski.stefan.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberRepeating {

	public static void main(String[] args) {
		List<Integer> elements = Arrays.asList(1, 6, 6, 6, 3 ,4, 11, 9, 5, 6, 4, 6, 6, 8, 6, 6, 6, 6, 9, 10);
        int n = elements.size() / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : elements) {
            map.putIfAbsent(element, 1);
            map.computeIfPresent(element, (key, value) -> map.get(key) + 1);

            if (map.get(element) >= n) {
                System.out.println(element);
                break;
            }
        }
	}
}
