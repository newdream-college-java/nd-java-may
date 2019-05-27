package demo05;

public class Rectangle {
	int length;
	int width;
	public void move(){
		System.out.println("长方形在移动");
	}
	public void change(){
		System.out.println("长方形在变化");
	}
	
	
	
	public int  kuan(){
		return width;
	}
	public int chang(){
		return length;
	}
	public int girth(){
		return 2*(length+width);
	}
	public int area(){
		return length*width;
	}

}
