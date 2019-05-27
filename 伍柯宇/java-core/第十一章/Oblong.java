
public class Oblong {
	int length;
	int width;
	
	public void move(){
		System.out.println("长方形在移动");
	}
	public void change(){
		System.out.println("长方形正在变化");
	}
	public void message(){
		System.out.println("长方形的长："+length+"长方形的宽："+width);
	}
	public int length_message(){
		return length;
	}
	public int width_message(){
		return width;
	}
	public int girth(){
		return (width+length);
	}
	public int area(){
		return width*length;
	}
}








