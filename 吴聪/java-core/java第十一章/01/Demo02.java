public class Demo02 {
	String type;
	String color;
	int atk;
	public void walk(){
		System.out.println(color+type+"������ȥ");
	}
	public void hit(){
		System.out.println(color+type+"������,"+"������Ϊ"+atk);
	}
	public void eat(){
		System.out.println(color+type+"�Ե����");
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
