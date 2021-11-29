 import java.util.HashMap;
 import java.util.Map;
 
public class MainCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 5);
		map.put("B", 5);
		map.put("C", 1);
		map.put("D", 0);

		long bill = ItemData.calculatePromo(map);
		System.out.println(bill);

	}

}
