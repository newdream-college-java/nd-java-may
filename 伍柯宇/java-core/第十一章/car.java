/*
 * 4、写一个汽车的类，类中有属性：品牌，价格，颜色。类中有方法：
（一）显示当前汽车对象的所有属性的方法toString。
（二）汽车启动的方法，要求输出“XX品牌的汽车启动了”。
（三）汽车加速的方法，要求输出“XX品牌的汽车加速中”。
（四）汽车被卖的方法，要求输出“XX品牌的汽车被以XX元的价格卖了”。
 * */
public class car {
	String brand = "大众";
	int price = 100000;
	String color = "白色";
	public String toString(){
		return brand+price+color;
	}
	public void start(){
		System.out.println(brand+"品牌的汽车启动了");
	}
	public void quicken(){
		System.out.println(brand+"品牌的汽车加速中");
	}
	public void sell(){
		System.out.println(brand+"品牌的汽车被以"+price+"元的价格卖了");
	}
}
