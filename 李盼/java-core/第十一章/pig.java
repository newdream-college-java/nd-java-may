
public class pig {
	String  breed = "小猪";
	String color = "白色";
	String atk = "100";
	public void run(){
		System.out.println(breed+"品种的"+color+"色的猪走来走去");
	}
	public void hit(){
		System.out.println(breed+"品种的"+color+"色的猪打人了，攻击力为"+atk);
	}
	public void eat(){
		System.out.println(breed+"品种的"+color+"色的猪吃得真多");
	}
	public String toString(){
		return breed+"品种的"+color+"色的猪攻击力为"+atk;
	}
	public String pinzhong(){
		return breed;
	}
	public String yanse(){
		return color;
	}

}
