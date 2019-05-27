
public class Pig {
	String kind;
	String color;
	int attack;
	public void Run(){
		System.out.println(kind+"品种的"+color+"颜色的猪走来走去。");
	}
	public void Hit(){
		System.out.println(kind+"品种的"+color+"颜色的猪打人了，攻击力为："+attack);
	}
	public void Eat(){
		System.out.println(kind+"品种的"+color+"颜色的猪吃的真多。");
	}
}
