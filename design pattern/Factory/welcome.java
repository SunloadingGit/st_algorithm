package algorithm.Factory;


public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//新建工厂
		FactoryVendor factoryvendor = new FactoryVendor();
		String[] names = {"Milk","Banana","Apple"};
		int count = 1;
		for(String name:names) {
		//根据名称，工厂返回对应的实现类对象
		Vendor vendor = factoryvendor.getVendor(name);
		//调用实现类对象的方法
		System.out.println("您订购的"+"第"+count+++"台"+"自动售货机主要供应"+vendor.supply());
		}
	}

}
