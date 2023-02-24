package hashMaps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaps1 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "adi");
		map.put(12, "mariyam");
		map.put(5, "sue");
		map.put(7, "paul");
		map.put(8, "sam");

		System.out.println(map.get(12));

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for (Entry<Integer, String> item : entrySet) {
			System.out.println(item.getKey() + " " + item.getValue());
		}

	}

}
