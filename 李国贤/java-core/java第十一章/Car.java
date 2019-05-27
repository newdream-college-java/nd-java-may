
public class Car {
	String brand;
	int price;
	String colour;
	public String toString(){
		return "品牌是："+brand+"\t颜色是："+colour+"\t价格是："+price;
	}
	public void a(){
		System.out.println(brand+"品牌的汽车启动了");
	}
	public void b(){
		System.out.println(brand+"品牌的汽车加速中");
	}
	public void c(){
		System.out.println(brand+"品牌的汽车被以"+price+"元的价格卖了");
	}
}
