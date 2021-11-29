import java.util.Map;

public class ItemData {

	public static long GetPriceById(Item id) {

		if (id.SKUId == "A")
			return 50l;
		else if (id.SKUId == "B")
			return 30l;
		else if (id.SKUId == "C")
			return 20l;
		else if (id.SKUId == "D")
			return 15l;
		return 0;

	}

	public static long calculatePromo(Map<String, Integer> map) {
		// TODO Auto-generated method stub

		long totalA = (map.get("A") / 3) * 130 + (map.get("A") % 3 * (GetPriceById(new Item("A"))));
		long totalB = (map.get("B") / 2) * 45 + (map.get("B") % 2 * (GetPriceById(new Item("B"))));
		long totalC = 0l;
		long totalD = 0l;

		if (map.get("C") > 0 && map.get("D") > 0 && (map.get("C") == map.get("D"))) {
			totalC = map.get("C") * 30;
		} else {
			totalC = (map.get("C") * (GetPriceById(new Item("C"))));
			totalD = (map.get("D") * (GetPriceById(new Item("D"))));

		}


		return totalA + totalB + totalC + totalD;

	}

}
