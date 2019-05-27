package demo05;

public class Pig {
	String breed;
	String color;
	int agg;
	
	public void walk(){
		System.out.println(breed+"品种"+color+"颜色"+"的猪走来走去");
	}
	public void pigaggpeople(){
		System.out.println(breed+"品种"+color+"颜色"+"的猪打人了,攻击力"+agg);
	}
	public void pigcooked(){
		System.out.println(breed+"品种"+color+"颜色"+"的猪吃的真多");
	}
	public String toString(){
		return breed+color;
	}

}
