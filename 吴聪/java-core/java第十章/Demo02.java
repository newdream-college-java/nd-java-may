public class Demo02 {
	String type;
	String color;
	int atk;
	public void walk(){
		System.out.println(color+type+"走来走去");
	}
	public void hit(){
		System.out.println(color+type+"打人了,"+"攻击力为"+atk);
	}
	public void eat(){
		System.out.println(color+type+"吃得真多");
	}
	public String toString(){
		return type+color+atk;
	}
	public String tp(){
		return type;
	}
	public String cl(){
		return color;
	}
}
