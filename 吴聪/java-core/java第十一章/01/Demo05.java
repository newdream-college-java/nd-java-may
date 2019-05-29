public class Demo05 {
	String brand;
	int price;
	String color;

	public String toString() {
		return brand + price + color;
	}

	public void start() {
		System.out.println(brand + "品牌的汽车启动了");
	}

	public void quicken() {
		System.out.println(brand + "品牌的汽车加速中");
	}

	public void sell() {
		System.out.println(brand + "品牌的汽车被以" + price + "元的价 格卖了");
	}
}
