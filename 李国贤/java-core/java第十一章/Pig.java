
public class Pig {
	String varieties;
	String colour ;
	int aggressivity ;
	public void walk(){
		System.out.println(varieties+"品种的"+colour+"颜色的猪走来走去");
	}
	public void strike(){
		System.out.println(varieties+"品种的"+colour+"颜色的猪打人了，攻击力为："+ aggressivity);
	}
	public void eat(){
		System.out.println(varieties+"品种的"+colour+"颜色的猪吃得真多");
	}
	
	public String toString(){
		return varieties+"品种的"+colour+"颜色的猪";
	}
	public String animal(){
		return varieties;
	}
	public String pig(){
		return colour;
	}
	
}
