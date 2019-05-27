package demo05;

public class Carr {
	String brand;
	int much;
	String color;
	public String toString(){
		return brand+much+color;
	}
	public String pulseon(){
		return brand+"品牌的汽车启动了";
	}
	public String speed(){
		return brand+"品牌的汽车加速了";
	}
	public String Besold(){
		return brand+"品牌的汽车被以"+much+"元的价格卖了";
	}

}
