
public class Rectangle {
	int length;
	int wide;
	public void move(){
		System.out.println("长方形在移动");
	}
	public void change(){
		System.out.println("长方形正在变化");
	}
	public String toString(){
		return "长方形的长为"+length+"宽为"+wide;
	}
	public int a(){
		return length;
	}
	public int b(){
		return wide;
	}
	public int year(){
		return 2*(length+wide);
	}
	public int mianJi(){
		return length*wide;
	}
}
