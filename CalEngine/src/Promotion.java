import java.util.Map;

public class Promotion {
	public int promoId;
	public Map<String, Integer> promoMap;
	public long promoPrice;

	public Promotion(int promoId, Map<String, Integer> promoMap, long promoPrice) {
		super();
		this.promoId = promoId;
		this.promoMap = promoMap;
		this.promoPrice = promoPrice;
	}

	public int getPromoId() {
		return promoId;
	}

	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}

	public Map<String, Integer> getPromoMap() {
		return promoMap;
	}

	public void setPromoMap(Map<String, Integer> promoMap) {
		this.promoMap = promoMap;
	}

	public long getPromoPrice() {
		return promoPrice;
	}

	public void setPromoPrice(long promoPrice) {
		this.promoPrice = promoPrice;
	}

}
