import java.util.HashMap;
import java.util.Map;

public class MainCalulator {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 1);
		map.put("C", 1);
		map.put("D", 0);

		long bill = ItemData.calculatePromo(map);
		System.out.println(bill);

	}

}
