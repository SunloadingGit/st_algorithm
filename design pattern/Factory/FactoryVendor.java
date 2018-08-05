package algorithm.Factory;

/*
 * 工厂
 */
public class FactoryVendor {

	public Vendor getVendor(String good) {
		if(good.equalsIgnoreCase("Milk")) {
			return new MilkVendor();
		}
		if(good.equalsIgnoreCase("Apple")) {
			return new AppleVendor();
		}
		if(good.equalsIgnoreCase("Banana")) {
			return new BananaVendor();
		}
		return null;
	}
}
