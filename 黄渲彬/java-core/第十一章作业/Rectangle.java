package demo05;

public class Rectangle {
	int length;
	int width;
	public void move(){
		System.out.println("���������ƶ�");
	}
	public void change(){
		System.out.println("�������ڱ仯");
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
