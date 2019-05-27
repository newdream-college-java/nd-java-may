
public class oblong {
	int tall = 10;
	int wide = 5;
	public void move(){
		System.out.println("长方形在移动");
	}
	public void change(){
		System.out.println("长方形在变化");
	}
	public void news(){
		System.out.println("长为"+tall+"宽为"+wide);
	}
	public int length(){
		return tall;
	}
	public int kuan(){
		return wide;
	}
	public int circumference(){
		return (tall+wide)*2;
	}
	public int area(){
		return 5*10;
	}
}
